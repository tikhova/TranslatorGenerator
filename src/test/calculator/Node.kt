package calculator
            
data class Node(val name: String, val children: List<Node> = arrayListOf(), var text: String = "") {
    
var value: Int? = null



    private fun getChildren(name: String): List<Node> {
        return children.filter{ it.name == name }
    }
    
    private val _tabulation = "...."

    fun getExpressionString(): String {
        val str = StringBuilder()
        if (children.isNotEmpty()) {
            str.append(children.map{it.getExpressionString()}.joinToString(" "))
        } else {
            str.append(text)                
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