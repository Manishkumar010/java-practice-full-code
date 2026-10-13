public class runner {

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.insertAtStart(0);
        list.insertAt(2,45);
        list.deleteAt(3);

        list.show();
    }
}
