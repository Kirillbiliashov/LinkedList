
public final class Node<T> {
  private LinkedList<T> list;
  private T data;
  private Node<T> prev;
  private Node<T> next;
  public Node(LinkedList<T> list, T data) {
    this.list = list;
    this.data = data;
    this.prev = null;
    this.next = null;
  }
  public T getData() {
    return this.data;
  }
  public Node<T> getPrev() {
    return this.prev;
  }
  public Node<T> getNext() {
    return this.next;
  }
  public void setPrev(Node<T> prev) {
    this.prev = prev;
  }
  public void setNext(Node<T> next) {
    this.next = next;
  }
  public void setList(LinkedList<T> list) {
    this.list = list;
  }
}
