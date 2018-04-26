public class SinglyLinkedList{
    private Node head;

    public SinglyLinkedList(){
    head = null;
    }
    public SinglyLinkedList add(int number){
        Node toAdd = new Node(number);
        if (head == null){
            head = toAdd;
            return this;
        }
        Node location = head;
        while (location.getNext() != null){
            location = location.getNext();
        }
        location.setNext(toAdd);
        return this;
    }
    public SinglyLinkedList remove(){
        if (head == null){
            return this;
        }
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        return this;
    }
    public void showValues(){
        Node current = head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}