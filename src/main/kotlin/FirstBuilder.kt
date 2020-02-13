import java.util.*

// TODO: decide what to do with eps
val eps = "EPS"

class FirstBuilder(
        private val rules: HashMap<String, ArrayList<ArrayList<Triple<String, String, String>>>>,
        private val terminals: Set<String>
) {
    val first = HashMap<String, HashSet<String>>()
    val mapToRule: HashMap<String, HashMap<String, Int>> = hashMapOf()

    init {
        rules.forEach { (key, _) ->
            first[key] = HashSet()
        }
    }

    private fun getFirst(value: List<String>): Set<String> {
        if (value.isEmpty()) {
            return hashSetOf(eps)
        }

        return if (isTerminal(value[0])) {
            hashSetOf(value[0])
        } else {
            val result = HashSet<String>(first[value[0]]!!.filter { it !== eps })

            if (first[value[0]]!!.contains(eps)) {
                result.addAll(getFirst(value.subList(1, value.size)))
            }

            result
        }
    }

    fun buildFirst() {
        var changed = true

        while (changed) {
            changed = false

            rules.forEach { (key, ruleList) ->
                val oldSize = first[key]!!.size

                for (rule in ruleList) {
                    first[key]!!.addAll(getFirst(rule.map { (fst, _, _) -> fst }))
                }

                changed = first[key]!!.size != oldSize || changed
            }
        }
    }

    private fun isTerminal(s: String): Boolean {
        return terminals.contains(s) || s == eps
    }

    fun buildMapToRule() {
        for (name in first.keys) {
            mapToRule[name] = hashMapOf()

            for (fst in first[name]!!) {
                for (i in rules[name]!!.indices) {
                    if (fst in getFirst(rules[name]!![i].map { (fst, _, _) -> fst })) {
                        mapToRule[name]!![fst] = i
                    }
                }
            }
        }
    }
}