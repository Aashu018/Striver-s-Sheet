//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{   
    
    

public Node mergeTwoLists(Node l1, Node l2) {
    Node dummy = new Node(-1); // Create a dummy node to simplify the code
    Node current = dummy; // Initialize a current pointer to the dummy node

    // Compare and merge nodes from both lists until one of them becomes null
    while (l1 != null && l2 != null) {
        if (l1.data < l2.data) { // Replace 'val' with 'data'
            current.bottom = l1; // Merge l1 node
            l1 = l1.bottom; // Move to the next node in l1
        } else {
            current.bottom = l2; // Merge l2 node
            l2 = l2.bottom; // Move to the next node in l2
        }
        current = current.bottom; // Move the current pointer to the merged node
    }

    // Append the remaining nodes from l1 or l2, if any
    if (l1 != null) {
        current.bottom = l1;
    } else {
        current.bottom = l2;
    }

    return dummy.bottom; // Return the merged list starting from the first node (excluding the dummy node)
}

    
    Node flatten(Node root)
    {
	// Your code here
	
	if(root==null || root.next == null){
	    return root;
	}
	
	root.next = flatten(root.next);
	
	root = mergeTwoLists(root,root.next);
	
	return root;

    }
}