
import java.util.*;

public class Sortings{

    // Bubble Sort
    void bubbleSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                System.out.println(i+" ("+j+","+(j+1)+")"+" >> "+Arrays.toString(a)); 
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(a));
    }

    // Selection Sort
    void selectionSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n-1; i++){
            int min = i;
            System.out.println(i+" >> "+Arrays.toString(a));
            for (int j = i+1; j < n; j++){
                if (a[j] < a[min])
                    min = j;
            }
            if(min!=i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    // Merge Sort
    void mergeSort(int a[],int l,int r){
        if(l < r){
            int m=(l+r)/2;

            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);

        }
    }
    
    // Merging
    void merge(int a[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=a[l+i];
        for(int i=0;i<n2;i++)
            R[i]=a[m+1+i];
        
        int i=0,j=0,k=l;
        System.out.println("("+l+","+m+"),"+"("+(m+1)+","+r+")"+" >> "+Arrays.toString(a));
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
                k++;
            }
            else{
                a[k]=R[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    void quickSort(int a[],int low,int high){
        if(low < high){

            int pivot_index=partition(a,low,high);
            quickSort(a,low,pivot_index-1);
            quickSort(a,pivot_index+1,high);

        }
    }

    // Partition
    int partition(int a[],int low,int high){
        int i=low-1;
        int pivot=a[high];

        System.out.println("pivot - "+pivot+" ("+low+","+high+")"+" >> "+Arrays.toString(a));

        for(int j=low;j<high;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        System.out.println("pivot - "+pivot+"  at "+(i+1)+" >> "+Arrays.toString(a));

        return i+1;
    }

    // Main Function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Sortings s=new Sortings();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int b[]=arr.clone();

        System.out.println("Bubble sort");
        s.bubbleSort(arr);

        arr=b.clone();
        System.out.println("Selection sort");
        s.selectionSort(arr);

        arr=b.clone();
        System.out.println("Merge sort");
        s.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        arr=b.clone();
        System.out.println("Quick Sort");
        s.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}