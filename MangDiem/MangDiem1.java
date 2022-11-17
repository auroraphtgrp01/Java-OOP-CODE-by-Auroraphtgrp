import java.util.*;
public class MangDiem1 {
    private ArrayList<DiemOxy> a = new ArrayList<DiemOxy>();
    public void input(){
        int n;
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap n > 0: ");
            n = kb.nextInt();
        }while(n<=0);
        for(int i = 1; i<=n; i++){
            System.out.print("Nhap diem "+i+":  ");
            int x = kb.nextInt();
            int y = kb.nextInt();
            a.add(new DiemOxy(x,y));
        }
    }
    public void xuat(String cauDan){
        System.out.print(cauDan);
//        for(int i = 0; i < a.size();i++)
//            System.out.print(a.get(i));
        for(DiemOxy x: a)
            System.out.print(x);
        System.out.println("");

    }
    public DiemOxy timGanTamNhat(){
        DiemOxy x = a.get(0);
        for(int i = 1; i < a.size(); i++)
            if(x.modul() > a.get(i).modul())
                x = a.get(i);
        return x;
    }
    public DiemOxy timXaTamNhat(){
        DiemOxy x = a.get(0);
        for(int i = 1; i < a.size(); i++)
            if(x.modul() < a.get(i).modul())
                x = a.get(i);
        return x;
    }
    public void khoangCachXaNhat(){
        DiemOxy x = a.get(0), y = a.get(1);
        for(int i=0; i < a.size(); i++){
            for(int j = i+1; j < a.size(); j++) {
                if(x.khoangCach(y) < a.get(i).khoangCach(a.get(j))){
                    x = a.get(i); x = a.get(j);
                }
            }
        }
        System.out.println("Max Khoang Cach: " + x + " " + y+ " = "+ x.khoangCach(y));
    }
    public double dienTich(DiemOxy x, DiemOxy y, DiemOxy z){
        double a = x.khoangCach(y), b = y.khoangCach(z), c = z.khoangCach(x), p = (a+b+c)/2;
        double d = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return d;
    }
    public boolean thangHang(DiemOxy x, DiemOxy y, DiemOxy z){
        double a = x.khoangCach(y), b = y.khoangCach(z), c = x.khoangCach(z);
        double C = (a*a + c*c - b*b)/(2*a*c);
        if(C > 0.999) C =1;
        if(C < -0.999) C = -1;
        if(C != 1 && C != -1)
            return true;
        return false;
    }
    public void t(){
        double t = dienTich(a.get(0), a.get(1),a.get(2));
        System.out.println(t);
    }
    public void tamGiacDienTichLonNhat() {
        DiemOxy x= a.get(0), y = a.get(1), z = a.get(2);
        double t = 0;
        for (int i = 0; i < a.size(); i++)
            for (int j = i + 1; j < a.size(); j++)
                for (int k = j + 1; k < a.size(); i++) {
                    t = dienTich(a.get(i), a.get(j), a.get(k));
                    if (thangHang(a.get(i), a.get(j), a.get(k)) == true)
                        break;
                }
        for (int i = 0; i < a.size(); i++) {
                for (int j = i + 1; j < a.size(); j++)
                    for (int k = j + 1; k < a.size(); k++) {
                        if (t < dienTich(a.get(i), a.get(j), a.get(k)))
                            if(thangHang(a.get(i), a.get(j), a.get(k))){
                                t = dienTich(a.get(i), a.get(j), a.get(k));
                                x = a.get(i);
                                y = a.get(j);
                                z = a.get(k);
                        }
                    }
        }
        System.out.println("Max tam giac: " + x + " " + y + " "+ z + " = " + dienTich(x,y,z));
    }
    public void xoaGocPhanTuIII(String cauDan){
        System.out.print(cauDan);
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).ox < 0 && a.get(i).oy < 0)
                System.out.print("");
            else System.out.print(a.get(i));
        }
    }
    public void sapXepModulTangDan(String cauDan){
        System.out.print(cauDan);
        for(int i = 0; i < a.size(); i++)
            for(int j = i+1; j < a.size(); j++)
                if(a.get(i).modul() > a.get(j).modul()){
                    DiemOxy x = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j, x);
                }
        for(int i = 0; i < a.size(); i++)
            System.out.print(a.get(i));
    }
    public void output(){
        System.out.println("PHAN TRAN THIEN AN");
        xuat("2. Cac diem: ");
        System.out.println("3. Min = " + timGanTamNhat() + " = "+ timGanTamNhat().modul());
        System.out.println("3. Max = " + timXaTamNhat() + " = "+ timXaTamNhat().modul());
        khoangCachXaNhat();
        tamGiacDienTichLonNhat();
        xoaGocPhanTuIII("sau xoa: ");
        sapXepModulTangDan("\ntang modul: ");
    }
    public static void main(String[] args) {
        MangDiem1 m = new MangDiem1();
        m.input();
        m.output();
    }
}