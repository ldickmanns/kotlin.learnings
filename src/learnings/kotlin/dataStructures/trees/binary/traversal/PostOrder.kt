package learnings.kotlin.dataStructures.trees.binary.traversal

import learnings.kotlin.dataStructures.trees.binary.Node

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Post-Order Traversal  *
 ************************/

fun postOrder(node: Node?): List<Node> {
    if (node == null) {
        return emptyList()
    }

    val list = mutableListOf<Node>()
    list.addAll(postOrder(node.left))
    list.addAll(postOrder(node.right))
    list.add(node)
    return list
}

fun main() {
    /** Let's do an example */
    val root = Node.buildTree()
    val result = postOrder(root)
    for (node in result) {
        print(node.data)
    } /** Output: 1325764 */

    result.forEach { print(it.data) }
    /** Output: 1325764 */
}


