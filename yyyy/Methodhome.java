package yyyy;

public class Methodhome {
	public static void main(String[]args) {
		int a=25;
		int b=25;
		int value= Methodgood.mult(a,b);
		System.out.println(value);
		
		
	}

}
class Methodgood{
	public static int mult(int n, int m) {
		return n*m;
		
	}
}