class LinkedList<T> {
    var node: Node<T>? = null

    fun add(element: T) {
        if(this.node == null) {
            this.node = Node(element)
        } else {
            var node = this.node

            while(node?.next != null) {
                node = node.next
            }

            node?.next = Node(element)
        }
    }

    fun remove(index: Int) {
        if(index == 0) {
            this.node = this.node?.next
            return
        }

        var count = 1
        var prevNode: Node<T> ? = null
        var currentNode = this.node

        while(count <= index) {
            prevNode = currentNode
            currentNode = currentNode?.next
            count++
        }

        currentNode ?: throw IndexOutOfBoundsException()

        prevNode?.next = currentNode.next
    }

    fun clear(): Boolean {
        return if (this.node == null) {
            false
        } else {
            this.node = null
            true
        }
    }

    fun get(index: Int): T? {
        var count = 1
        var node = this.node

        while(count <= index) {
            node = node?.next
            count++
        }

        node ?: throw IndexOutOfBoundsException()

        return node.element
    }

    fun size(): Int {
        if(this.node == null) {
            return 0
        }

        var count = 1
        var node = this.node

        while(node?.next != null) {
            node = node.next
            count++
        }

        return count
    }

    fun isEmpty(): Boolean {
        return this.size() == 0
    }

    override fun toString(): String {
        return "[${node}]"
    }
}