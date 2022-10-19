package in.co.basicjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateprectice {
	public static void main(String[] args) throws ParseException {
		Date f = new Date();
		System.out.println(f);

		// Date formatting
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String str = sdf.format(f);
		System.out.println(str);

//		Parseing date into format
		String a = "2022";
		System.out.println(a);
		Date d1 = sdf.parse(a);
		System.out.println(d1);
	}
}
