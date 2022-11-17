import java.util.Scanner;
public class BINARY_SEARCH {
    int A[] = new int [200];
    int N,X;
    void Input(){
        Scanner ip = new Scanner(System.in);
        System.out.println("NHAP N: ");
        N = ip.nextInt();
        System.out.println("NHAP X: ");
        X = ip.nextInt();
        for(int i=0; i<N ;i++ ) 
         {
            A[i] = ip.nextInt();
         }
    }
    void printArray(int A[], int N) { 
        for(int i=0 ;i<N; i++ ){
            System.out.print(A[i]+" ");
        }
    }
    void sortArray(int A[], int N)
    {
        for(int i=0; i<N; i++) { 
            for(int j=i+1; j<N ; j++ ) {
                if(A[i]>A[j])
                { 
                    int Temp = A[i];
                    A[i]=A[j];
                    A[j]=Temp;
                }
            }
        }
    }
    int Binary_Search_void(int A[], int N, int X)
    {
        int l=0;
        int r=N-1;
        while(r>=1)
        { 
            int mid = (l+(r-1))/2;
            if(A[mid]==X) return mid;
            if(A[mid]>X) r = mid - 1;
            if(A[mid]<X) l= mid +1;
        }
    return -1;
    }
    void Output()
    { 
        sortArray(A, N);
        printArray(A, N);
        int S=Binary_Search_void(A, N, X);
        System.out.println("Ki tu "+X+" xuat hien tai vi tri "+S);
    }
    public static void main(String[] args) {
        BINARY_SEARCH in = new BINARY_SEARCH();
        in.Input();
        in.Output();
    }
}
