import java.io.File;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHangHoa {
    ArrayList<HangHoa> a = new ArrayList<HangHoa>();

    public void readFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.exists()) {
                System.out.println("File Availble! ");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ngaythang, nsx = "";
                    double dongia, soluong;
                    ma = line.next();
                    ngaythang = "";
                    while (!line.hasNextDouble()) {
                        ngaythang = line.next();
                    }
                    dongia = line.nextDouble();
                    soluong = line.nextDouble();
                    while (line.hasNext()) {
                        nsx = nsx + line.next() + " ";
                    }
                    if (nsx.trim().equalsIgnoreCase("nk") || nsx.trim().equalsIgnoreCase("tn")) {
                        a.add(new HangDienMay(ma, ngaythang, dongia, soluong, nsx));
                    } else
                        a.add(new HangThuCong(ma, ngaythang, dongia, soluong, nsx));
                }
            }
        } catch (Exception e) {

        }
    }

    

    public void printList(ArrayList y, String Title) {
        System.out.println(Title);
        for (Object x : y) {
            System.out.println(x);
        }
        System.out.println("");
    }

    
    public void Output() {

        // addList();
        // deleteList();
        // findHangHoa();
        printList(a, "IN DANH SACH HANG HOA !");
        // tinhTongTien();
    }

    public static void main(String[] args) {
        DSHangHoa x = new DSHangHoa();
        System.out.println("LE MINH TUAN");
        x.readFile("E:\\FileReader\\HangHoa_Lab07.txt");
        x.Output();
    }
}