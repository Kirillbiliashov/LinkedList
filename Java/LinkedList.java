
public final class LinkedList<T> {
  private Node<T> first = null;
  private Node<T> last = null;
  private int length = 0;

  public Node<T> push(T data) {
    Node<T> node = new Node<>(this, data);
    node.setPrev(this.last);
    if (this.length == 0) this.first = node;
    else this.last.setNext(node);
    this.last = node;
    this.length++;
    return node;
  }

  public T pop() {
    if (this.length == 0) return null;
    Node<T> node = this.last;
    this.last = node.getPrev();
    if (this.last != null) this.last.setNext(null);
    node.setList(null);
    node.setPrev(null);
    node.setNext(null);
    this.length--;
    return node.getData();
  }
  public static void main(String[] args) {
    LinkedList<String> strList = new LinkedList<>();
    strList.push("first");
    strList.push("second");
    strList.push("third");
    System.out.println(strList.pop());
    System.out.println(strList.pop());
    System.out.println(strList.pop());
    System.out.println(strList.pop());
    strList.push("Uno");
    strList.push("Due");
    System.out.println(strList.pop());
    strList.push("Tre");
    System.out.println(strList.pop());
    System.out.println(strList.pop());
  }
}