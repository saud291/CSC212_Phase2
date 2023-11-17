/*************Example***************
CLASS: LinkedList.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
12-10-2023
TEAM:
IT PhoneBook
AUTHORS:
meshari al-harbi , (443102229)
saud al-dossaari (441102913)
Omar al-juwayr (443101385)

***********************************/
public class BST <T extends Comparable<T>>{
    private BSTNode<T> root;
    private BSTNode<T> current;

    public BST() {
        root = current = null; //1
    }

    public boolean empty() {
        return root == null; //1
    }

    public boolean full() {
        return false; //1
    }


    public T retrieve() {
        return current.data; //1
    }

    public void update(T data) {
        current.data = data; //1
    }

 /*
  * 
  * 
  */
  
    public boolean insert(String k, T val) {
    return false;
    	}
	public boolean search(T val) {//1
	return false;
	}
	
	public T remove(T val) {// remove node
return null;
	}
    
    
    
}