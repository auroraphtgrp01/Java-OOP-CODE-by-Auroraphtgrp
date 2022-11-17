import java.util.Scanner;

public class PTB4 {
	double a, b, c, delta, t1, t2, x1, x2, x3, x4;

	void Input() {
		System.out.println("LE MINH TUAN ");
		System.out.println("Giai Ax^4 + Bx^2 + C = 0");
		System.out.println("Nhap he so a <> 0 : ");
		Scanner ip1 = new Scanner(System.in);
		a = ip1.nextDouble();
		System.out.println("Nhap he so b <> 0 : ");
		b = ip1.nextDouble();
		System.out.println("Nhap he so c <> 0 : ");
		c = ip1.nextDouble();
	}

	void Output() {
		delta = b * b - 4 * a * c;
		System.out.println(a+"x^4" + ((b>=0) ? "+" :"") + b+"x^2"+ ((c>=0) ? "+" : "")+c+"=0");
		if (delta == 0) {
			t1 = t2 = -b / (2 * a);
			if (t1 > 0) {
				x1 = Math.sqrt(t1);
				x2 = -x1;
				System.out.print(x1+" "+x2);
			} else {
				System.out.println("vo no");
			}
		} else if (delta < 0) {
			System.out.println("vo no");
		} else {
			t1 = (-b + Math.sqrt(delta)) / (2 * a);
			t2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			if (t1 > 0) {
				x1 = Math.sqrt(t1);
				x2 = -x1;
				System.out.print(x1+" "+x2);
			}
			if (t2 > 0) {
				x3 = Math.sqrt(t2);
				x4 = -x3;
				System.out.print(" "+x3+" "+x4);
				
			}
			if (t1 < 0 && t2 < 0) {
				System.out.println("vo no");
			}
		}
	}

	public static void main(String[] args) {
		PTB4 in = new PTB4();
		in.Input();
		in.Output();
	}
}
