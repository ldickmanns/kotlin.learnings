package basics.dataStructures.trees

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

class Node(val data: Int) {
    public var left: Node? = null
    public var right: Node? = null

    companion object {
        fun buildTree(): Node {
            /** Let's create a tree */
            val root = Node(4);
            root.left = Node(2);
            root.left?.left = Node(1);
            root.left?.right = Node(3);
            root.right = Node(6);
            root.right?.left = Node(5);
            root.right?.right = Node(7);

            /************************
             * This is the result:  *
             ************************
             *           4          *
             *         /   \        *
             *        2     6       *
             *       / \   / \      *
             *      1  3  5  7      *
             ************************/

            return root;
        }
    }
}

fun main() {
    print(Node.buildTree().left)
}