
import java.util.*;

// Node of a Linked List
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

// Linked List Class
public class Linked_list{

    Node head;
    Linked_list(){
        head=null;
    }

    // Insert Begining
    void insertbeg(int data){
        
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    // Insert Ending
    void insertend(int data){
        
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }

    // Insert Position
    void insertpos(int data,int pos){

        if(pos <= 0 || pos > length()+1){
            System.out.println("Invalid position");
        }
        else if(pos==1){
            insertbeg(data);
        }
        else if(pos==length()+1){
            insertend(data);
        }
        else{
            Node temp=new Node(data);
            Node ptr=head;
            int count=1;
            while(ptr.next!=null){
                if(count==pos-1){
                    temp.next=ptr.next;
                    ptr.next=temp;
                    break;
                }
                ptr=ptr.next;
                count++;
            }
        }
    }
    
    // Length
    int length(){
        Node ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }

    // Delete Begining
    void deletebeg(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            head=head.next;
        }
    }

    // Delete Ending
    void deleteend(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node ptr=head;
            if(ptr.next==null){
                head=null;
            }
            else{
                while(ptr.next!=null){
                    if(ptr.next.next==null){
                        ptr.next=null;
                        break;
                    }
                    ptr=ptr.next;
                }
            }
        }
    }

    // Delete Position
    void deletepos(int pos){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else if(pos <= 0 || pos > length()){
            System.out.println("Invalid position");
        }
        else{
            if(pos==1){
                deletebeg();
            }
            else if(pos==length()){
                deleteend();
            }
            else{
                int count=1;
                Node ptr=head;
                while(ptr.next!=null){
                    if(count==pos-1){
                        ptr.next=ptr.next.next;
                        break;
                    }
                    ptr=ptr.next;
                    count++;
                }
            }
        }
    }

    // Delete Element
    void deleteele(int data){
        Node ptr=head;
        int pos=1,flag=0;
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            while(ptr!=null){
                if(ptr.data==data){
                    deletepos(pos);
                    flag=1;
                    break;
                }
                ptr=ptr.next;
                pos++;
            }
            if(flag==0){
                System.out.println("Entered element not found");
            }
        }
    }

    // Display
    void display(){
        if(head==null){
            System.out.println("Linked list is empty.");
        }
        else{
            Node ptr=head;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String args[]){

        Linked_list l1=new Linked_list();
        Scanner sc=new Scanner(System.in);
        int c,data,pos;
        System.out.print("1.Insert Begining\n2.Insert Ending\n3.Insert Position\n4.Delete Begining\n5.Delete Ending\n6.Delete Position\n7.Delete Element\n8.Display\n9.Length\n10.Help\n11.Exit\n");
        while(true){
            System.out.print("Enter choice : ");
            c=sc.nextInt();
            switch(c){
                case 1 :    System.out.print("Enter data : ");
                            data=sc.nextInt();
                            l1.insertbeg(data);
                            break;
                case 2 :    System.out.print("Enter data : ");
                            data=sc.nextInt();
                            l1.insertend(data);
                            break;
                case 3 :    System.out.print("Enter data : ");
                            data=sc.nextInt();
                            System.out.print("Enter position : ");
                            pos=sc.nextInt();
                            l1.insertpos(data,pos);
                            break;
                case 4 :    l1.deletebeg();break;
                case 5 :    l1.deleteend();break;
                case 6 :    System.out.print("Enter position : ");
                            pos=sc.nextInt();
                            l1.deletepos(pos);
                            break;
                case 7 :    System.out.print("Enter element : ");
                            data=sc.nextInt();
                            l1.deleteele(data);
                            break;
                case 8 :    l1.display();break;
                case 9 :    System.out.println("Length : "+l1.length());break;
                case 10 :   System.out.print("1.Insert Begining\n2.Insert Ending\n3.Insert Position\n4.Delete Begining\n5.Delete Ending\n6.Delete Position\n7.Delete Element\n8.Display\n9.Length\n10.Help\n11.Exit\n");break;
                case 11 :   System.exit(0);
                default :   System.out.println("Entered wrong choice");
            }
        }

    }
}