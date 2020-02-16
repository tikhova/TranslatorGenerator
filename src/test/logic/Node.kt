package logic
            
data class Node(val name: String, val children: List<Node> = arrayListOf()) {
    
var value = false


    private fun getChildren(name: String): List<Node> {
        return children.filter{ it.name == name }
    }
    
    private val _tabulation = "...."

    fun getExpressionString(): String {
        val str = StringBuilder()
        if (children.isNotEmpty()) {
            for (i in children.indices) {
                val strAppend = children[i].getExpressionString()

                str.append(strAppend)
                if (strAppend.isNotEmpty()){
                    if (i != children.size - 1) {
                        str.append(" ")
                    }
                }
            }
        } else {
            if (name != "EPS")
                str.append(name)
        }

        return str.toString().trim()
    }

    fun printTree(tabulation: String = "") {
        if (children.isEmpty() && name != "EPS") {
            print("$tabulation[$name]")
            print("\n")
        } else {
            print(tabulation + name)
            print("\n")

            val newTabulation = tabulation + _tabulation

            for (element in children) {
                element.printTree(newTabulation)
            }
        }
    }
}