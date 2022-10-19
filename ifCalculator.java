package in.co.basicjava;

public class ifCalculator {
public static void main(String[]args) {
	int a=10;
	int b=20;
	
	char s='+';
	if(s=='+') {
		System.out.println(a+b);
	}else if(s=='/') {
		System.out.println(a/b);
	}else if (s=='*') {
		System.out.println(a*b);
	}else if (s=='-') {
		System.out.println(a-b);
	}else if (s=='%') {
		System.out.println(b%a);
	}else {System.out.println("plese Eneter currect opretor");}
}
}
