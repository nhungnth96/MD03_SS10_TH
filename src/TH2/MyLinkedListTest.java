package TH2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("======TESTING======");
        MyLinkedList myLinkedList = new MyLinkedList(10); // 10
        myLinkedList.addFirst(11); // 11 - 10
        myLinkedList.addFirst(12); // 12 - 11 - 10
        myLinkedList.addFirst(13); // 13 - 12 - 11 - 10
        myLinkedList.add(4,9); // index 4 - 9 -> 13 - 12 - 11 - 10
        myLinkedList.add(4,9);
        myLinkedList.printList(); // 13 12 11 10 9 9
    }
}
