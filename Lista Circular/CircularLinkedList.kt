class CircularLinkedList<T>() {
    var node: Node<T> ? = null
    var lastNode: Node<T> ? = null

    fun add(element: T) {
        if(this.node == null) {
            this.node = Node<T>(element)
            this.lastNode = this.node
            return
        }

        this.lastNode?.next = Node<T>(element)
        this.lastNode = this.lastNode?.next
        this.lastNode?.next = this.node
    }

    fun get(index: Int): T? {
        if(index == 0) return this.node?.element

        var currentNode = this.node
        var count = 0

        while (count < index) {
            currentNode = currentNode?.next
            count++
        }

        return currentNode?.element
    }

    fun size(): Int {
        this.node ?: return 0

        var currentNode = this.node
        var count = 1

        while (currentNode != this.lastNode) {
            currentNode = currentNode?.next
            count++
        }

        return count
    }

    override fun toString(): String {
        var debug = "["
        var currentNode = this.node

        while (currentNode != this.lastNode) {
            debug += "${currentNode}, "
            currentNode = currentNode?.next
        }

        debug += "${this.lastNode}]"

        return debug
    }
}