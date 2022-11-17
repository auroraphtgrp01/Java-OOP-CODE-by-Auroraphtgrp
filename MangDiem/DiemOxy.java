
import java.util.Scanner;
public class DiemOxy {
    public int  ox, oy;

    public DiemOxy(int x, int y) {
        this.ox = x;
        this.oy = y;
    }
    public DiemOxy(){

    }
    public int getOx(){
        return ox;
    }
    public void setOx(int a){
        ox = a;
    }
    public int getOy(){
        return oy;
    }
    public void setOy(int a){
        oy = a;
    }
    public String toString(){
        return "("+ox+","+oy+")";
    }
    public double modul(){
        double M;
        M = Math.sqrt(ox*ox + oy*oy);
        return M;
    }
    public double khoangCach(DiemOxy b){
        double KC;
        KC = Math.sqrt(Math.pow(b.ox - ox,2) + Math.pow(b.oy - oy,2));
        return KC;
    }
    public void nhap(String cauNhac){
        System.out.print(cauNhac);
        Scanner kb = new Scanner(System.in);
        int x,y;
        x = kb.nextInt();
        y = kb.nextInt();
        ox = x;
        oy = y;
    }
    public static void main(String[] args){
        DiemOxy B = new DiemOxy();
        DiemOxy A = new DiemOxy();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap diem A: ");
        A.ox = s.nextInt();
        A.oy = s.nextInt();
        System.out.print("Nhap diem B: ");
        B.ox = s.nextInt();
        B.oy = s.nextInt();
        System.out.println("Modul diem A: "+ A.modul());
        System.out.println("Modul diem B:" + B.modul());
        System.out.println("Khoang cach A->B = " + A.khoangCach(B));
    }
}