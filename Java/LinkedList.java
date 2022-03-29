import java.util.*;

public final class LinkedList<T> implements Iterable<T> {
  private Node<T> first = null;
  private Node<T> last = null;
  private int length = 0;

  public Node<T> getLast() {
    return this.last;
  }

  public Node<T> push(T data) {
    Node<T> node = new Node<>(this, data);
    node.setPrev(this.last);
    if (this.length == 0)
      this.first = node;
    else
      this.last.setNext(node);
    this.last = node;
    this.length++;
    return node;
  }

  public T pop() {
    if (this.length == 0)
      return null;
    Node<T> node = this.last;
    this.last = node.getPrev();
    if (this.last != null)
      this.last.setNext(null);
    node.setList(null);
    node.setPrev(null);
    node.setNext(null);
    this.length--;
    return node.getData();
  }

  public Iterator<T> iterator() {
    Node<T> last = this.last;
    return new Iterator<T>() {
      Node<T> currEl = last;

      @Override
      public boolean hasNext() {
        return currEl != null;
      }

      @Override
      public T next() {
        T data = currEl.getData();
        currEl = currEl.getPrev();
        return data;
      }
    };
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

    strList.push("One");
    strList.push("Two");
    strList.push("Three");

    for (String data : strList) {
      System.out.print(data + " ");
    }
    System.out.println();
  }

}