package newp;

import java.util.Arrays;

public class TrialQ {

	public static void main(String[] args) {
	
		int a[]= {3,7,4,8,11,6};
		int temp;
         for(int i=0;i<=a.length-1;i++)
         {
        	 for(int j=i+1;j<=a.length-1;j++)
        	 {
        		 if(a[i]>a[j])
        		 {
        			temp=a[i]; 
        			a[i]=a[j];
        			a[j]=temp;
        		 }
        	 }
        	 
         }
         //3,4,6,7,8,11
         for(int k=0;k<=a.length-1;k++)
         {
        	if(k==a.length)
        	{
        		continue;
        	}
        	 if(a[k]+1==a[k+1] || a[k]+1==a[k+2] )
        	 {
        		 
        	 }
        	 else
        	 {
        		 System.out.println(a[k]+1);
        		// System.out.println(a[k]+2);
        	 }
         }

	}

}
