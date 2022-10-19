package in.co.basicjava;

;

public class Methodcalling {
	
	public static void main(String[] args) {
		int a=3;
		int b = 7;
		
	//	Methodcalling1 aa=new Methodcalling1();
		int value =Methodcalling1.mult(a,b);
	System.out.println(value);
	}
		

}
class Methodcalling1{
	public static int mult(int n, int m) {
		return n*m;
		
	
	
}
}