import java.util.Scanner;
public class App {
    int n, s = 0, j;
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("LE MINH TUAN");
        System.out.println("Trung binh cong so nguyen to <= n");
        System.out.print("Nhap so nguyen to < 0: ");
        n = s.nextInt();
    }
    void output(){
        System.out.print("TBC = (");
        for(int i = 2; i <= n; i++){
            if(kt_songuyento(i) == true){
                j++;
            System.out.print(i + "+");
            s += i;  
            }   
        }
        System.out.print("\b )/"+ j + " ="+ 1.0*s/j); 
    }
    boolean kt_songuyento(int x){
        if(x < 2)
        return false;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        App a = new App();
        a.input();
        a.output();
    }
}