import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node nextNode = new Node(data);
        if(head == null){
            System.out.println("head is null = "+nextNode.data);
            return nextNode;
        }else{
            Node current = head;
            while(head.next!= null){
                current = current.next;
                System.out.println("head is not null= "+head.next.data);
            }
            current.next=nextNode;
            return current;
        }
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}