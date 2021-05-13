package newp;

import java.util.Scanner;

public class Chhalenge3 {

	   public static long BracketCombinations(int num) {
		      if (num <= 0) return 0;
		      long combi = nCr(2 * num, num);
		      return combi / (1 + num);
		  }

		    static long nCr(int n, int r) {
		        long top = fact(n);
		        long bottom1 = fact(r);
		        long bottom2 = fact(n - r);
		        return top / (bottom1 * bottom2);
		    }

		    static long fact(long num) {
		        if (num == 1) return 1;
		        else return num * fact(num - 1);
		    }


		  public static void main (String[] args) {  
		     
		    Scanner s = new Scanner(System.in);
		    System.out.print("enter input");
		    System.out.print(BracketCombinations(s.nextInt())); 
		  }	

}
