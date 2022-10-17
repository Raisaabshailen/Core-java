package yyyy;

public class MethodBoolean {
	public static void main(String[]args) {
		int a = 1;
		int b =3;
		MethodBoolean p=new MethodBoolean();
		boolean value=p.sum(a, b);
        
        System.out.println(value);

	}
	public  boolean sum(int s,int t) {
	boolean l=s<t;
	return l;
 
}
}

