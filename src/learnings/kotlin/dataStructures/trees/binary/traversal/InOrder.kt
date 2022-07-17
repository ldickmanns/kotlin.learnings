package learnings.kotlin.dataStructures.trees.binary.traversal

import learnings.kotlin.dataStructures.trees.binary.Node

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * In-Order Traversal  *
 ************************/

fun inOrder(node: Node?): List<Node> {
    if (node == null) {
        return emptyList()
    }

    val list = mutableListOf<Node>()
    list.addAll(inOrder(node.left))
    list.add(node)
    list.addAll(inOrder(node.right))
    return list
}

fun main() {
    /** Let's do an example */
    val root = Node.buildTree()
    val result = inOrder(root)
    for (node in result) {
        print(node.data)
    } /** Output: 1234567 */

    result.forEach { print(it.data) }
    /** Output: 1234567 */
}
