import java.util.*

// TO DO: decide what to do with eps
val eps = "getEps"

class FirstFollowBuilder(
        private val rules: HashMap<String, ArrayList<ArrayList<Triple<String, String, String>>>>,
        private val terminals: Set<String>
) {
    val first = HashMap<String, HashSet<String>>()
    val follow = HashMap<String, HashSet<String>>()
    val mapToRule: HashMap<String, HashMap<String, Int>> = hashMapOf()

    init {
        rules.forEach { (key, _) ->
            first[key] = HashSet()
            follow[key] = HashSet()
        }
    }

    private fun getFirst(value: List<String>): Set<String> {
        if (value.isEmpty()) {
            return HashSet()
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

            rules.forEach { (key, value) ->
                val oldSize = first[key]!!.size

                for (rule in value) {

                    first[key]!!.addAll(getFirst(rule.map { (fst, _) -> fst }))

                    changed = first[key]!!.size != oldSize || changed
                }
            }
        }
    }

    private fun isTerminal(s: String): Boolean {
        return terminals.contains(s) || s == eps
    }

    fun buildFollow() {
        var changed = true

        while (changed) {
            changed = false
            rules.forEach { (key, value) ->
                for (rule in value) {
                    for (i in 0 until rule.size) {
                        val currentValue = rule[i].first


                        if (!isTerminal(currentValue)) {
                            val oldSize = follow[currentValue]!!.size

                            var followingValue: String
                            for (j in (i + 1) until rule.size) {
                                followingValue = rule[j].first

                                if (terminals.contains(followingValue)) {
                                    follow[currentValue]!!.add(followingValue)
                                    break
                                }

                                follow[currentValue]!!.addAll(first[followingValue]!!.filter { it !== eps })

                                if (j == value.size - 1 && first[followingValue]!!.contains(eps)) {
                                    follow[currentValue]!!.addAll(follow[key]!!)
                                }
                            }

                            changed = follow[currentValue]!!.size != oldSize || changed
                        }
                    }
                }
            }
        }
    }

    fun buildMapToRule() {
        for (name in first.keys) {
            mapToRule[name] = hashMapOf()

            for (fst in first[name]!!) {
                for (i in rules[name]!!.indices) {
                    if (fst in getFirst(rules[name]!![i].map { (fst, _) -> fst })) {
                        mapToRule[name]!![fst] = i
                    }
                }
            }
        }
    }
}