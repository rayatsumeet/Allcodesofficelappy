import java.util.ArrayList;
import java.util.Scanner;

public class Jumbeled {

	public static void main(String[] args) {
		String a = "Java is a programming language";
		String add = " ";
		int count = 0;
		Scanner sc = new Scanner(a);
		ArrayList<Object> array = new ArrayList<>();

		ArrayList<Object> array1 = new ArrayList<>();
		StringBuffer aa = new StringBuffer(a);
		aa.reverse();

		String b = aa.toString();
		b = b.replace(" ", "");
       
		System.out.println(b);
		array.add(b);

		while (sc.hasNext()) {
			int length = sc.next().length();

			

		}

		for (Object o : array) {
			System.out.print(o);
		}

	}

}
