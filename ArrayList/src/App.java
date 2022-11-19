import java.util.*;
public class App {
    ArrayList<Integer> a = new ArrayList<>();
    void Input(){ 
        Scanner ip = new Scanner(System.in);
        int N;
        do { 
            System.out.print("Nhap phan tu mang ");
            N = ip.nextInt();
        }    while ( N <=0 );
        for(int i=0 ;i<N; i++ ) 
        { 
             int X=(int)(Math.random()*100);
             a.add(X);
        }
    }
    void Output() { 
        System.out.print("Mang vua tao ngau nhien: ");
        for(int i=0; i<a.size(); i++ ) 
         {
            System.out.print(a.get(i)+ " ");
           
         }
         System.out.print("");
    }
    void cau4() { 
        int s=a.get(0)+a.get(1);
        for(int i=1; i<a.size()-1; i++){ 
            if(s<a.get(i)+a.get(i+1)) {
                s=a.get(i)+a.get(i+1);
            }
        }
        System.out.println("4. Tong 2 so lien tuc lon nhat  = "+s);

    }
    public static void main(String[] args)  {
        App in = new App();
        in.Input();
        in.Output();
        in.cau4();
    }
}
