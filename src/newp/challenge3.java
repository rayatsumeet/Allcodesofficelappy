package newp;

public class challenge3 {

	public static void main(String[] args) {
		String a = "() () ()";
		char[] aa=   a.toCharArray();
	
		for (int i = 0; i <= aa.length - 1; i++) {
			for (int j = 0; j <= aa.length - 1; j++) {
				
				for (int k = 0; k <= aa.length - 1; k++) {
					
							if (aa[i] != aa[j] && aa[k] != aa[i] && aa[k] != aa[j] ) {
									System.out.println(aa[i] + " " + aa[j] + " " + aa[k]);

								}
							}
						}

					}
				}

			}
