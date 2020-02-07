import java.util.*

val eps = "eps"

class FirstFollowBuilder(
        private val start: String,
        private val rules: HashMap<String, ArrayList<ArrayList<String>>>,
        private val terminals: ArrayList<String>
) {
    val first = HashMap<String, HashSet<String>>()
    val follow = HashMap<String, HashSet<String>>()

    init {
        rules.forEach { (key, value) ->
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

                first[key]!!.addAll(getFirst(value))

                changed = first[key]!!.size != oldSize || changed
            }
        }
    }

    private fun isTerminal(s: String): Boolean {
        return terminals.contains(s) || s == eps
    }

    fun buildFollow() {
        follow[start]!!.add("$")

        var changed = true

        while (changed) {
            changed = false
            rules.forEach { (key, value) ->
                for (i in 0 until value.size) {
                    val currentValue = value[i]

                    if (!isTerminal(currentValue)) {
                        val oldSize = follow[currentValue]!!.size

                        var followingValue: String
                        for (j in i + 1 until value.size) {
                            followingValue = value[j]

                            if (terminals.contains(followingValue)) {
                                follow[currentValue]!!.add(followingValue)
                                break
                            }

                            follow[currentValue]!!.addAll(first[followingValue]!!.filter { it !== eps })

                            if (j == value.size - 1 && first[followingValue]!!.contains(eps)) {
                                follow[currentValue]!!.addAll(follow[key]!!)
                            }
                        }

                        changed = follow[value[i]]!!.size != oldSize || changed
                    }
                }
            }
        }
    }
}