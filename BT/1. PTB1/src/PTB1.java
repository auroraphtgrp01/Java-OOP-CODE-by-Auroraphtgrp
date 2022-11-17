import java.util.Scanner;

public class PTB1 {

    int a, b;

    void input() {
        System.out.println("LE MINH TUAN - CHUONG TRINH GIAI PTB1 ");
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap A,B: ");
        a=in.nextInt();
        b=in.nextInt();
        }
    void Output()
    { 
        if(a==0) 
        { 
                System.out.println("PT VO NGHIEM");
        }
        else { 
            if(b==0)
            { 
                    System.out.println("PT VO SO NGHIEM");
            } else
            {   
                System.out.println("x= "+-b/a);
            }
        }
        

    }    
    public static void main(String[] args) throws Exception {
        PTB1 in1=new PTB1();
        in1.input();
        in1.Output();
    }
}
