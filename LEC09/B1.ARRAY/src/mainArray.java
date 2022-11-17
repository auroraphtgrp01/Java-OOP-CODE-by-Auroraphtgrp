import java.util.Scanner;

public class mainArray {
    int A[] = new int[9999];
    public int N, d = 0;

        void Input() {
            Scanner ip = new Scanner(System.in);
            do {
                System.out.print("Nhap N > 0 : ");
                N = ip.nextInt();
            } while (N <= 0);
            for (int i = 0; i < N; i++) {
                A[i] = (int) (Math.random() * 100);
            }
        }

    void Output(mainArray ip1) {
        // 1
        System.out.print("1. Mang vua tao ngau nhien : ");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        // 2
        System.out.println("2. MAX = " + MAX(A, N));
        // 3
        System.out.println("3. MAX - MIN = " + MAX(A, N) + " - " + MIN(A, N) + " = " + (MAX(A, N) - MIN(A, N)));
        // 4
        System.out.println("4. Tong 2 so lien tiep co tong lon nhat = " + nextSumMax(A, N));
        // 5
        B5(A, N);
        // 6
        B6(A, N);
        // 7
        B7(A, N);
        // 8
        B8(A, N);
        // 9
        B9(A, N);
        N++;
        // 10
        B10(A, N);
        N--;
        // 11
        B11(ip1, N);
    }

    // PROCESS METHOD
    void B5(int A[], int N) {
        System.out.print("5. Tong cac so chan: ");
        int S1 = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " + ");
                S1 += i;
            }
        }
        System.out.print("\b\b= " + S1);
        System.out.println();
    }

    void B6(int A[], int N) {
        double S1 = 0;
        System.out.print("6. TB cac so ngto = ( ");
        for (int i = 0; i < N; i++) {
            if (checkNgto(A[i])) {
                System.out.print(A[i] + " + ");
                d++;
                S1 +=(double) A[i];
            }
        }
        System.out.print("\b\b) = " + (S1 / d));
        System.out.println();
    }
//LEMINHTUAN
    void B7(int A[], int N) {
        int S1 = 0;
        System.out.print("7. Tong cac so doi xung = ");
        for (int i = 0; i < N; i++) {
            if (checkDX(A[i])) {
                System.out.print(A[i] + " + ");
                S1 += A[i];
            }
        }
        System.out.print("\b\b= " + S1);
        System.out.println();
    }

    void B8(int A[], int N) {
        System.out.print("8. Cac so co tong cac chu so > 10 : ");
        for (int i = 0; i < N; i++) {
            if (KT_NUMBER1(A[i])) {
                System.out.print(A[i] + " ");
            }
        }
        System.out.println();
    }

    void B9(int A[], int N) {
        int K, X;
        System.out.print("9. Nhap gia tri va chi so can chen: ");
        Scanner ip1 = new Scanner(System.in);
        X = ip1.nextInt();
        K = ip1.nextInt();
        Insert_K(A, N, X, K);
        System.out.println("Mang sau chen: ");
        OutputArr(A, N + 1);
        System.out.println();
    }

    void B10(int A[], int N) {
        int K;
        System.out.print("9. Nhap chi so can xoa: ");
        Scanner ip1 = new Scanner(System.in);
        K = ip1.nextInt();
        Delete_K(A, N, K);
        System.out.println("Mang sau xoa: ");
        OutputArr(A, N - 1);
        System.out.println();
    }

    void B11(mainArray ip1, int N) {
        Sort_Array(ip1, N);
        System.out.print("Mang sau sap xep : ");
        OutputArr(ip1.A, N);

    }

    // KTRA_SUM
    boolean KT_NUMBER1(int N) {
        int S = 0, K = 0;
        while (N != 0) {
            S = N % 10;
            K += S;
            N = N / 10;
        }
        if (K > 10)
            return true;
        else
            return false;
    }

    // FIND_MAX
    int MAX(int A[], int N) {
        int Max = A[0];
        for (int i = 0; i < N; i++) {
            if (A[i] > Max) {
                Max = A[i];
            }
        }

        return Max;
    }

    // FIND_MIN
    int MIN(int A[], int N) {
        int Min = A[0];
        for (int i = 0; i < N; i++) {
            if (A[i] < Min) {
                Min = A[i];
            }
        }
        return Min;
    }

    // FIND_SUMMAX
    int nextSumMax(int A[], int N) {
        int MAX = A[0]+A[1];
        for (int i = 0; i < N; i++) {
            if (MAX < A[i]+ A[i+1]) {
                MAX = A[i]+A[i+1];
            }
        }
        return MAX;
    }

    // CHECKNGTO
    boolean checkNgto(int N) {
        if (N <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    // CHECKDX
    boolean checkDX(int N) {
        int S = 0, K = 0, N1 = N;
        while (N != 0) {
            S = N % 10;
            K = K * 10 + S;
            N = N / 10;
        }
        if (N1 == K && K > 10)
            return true;
        else
            return false;
    }

    // INSERT_NUMBER
    void Insert_K(int A[], int N, int X, int K) {
        N++;
        for (int i = N; i > K; i--)
            A[i] = A[i - 1];
        A[K] = X;
    }

    // DELETE_NUMBER
    void Delete_K(int A[], int N, int K) {
        for (int i = K; i < N; i++)
            A[i] = A[i + 1];
        N--;
    }

    // SORT_ARRAY
    void Sort_Array(mainArray ip, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (ip.A[i] > ip.A[j]) {
                    int Temp = ip.A[i];
                    ip.A[i] = ip.A[j];
                    ip.A[j] = Temp;
                }
            }
        }
    }

    // PRINT_ARRAY
    void OutputArr(int A[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        mainArray ip = new mainArray();
        ip.Input();
        ip.Output(ip);
    }
}
