import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangNguoi {
    public ArrayList<People> a = new ArrayList<People>();

    public boolean check_ReadFile(){
                boolean check = false;
                File f = new File("E:\\People.txt");
                if (f.exists()) return check = true;
            return false;
       }    


    public void readFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                System.out.println("File Availble !");
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String masv, hoten;
                    String ngaysinh = null;
                    String monhoc = null;
                    boolean gioitinh;
                    double m1, m2, m3, gio, gia;

                    masv = line.next();
                    hoten = "";
                    monhoc = "";
                    while (!line.hasNextBoolean()) {
                        hoten += line.next() + " ";
                    }
                    gioitinh = line.nextBoolean();
                    ngaysinh = line.next();
                    if (line.hasNextDouble()) {
                        m1 = line.nextDouble();
                        m2 = line.nextDouble();
                        m3 = line.nextDouble();
                        a.add(new Students(masv, hoten, ngaysinh, gioitinh, m1, m2, m3));
                    } else {
                        while (!line.hasNextDouble())
                            monhoc += line.next() + " ";
                        gio = line.nextDouble();
                        gia = line.nextDouble();
                        a.add(new Teachers(masv, hoten, ngaysinh, gioitinh, monhoc, gio, gia));
                    }
                }
            }

        } catch (Exception e) {

        }
    }

    public void printStu() {
        for (People x : a) {
            if (x instanceof Students) {
                System.out.println(x);
            }
        }
    }

    public void printTea() {
        for (People x : a) {
            if (x instanceof Teachers) {
                System.out.println(x);
            }
        }
    }

    public void printList(String Title) {
        System.out.println(Title);
        for (People x : a) {
            System.out.println(x);
        }
    }

    public Students findAverage() {
        Students x = null;
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) instanceof Students) {
                x = (Students) a.get(i);
                break;
            }
        }

        for (; i < a.size(); i++) {
            if (a.get(i) instanceof Students) {
                if (((Students) a.get(i)).tinhDTB() > x.tinhDTB()) {
                    x = (Students) a.get(i);
                }
            }
        }
        return x;
    }

    public double findAverageSex(boolean gt) {
        double s = 0;
        int d = 0;
        for (People x : a) {
            if (x instanceof Students)
                if (x.isGioiTinh() == gt) {
                    s += ((Students) x).tinhDTB();
                    d++;
                }
        }
        return s / d;
    }

    public double tinhTBC() {
        double s = 0;
        int d = 0;
        for (People x : a) {
            if (x instanceof Students) {
                s += ((Students) x).tinhDTB();
                d++;
            }
        }
        return s / d;
    }

    public void removeStu() {
        double trungBinh = tinhTBC();

        int i = 0;

        while (i < a.size()) {
            if ((a.get(i) instanceof Students) && (((Students) a.get(i)).tinhDTB() < trungBinh)) {
                a.remove(i);
            } else
                i++;
        }
        printList("DS sau khi loai bo: ");
    }

    public Teachers findMinTea() {
        Teachers x = null;
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) instanceof Teachers) {
                x = (Teachers) a.get(i);
                break;
            }
        }

        for (; i < a.size(); i++) {
            if (a.get(i) instanceof Teachers) {
                if (((Teachers) a.get(i)).tienDay() < (((Teachers) x).tienDay())) {
                    x = (Teachers) a.get(i);
                }
            }
        }

        return x;
    }

    public double sumTienDay() {
        double s = 0;
        int d = 0;
        for (People x : a) {
            if (x instanceof Teachers) {
                s += ((Teachers) x).tienDay();
            
            }
        }
        return s ;
    }

    public void Output() {
        System.out.println("Cau 1. "+(check_ReadFile()?"File Availble !":"File Not Found ! "));
        System.out.println("");

        System.out.print("Cau 2. ");
        printList("DS GIAO VIEN VA SINH VIEN ");
        System.out.println("");

        System.out.println("Cau 3. DS SINH VIEN: ");
        printStu();
        System.out.println("");

        System.out.println("Cau 4. DS GIAO VIEN: ");
        
        printTea();
        System.out.println("");

        System.out.println("Cau 5. Sinh vien co diem cao nhat la : ");
        System.out.println(findAverage());
        System.out.println("");
        System.out.println("Cau 6. Diem Trung Binh Chung Theo Gioi Tinh: ");
        System.out.println("Nam: " + findAverageSex(true));
        System.out.println("Nu: " + findAverageSex(false));
        System.out.println("");
        System.out.println("Cau 7. Loai sinh vien : ");
        removeStu();
        System.out.println("");

        System.out.println("Cau 8. Giang Vien day co tien day thap nhat la: ");
        System.out.println(findMinTea());
        System.out.println("");

        System.out.println("Cau 9. Tong tien day cua GV la : "+sumTienDay());
    }

    public static void main(String[] args) {
        MangNguoi x = new MangNguoi();
        x.readFile("E:\\People.txt");
        x.Output();
    }
}
