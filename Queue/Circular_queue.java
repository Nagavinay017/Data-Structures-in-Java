
import java.util.*;

// Circular Queue implementation using array
// Circular Queue class
public class Circular_queue{

    int arr[];
    int size,front,rear;

    Circular_queue(int data){
        size=data;
        arr=new int[data];
        front=-1;
        rear=-1;
    }

    // Checks whether queue is empty or not
    boolean isempty(){
        if(rear==-1)
            return true;
        else
            return false;
    }

    // Checks whether queue is full or not
    boolean isfull(){
        if( (front==0 && rear==size-1) || (rear==front-1) )
            return true;
        else
            return false;
    }

    // Enqueue
    void enqueue(int data){
        if(isfull())
            System.out.println("Queue is full");
        else{
            if(front==-1)
                front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }
    }

    // Dequeue
    void dequeue(){
        if(isempty())
            System.out.println("Queue is empty");
        else{
            if(front==rear){
                System.out.println("Dequeued element is : "+arr[front]);
                front=rear=-1;
            }
            else{
                System.out.println("Dequeued element is : "+arr[front]);
                front=(front+1)%size;
            }
        }
    }

    // Display
    void display(){
        if(isempty())
            System.out.println("Queue is empty");
        else{
            for(int i=front;i!=rear;i=(i+1)%size){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[rear]);
            System.out.println();
        }
    }

    // Main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the Queue : ");
        int n=sc.nextInt();
        Circular_queue q1=new Circular_queue(n);
        int c,data;
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Help\n5.Exit");
        while(true){
            System.out.print("Enter choice : ");
            c=sc.nextInt();
            switch(c){
                case 1 :    System.out.print("Enter element : ");
                            data=sc.nextInt();
                            q1.enqueue(data);
                            break;
                case 2 :    q1.dequeue();break;
                case 3 :    q1.display();break;
                case 4 :    System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Help\n5.Exit");break;
                case 5 :    System.exit(0);
                default :   System.out.println("Entered wrong choice");
            }
        }


    }
}