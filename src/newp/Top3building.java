package newp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Top3building {

	public static void main(String[] args) {
		System.out.print("enter eight  no between 1 to 1000");
		Scanner sc = new Scanner(System.in);
		int count=0;
		ArrayList<Integer> array= new ArrayList<>();
		for(int i=0;i<8;i++)
		{
			int num= 	sc.nextInt();
			
			array.add(num);
		}
		
		Collections.sort(array);
		
		for(int i=array.size()-1;i>0;i--)
		{
			if(count==3) {
			
			break;
			}
			
			else {
				System.out.println(array.get(i));
				count++;
			}
			
			
		}

		
	}

}
