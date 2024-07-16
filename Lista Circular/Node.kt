class Node<T> {
    var element: T ? = null
    var next: Node<T> ? = null

    constructor(element: T) {
        this.element = element
    }

    override fun toString(): String {
        return element.toString()
    }
}