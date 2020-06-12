import java.util.*;
import java.security.cert.X509Extension;

class calculate {
	private int firstNum;
	private int secondNum;
	Scanner inp = new Scanner(System.in);
	void setFirst (int x) {
		firstNum = x;
	}
	void setSecond(int y) {
		secondNum = y;
	}
	int getFirst () {
	 	return firstNum;
	}
	int getSecond() {
		return secondNum;
	}
}


class test {
	calculate p = new calculate();
	test() {
		int x = p.inp.nextInt();
		int y = p.inp.nextInt();
		p.setFirst(x);
		p.setSecond(y);
		System.out.println(p.getFirst()*p.getSecond());
	}
}



public class Main {
	public static void main(String[] args)	{
		test p1 = new test();
	}
}
