/*************Example***************
CLASS: Node.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
8-10-2023
TEAM:
IT PhoneBook
AUTHORS:
meshari al-harbi , (443102229)
saud al-dossaari (441102913)
Omar al-juwayr (443101385)

***********************************/
public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    } 

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next, Node<T> previous) {
        this.data = data; 
        this.next = next; 
        this.next = previous; 
    }



}