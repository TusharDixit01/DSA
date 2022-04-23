/*package whatever //do not write package name here */

import java.io.*;

//LinkedList Creation
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        next=null;
    }
}

//main class
class GFG {
	public static void main (String[] args) {
		
		Node head=null;
		//insert at begin
		for(int i=0;i<5;i++)
		head=insertBegin(head,i);
		
		
		//insert at end
 		for(int i=0;i<3;i++)
		head=insertEnd(head,i);
		
		
		
	    
	    //delete first Node of LinkedList
	    head=deleteFirst(head);
	    
	    //delete last Node of LinkedList
	    head=deleteLast(head);

		
        //insertAtPostition 
 		head=insertAtPostition(head,2,5);
 		
 		
 		//searching an element in a LinkedList
 		System.out.println(searchKey(head,2));
		System.out.println(recursiveSearch(head,2,1));
		//traversing LinkedList
		traverseLL(head);
		
		
		System.out.println();
		
		
		//Recursive traversal of LinkedList
		recursive(head);
	}
	public static int searchKey(Node head,int key){
	    Node curr=head;
	    int pos=1;
	    while(curr!=null){
	        if(curr.data==key)
	        return pos;
	        curr=curr.next;
	        ++pos;
	    }
	    return -1;
	}
	public static int recursiveSearch(Node head,int key,int pos){
	    if(head!=null && head.data==key)
	    return pos;
	    if(head==null)
	    return 0;
	    return recursiveSearch(head.next,key,++pos);
	    
	}
	public static Node insertAtPostition(Node head,int pos,int data){
	    Node temp=new Node(data);
	    if(pos==1){
	        temp.next=head;
	        return temp;
	    }
	    Node curr=head;
	    for(int i=1;i<=pos-2 && curr!=null;i++)
	     curr=curr.next;
	    if(curr==null)
	    return head;
	    temp.next=curr.next;
	    curr.next=temp;
	    
	    return head;
	    
	     
	}
	public static Node deleteLast(Node head){
	    if(head==null || head.next==null)
	    return null;
	    Node curr=head;
	    while(curr.next.next!=null){
	        curr=curr.next;
	    }
	    curr.next=null;
	    
	    return head;
	}
	public static Node deleteFirst(Node head){
	    if(head==null)
	    return null;
	    
	    return head.next;
	    
	}
	public static Node insertEnd(Node head,int data){
	    Node curr=head;
	    Node temp=new Node(data);
	    if(curr==null)
	    return temp;
	    
	    while(curr.next!=null){
	        curr=curr.next;
	    }
	    curr.next=temp;
	    
	    return head;
	}
	public static Node insertBegin(Node head,int data){
	    Node temp=new Node(data);
	    temp.next=head;
	    return temp;
	}
	public static void recursive(Node head){
	    if(head==null)
	    return;
	    System.out.print(head.data+" ");
	    recursive(head.next);
	}
	public static void traverseLL(Node head){
	    Node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+" ");
	        curr=curr.next;
	    }
	}
}