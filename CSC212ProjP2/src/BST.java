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
    public void findRoot() {
    	current = root;
    }
    public BSTNode<T> getRoot(){
    	return root;
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
    public boolean findkey(String tkey) {
    	BSTNode<T> p = root,q = root;
    	if(empty())
    	return false;
    	while(p != null) {
    	q = p;
    	if(p.key.compareTo(tkey) == 0) {
    	current = p;
    	return true;
    	}
    	else if(tkey.compareTo(p.key) < 0)
    	p = p.left;
    	else
    	p = p.right;
    	}
    	current = q;
    	return false;
    	}
    public Contact searchbyName(String tkey) {
    	BSTNode<T> p = root,q = root;
    	if(empty())
    	return null;
    	while(p != null) {
    	q = p;
    	if(p.key.compareTo(tkey) == 0) {
    	current = p;
    	return (Contact) current.data;
    	}
    	else if(tkey.compareTo(p.key) < 0)
    	p = p.left;
    	else
    	p = p.right;
    	}
    	current = q;
    	return null;
    	}
  
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