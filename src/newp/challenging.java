package newp;

public class challenging {
//acc?7??sss?3rr1??????5"
	public static void main(String[] args) {
		String a = "acc?7??sss?3rr1??9";
	//	String a = "acc?t??sss?3rr1???9";
		int count = 0;
		int sum1=0;
		int sum2=0;
		int countquestion = 0;
		int beg = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
       
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
				count++;
				if (count == 1) {
					beg = i;
					sum1= Integer.parseInt(String.valueOf(a.charAt(i)));
					System.out.println(sum1);
					
					
				}
				if (count == 2) {
					
					int end = i;
					sum2= Integer.parseInt(String.valueOf(a.charAt(i)));
					System.out.println(sum2);
					
					if (sum1 + sum2 == 10) {
						
						for (int j = beg; j <= end; j++) {
							if (a.charAt(j) == 63) {
								countquestion++;
								if (countquestion == 3) {
									System.out.println("true");
									countquestion=0;
								}
								
							
							}
						}
						i=i-1;
					}
					
					else
					{
						System.out.println("sum is not 10");
						i=i-1;
					}
					count=0;
				}
			
			}
			  
		}
	}
}
