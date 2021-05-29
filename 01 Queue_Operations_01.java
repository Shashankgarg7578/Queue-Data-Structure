package Queue_Data_Structure;

import java.util.Scanner;


public class Queue_Operations_01 
{
	static Scanner sc = new Scanner(System.in); 
    static int size , queue[];
    static int front = 0 , rear =0;
	
    //JVM first call this method then call the main method
   static 
   {
		Queue_Operations_01.creation();
   }
	
   //Create a Static size or Queue means a fixed size of queue
   static void creation()
   {
		System.out.print("Enter a size of Queue: ");
		size = sc.nextInt();
		queue = new int[size];
		System.out.println("Size of Queue is: "+size);
		
	}

   //insert elements in Queue
   static void inserted(int iteam)
   {
	   if(rear==size)
	   {
		   System.out.println("Queue is full");
	   }
	   else 
	   {
		   queue[rear] = iteam;
		   rear++;
	   }
   }
   
   //Delete elements in Queue
   static void deleted()
   {
	   if(front==rear)
	   {
	      System.out.println("Queue is empty");
	   }
	   else 
	   {
		   //showing deleted element
		 System.out.println("Deleted elements is: "+queue[front]);
	   
		 //shift all the queue elements in to the front side , because no need to shift front we only shift rear
		 for(int i=front ; i < size-1;i++)
		 {
			 queue[i]=queue[i+1];
		 }
		 // "rear--" because we shift all the elements and rear pointing to the last element so we shift the "rear" also 
		 rear--;
	   }
   }

   
   //Display the elements of Queue
   static void traverse()
   {
	   if(front==rear)
	   {
		   System.out.println("Queue is empty.");
	   }
	   else
	   {
		   
		   System.out.print("Elements are: ");
		   for(int i=front ; i<rear ; i++)
		   {
			   System.out.print(queue[i]+" ");
		   }
		   System.out.println();
	   }
   }
	
	public static void main(String[] args) 
   {
	   while(true)
		{
			int iteam;
			System.out.println();
			System.out.println("1.inserted");
			System.out.println("2.deleted");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			
			System.out.print("Enter your choice :-");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:  System.out.print("Enter a element :");
				     iteam = sc.nextInt();
				     Queue_Operations_01.inserted(iteam);
				    break;
			case 2: Queue_Operations_01.deleted();
				    break;
			case 3: Queue_Operations_01.traverse();
				    break;
			case 4: System.exit(1);
			default:System.out.println("Invalid Choice");
			}
		}	

   }
}
