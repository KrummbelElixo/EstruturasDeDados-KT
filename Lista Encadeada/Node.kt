class Node<T> {
    var element: T? = null
    var next: Node<T>? = null

    constructor()

    constructor(elemento: T) {
        this.element = elemento
    }

    override fun toString(): String {
        return "${this.element}, ${this.next}"
    }
}