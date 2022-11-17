public class myHeart {
    public static void main(String[] args) throws Exception {
        int d=0;
        for(float y=2.5f;y>-2.0f;y-=0.12f){
            for(float x=-2.3f; x<2.3f; x+=0.041f){
                float a = x*x+y*y-4f;
                    if(a*a*a-x*x*y*y*y<-0.0f){
                        String S="I LOVE YOU!";
                        int N=d%S.length();
                        System.out.println(S.charAt(N));
                        d++;
                    }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
            Thread.sleep(100);
        }
        System.out.println("LE MINH TUAN");
    }
}
