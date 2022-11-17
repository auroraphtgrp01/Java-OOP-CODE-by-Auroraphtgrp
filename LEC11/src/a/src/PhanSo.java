public class PhanSo {
    private int tu, mau;
    public PhanSo(){
        tu = 0; mau = 1;
    }
    public PhanSo(int m){
        tu = 1; mau = m;
    }
    public PhanSo(int t, int m){
        tu = t;
        mau = m;
    }
    public int getTu(){
        return tu;
    }
    public void setTu(int x){
        tu = x;
    }
    public int getMau(){
        return mau;
    }
    public void setMau(int x){
        mau = x;
    }
    public String toString(){
        return tu+"/"+mau;
    }
    public void rutGon(){
        if(tu*mau !=0){
            int t = uCLN(Math.abs(tu), Math.abs(mau));
            tu = tu/t;
            mau = mau /t;
        }
    }
    public PhanSo cong(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau + a.tu*mau;
        c.mau = mau*a.mau;
        c.rutGon();
        return c;
    }
    public PhanSo tru(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau - a.tu*mau;
        c.mau = mau*a.mau;
        c.rutGon();
        return c;
    }
    public PhanSo nhan(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.tu;
        c.mau = mau*a.mau;
        return c;
    }
    public PhanSo chia(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau;
        c.mau = mau*a.tu;
        a.rutGon();
        return c;
    }
    private int uCLN(int a, int b){
        while(a!=b)
            if(a>b) a-=b;
            else    b-=a;
            return a;
    }
    public static void main(String[] args) {
        PhanSo x = new PhanSo(1,2);
        PhanSo y = new PhanSo(3,4);
        System.out.println(x +" + "+y +" = "+ x.cong(y));
        System.out.println(x +" - "+y +" = "+ x.tru(y));
        System.out.println(x +" * "+y +" = "+ x.nhan(y));
        System.out.println(x +" / "+y +" = "+ x.chia(y));

    }
}