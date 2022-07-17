package learnings.kotlin.dataStructures.trees.binary.traversal

import learnings.kotlin.dataStructures.trees.binary.Node

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Pre-Order Traversal  *
 ************************/

fun preOrder(node: Node?): List<Node> {
    if (node == null) {
        return emptyList()
    }

    val list = mutableListOf(node)
    list.addAll(preOrder(node.left))
    list.addAll(preOrder(node.right))
    return list
}

fun main() {
    /** Let's do an example */
    val root = Node.buildTree()
    val result = preOrder(root)
    for (node in result) {
        print(node.data)
    } /** Output: 4213657 */

    result.forEach { print(it.data) }
    /** Output: 4213657 */
}
