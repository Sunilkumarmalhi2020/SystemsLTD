package Assingments;

import java.util.Arrays;
import java.util.Scanner;

public class ResizableArray {

	public static void main(String arg[]){
		int[] ary=new int[3];
		Scanner obj=new Scanner(System.in);
		
		for(int i=0;i<ary.length;i++)
		{
			System.out.println("enter number : ");
			ary[i]=obj.nextInt();
			if(ary[i]==0)break;
			else if((ary.length-1)==i)
				{
					int[] ary1=ary;
					ary=new int[ary.length*2];
					for(int j=0;j<ary1.length;j++)
						ary[j]=ary1[j];
				}

		}// end of for loop....
		System.out.println("...............................");
		Arrays.sort(ary);
		System.out.println("size : "+ary.length);
		//enhance for loop
		for(int j:ary){
			System.out.println(j);
		}
		
	}
}
