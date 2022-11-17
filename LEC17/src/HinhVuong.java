public class HinhVuong {
    private double canh1;

    public double getcanh1() {
        return canh1;
    }

    public void setCanhHCN(double canh1) {
        this.canh1 = canh1;
    }

    public HinhVuong(double canh1) {
        this.canh1 = canh1;
    }

    public double dienTich(){
        double s=0;
        s=canh1*canh1;
        return s;
    }
    public double chuVi(){
        double p=0;
        p=canh1*4;
        return p;
        
    }
    
    public String toString() {
       
        return "HV ( " + canh1 + " ) S = "+dienTich()+" ; P = "+chuVi();
    }
    
    public static void main(String[] args) throws Exception {
        HinhVuong x = new HinhVuong(2);
        System.out.println(x);
    }
}
