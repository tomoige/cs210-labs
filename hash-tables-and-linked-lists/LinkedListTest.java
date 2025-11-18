import first.LinkedListJava;

public class LinkedListTest{
    public static void main(String[] args){
        LinkedListJava head = new LinkedListJava(1);
        LinkedListJava second = new LinkedListJava(2);
        head.setNext(second);
        LinkedListJava third = new LinkedListJava(3);
        second.setNext(third);
        LinkedListJava fourth = new LinkedListJava(4);
        third.setNext(fourth);

        printLinkedList(head);

        System.out.println(getListNode(head, 2).getValue());

        insertIntoLinkedList(head, 5);
        printLinkedList(head);
        insertIntoLinkedList(head, 6);
        printLinkedList(head);

        reverseLinkedList(head, null);

        LinkedListJava newHead = reverseLinkedList(head, null);
        System.out.println(newHead.getValue());
    }

    public static void printLinkedList(LinkedListJava head){
        LinkedListJava current = head;
        while(current != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static LinkedListJava getLastNode(LinkedListJava head){
        LinkedListJava current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    public static LinkedListJava getListNode(LinkedListJava head, int index){
        int currentIndex = 0;
        LinkedListJava current = head;
        while(currentIndex != index){
            current = current.getNext();
            currentIndex++;
        }
        return current;
    }

    public static void insertIntoLinkedList(LinkedListJava head, int value){
        LinkedListJava lastNode = getLastNode(head);
        LinkedListJava newNode = new LinkedListJava(value);
        lastNode.setNext(newNode);
    }

    public static LinkedListJava reverseLinkedList(LinkedListJava head, LinkedListJava prev){
        if(head.getNext() == null){
            head.setNext(prev);
            return head;
        }
        return reverseLinkedList(head.getNext(), head);
    }
}