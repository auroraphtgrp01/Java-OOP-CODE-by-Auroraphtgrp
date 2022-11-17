import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangNguoi {
    private ArrayList<SV> a = new ArrayList<SV>();
    public void docFile(String tenFile){
        try{
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("Da mo duoc file");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    Scanner line = new Scanner(read.nextLine());
                    String ma,ht;
                    boolean gt;
                    double m1, m2;
                    ma = line.next();
                    ht = "";
                    while(!line.hasNextBoolean()) ht = ht + line.next() + " ";
                    gt = line.nextBoolean();
                    m1 = line.nextDouble();
                    m2 = line.nextDouble();
                    if(line.hasNext()) {
                        double m3 = line.nextDouble();
                        a.add(new CNTT(ma, ht, gt, m1, m2, m3));
                    }else a.add(new KinhTe(ma, ht, gt, m1, m2));
                }
            }else System.out.println("File khong ton tai");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for(SV x : a)
            System.out.println(x);
    }public int demSVCNTT(){
        int dem = 0;
        for(SV x : a)
            if(x instanceof CNTT)
                dem++;
        return dem;
    }
    public int demSVKT(){
        return a.size() - demSVCNTT();
    }
    public double diemTBChung(String tenNganh){
        double s = 0, dem = 0;
        for(SV x : a) {
            if (tenNganh.equalsIgnoreCase("cntt"))
                if (x instanceof CNTT) {
                    s = s + x.tinhDTB();
                    dem++;
                }
            if (tenNganh.equalsIgnoreCase("kt"))
                if (x instanceof KinhTe) {
                    s = s + x.tinhDTB();
                    dem++;
                }
        }
        if(dem == 0) return 0;
        return s/dem;

    }
    public SV svMaxDTB(){
        SV y = a.get(0);
        for(SV x : a)
            if(x.tinhDTB() > y.tinhDTB())
                y = x;
        return y;
    }
    public int demSVGioi(){
        int dem = 0;
        for(SV x : a)
            if(x.tinhDTB() >= 8 && x.tinhDTB() <9)
                dem++;
        return dem;
    }
    public SV maxDiemTBChung(String tenNganh){
        double s = 0, dem = 0;
        SV y = a.get(0);
        for(SV x : a) {
            if (tenNganh.equalsIgnoreCase("cntt"))
                if (x instanceof CNTT)
                    if(x.tinhDTB() > y.tinhDTB())
                        y = x;
            if (tenNganh.equalsIgnoreCase("kt"))
                if (x instanceof KinhTe )
                    if(x.tinhDTB() > y.tinhDTB())
                        y = x;
        }
        return y;
    }
    public void loaiSVCoDTBBeHonDTBC() {
        double d1 = diemTBChung("cntt");
        double d2 = diemTBChung("kt");
        int i = 0;
        while (i < a.size()) {
            if (a.get(i) instanceof CNTT && a.get(i).tinhDTB() < d1)
                a.remove(i);
            else if (a.get(i) instanceof KinhTe  && a.get(i).tinhDTB() < d2)
                a.remove(i);
            else i++;

        }
    }
    public void output(){
        xuat("Danh sach sinh vien: ");
        System.out.println("So sinh vien cntt: " + demSVCNTT());
        System.out.println("So sinh vien kt: " + demSVKT());
        System.out.println("Diem tbc cua sinh vien nganh cntt: " + diemTBChung("cntt"));
        System.out.println("Diem tbc cua sinh vien nganh kt: " + diemTBChung("kt"));
        System.out.println("Sinh vien co diem trung binh lon nhat: " + svMaxDTB());
        System.out.println("So sinh vien dat hoc luc gioi: " + demSVGioi());
        System.out.println("Sinh vien co diem trung binh lon nhat nganh cntt: " + maxDiemTBChung("cntt"));
        System.out.println("Sinh vien co diem trung binh lon nhat nganh kt: " + maxDiemTBChung("kt"));
        loaiSVCoDTBBeHonDTBC();
        xuat("Danh sach sinh vien sau khi loai: ");
    }
    public static void main(String[] args) {
        MangNguoi x = new MangNguoi();
        x.docFile("E:\\SVx.txt");
        x.output();
    }
}