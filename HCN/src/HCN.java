
public class HCN {
    public HCN() {
    }

    private double a, b, c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public HCN(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double dientichDay() {
        double sd = 0;
        sd = a * b;
        return sd;
    }

    public double dientichXungQuanh() {
        double sxq = 0;
        sxq = 2 * c * (a + b);
        return sxq;
    }

    public double dientichToanPhan() {
        double stp = 0;
        stp = 2 * c * (a + b) + 2 * a * b;
        return stp;
    }

    public double thetichHCN() {
        double V = 0;
        V = a * b * c;
        return V;
    }

    public String toString() {
        return "a = " + a + " ; " + "b = " + b + " ; h = " + c
                + " ; ( Sday = " + dientichDay() + " , Sxung quanh =  " + dientichXungQuanh()
                + " , Stp = " + dientichToanPhan() + " , Vhcn = " + thetichHCN()+" ) ";
    }

    public static void main(String[] args) {
        HCN a = new HCN(1, 2, 3);
        System.out.println(a);
    }
}
