package first;

public class LinkedListJava{
    public LinkedListJava next = null;
    public int value;

    public LinkedListJava(){
        value = 0;
    }

    public LinkedListJava(int value){
        this.value = value;
        this.next = next;
    }

    public LinkedListJava(int value, LinkedListJava next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }

    public LinkedListJava getNext(){
        return this.next;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setNext(LinkedListJava next){
        this.next = next;
    }
}