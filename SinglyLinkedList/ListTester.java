public class ListTester{
    public static void main(String[] args){
        SinglyLinkedList first = new SinglyLinkedList();
        first.add(10).add(15).add(5).add(25).add(20).add(50).add(40);
        first.showValues();
        first.remove();
        first.showValues();
        first.remove();
        first.showValues();
        first.add(9);
        first.showValues();
    }
}