import java.util.Scanner;
public class QUICKSORT {
    int A[] = new int [200];
    int N;
    Scanner ip = new Scanner(System.in);
    void Input()
    { 
        N = ip.nextInt();
        for(int i=0 ;i<N; i++ ) 
         {
            A[i]=ip.nextInt();
         }
    }
    void printArray(int A[], int N) {
        for(int i=0; i<N; i++) { 
            System.out.print(A[i]+" ");
        }
    }
    void quickSort(int A[], int l, int r){
        if(l>=r) return;
        int Pivot = A[(l+r)/2];
        int i=l, j=r;
        do{
            while(A[i]<Pivot) i++;
            while(A[j]>Pivot) j--;
            if(i<=j)
            {
                int Temp = A[i];
                A[i] = A[j];
                A[j] = Temp;
                i++;
                j--;
            }   
        } while(i<j);
        quickSort(A, l, j);
        quickSort(A, i, r);
    }
    void Output() {
        int l=0, r=N-1;
        quickSort(A, l, r);
        printArray(A, N);
    }

    public static void main(String[] args) throws Exception {
        QUICKSORT ip = new QUICKSORT();
        ip.Input();
        ip.Output();
    }
}
