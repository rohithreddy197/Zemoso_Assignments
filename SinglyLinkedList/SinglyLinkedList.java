//This class is used to create a node and usually it points to head when created during insertion and deletion
class Node<T>{
	T data;
	Node<T> next;
	//constructor to assign values
	Node(T data){
		this.data = data;
		this.next = null;
	}
	//return the values over here
	public String toString(){
		if(data == null){
			return "null";
		}
		else {
			return data.toString();
		}
	}
}
//SList a generic class is used to create a head and also prints the elemets of list
class SList<T>{
	Node<T> head = new Node<T>(null);
	public String toString(){
		if(head.next == null){
			return "Insert something into list! Its empty now";
		}
		//Iterator obj to traverse through the list
		SListIterator<T> it = iterator();
		String s = "";
		while(it.hasNext()){
			s = s + it.next() + " -->";
		}
		return s+"END";
	}
	
	SListIterator<T> iterator(){
		return new SListIterator<T>(head);
	}
}
//SlistIterator has all the methods i.e hasnext,next,insert,delete
class SListIterator<T>{
	Node<T> curr;
	Node<T> head;
	public SListIterator(Node<T> head) {
		this.curr = head;
		this.head = head;
	}
	
	public boolean hasNext(){
		if(curr.next == null){
			return false;
		}
		else {
			return true;
		}
	}
	
	public Node<T> next(){
		curr = curr.next;
		return curr;
	}
	
	//O(1) to insert
	public void insert(T data) {
		System.out.println("Inserting "+data);
		curr.next = new Node<T>(data);
		curr = curr.next;
	}
	//O(n) to remove an element as we have to traverse through the entire list to remove
	public void remove(){
		Node<T> temp = head;
		//If list is empty cannot delete
		if(temp.next == null){
			System.out.println("List is empty. Nothing to delete from it");
			return ;
		}
		//Traverse through  the list and remove the last link
		while(temp.next.next != null){
			temp = temp.next;
		}
		curr = temp;
		System.out.println("Removing: "+temp.next.data);
		temp.next = null;
	}
	
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		SList<Integer> s1 = new SList<Integer>();
		SListIterator<Integer> it = s1.iterator();
		// print empty list
		System.out.println(s1); 
		//Insert into the list	
		it.insert(1);   	
		//Print the element. 1
		System.out.println(s1);
		//insert 2
		it.insert(2);
		//print 1,2		
		System.out.println(s1);
		//insert 3 into the list
		it.insert(3);
		//print 1,2,3
		System.out.println(s1);		
		//insert 3 from list
		it.remove();	
		//print 1,2
		System.out.println(s1);
		//remove 2
		it.remove();
		//print 1			
		System.out.println(s1);
		//insert 4 into the list
		it.insert(4);
		//print 1,4
		System.out.println(s1);
		//remove 4 from list
		it.remove();		
		//print 1	
		System.out.println(s1);
		//remove 1
		it.remove();	
		//print empty list
		System.out.println(s1); 	
		//remove from empty list
		it.remove();			
		//print empty list
		System.out.println(s1);		
	}
}
