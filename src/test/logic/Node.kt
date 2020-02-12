package logic
            
data class Node(val name: String, val children: List<Node> = arrayListOf()) {
    
var value = false


    private fun getChildren(name: String): List<Node> {
        return children.filter{ it.name == name }
    }
}