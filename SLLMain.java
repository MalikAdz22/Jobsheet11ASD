public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();
        myLinkedList.insertAt(2, 900);
        myLinkedList.print();

        if(myLinkedList.checkIndex(10)){
            System.out.println("Data pada index ke-1: " + myLinkedList.getData(10));
        }
        System.out.println("Data 300 berada pada index ke:kontol "+ myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
        
        myLinkedList.insertBefore(1, 404);
        myLinkedList.print();
        myLinkedList.insertAt(0, 120);
        myLinkedList.print();
        myLinkedList.removeAt(1);
        myLinkedList.print();
    }
}
