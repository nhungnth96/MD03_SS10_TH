package TH2;


public class MyLinkedList {
    private int numNodes;
    private Node head;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

    }
    // thêm đối tượng vào vị trí thứ i
    public void add(int index,Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1&&temp.next!=null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    // thêm đối tượng vào vị trí đầu tiên
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    // lấy phần tử ở vị trí i
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    // hiển thị danh sách các phần tử
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
