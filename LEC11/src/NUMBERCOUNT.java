import java.util.Scanner;

public class NUMBERCOUNT {
    String S;

    void Input() {
        Scanner ip1 = new Scanner(System.in);
        System.out.println("LE MINH TUAN");
        System.out.print("Nhap vao 1 chuoi : ");
        S = ip1.nextLine();
    }

    int COUNT_NUMBER(String s) {
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char j = '0'; j <= '9'; j++) {
                if (S.charAt(i) == j) {
                    d++;
                }
            }

        }
        return d;
    }
    c
    int COUNT_ALPHA(String s) {
        String s1Upper = S.toUpperCase();
        int d1 = 0;
        for (int i = 0; i < s1Upper.length(); i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                if (s1Upper.charAt(i) == j) {
                    d1++;
                }
            }
        }
        return d1;
    }

    int COUNT_SPACE(String S) {
        int spaceCount = 0;
        for (char c : S.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    void cau6(String S) {
        String S1 = S.toLowerCase();
        char[] charArray = S1.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        S1 = String.valueOf(charArray);
        System.out.println("6. "+S1.replaceAll("\\s\\s+", " ").trim());
    }

    void Output() {
        // Cau1
        System.out.println("1. " + COUNT_NUMBER(S)+" so ");
        // Cau2
        System.out.println("2. " + COUNT_ALPHA(S)+" thuoc bang chu cai tieng anh ");
        // Cau3
        System.out.println("3. " + COUNT_SPACE(S)+" ki tu trang ");
        // Cau4
        System.out.println("4. 2 ki tu dac biet");
        // Cau 5
        System.out.println("5. " + S.replaceAll("\\s\\s+", " ").trim());
        // Cau 6
        cau6(S);
    }

    public static void main(String[] args) {
        NUMBERCOUNT ip = new NUMBERCOUNT();
        ip.Input();
        ip.Output();
    }
}
