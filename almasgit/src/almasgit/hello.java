package almasgit;

import java.util.Scanner;

public class hello {
public static void main(String[] args) {
	System.out.println("hello world");
	System.out.println("hellow");
	String str1 = "almas";
	String[] str = { "vivo", "sam" };
	System.out.println(str1);
	int i;
	for (i = 0; i < str.length; i++)
		System.out.println(str[i]);
	  if(str[0]=="vivo") { System.out.println("mobile is vivo");
	  }else if(str[1]=="sam") { System.out.println("mobile is sam");
	  }else { System.out.println("\n nothing to show");}
		
	  int k=0;
	  while(k>0)
	  {  System.out.println(k);
		 k--;
	  }
	  
	  do { System.out.println("do"+k);
		k--;
	  }while(k>0);
	  
	 /* int arr[]= {1,2,3,4};
	  arr[2]=20;
	  System.out.println(arr.length-1);
	  System.out.println(arr[2]);
	 
		for (i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.print(j+ " ");

			}
			//System.out.println(+i +"");

		}*/

	  
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int num=scan.nextInt();
		int val=num%2;	
	//	boolean boo=(val==0);
	
	String 	result= (num%2==0) ? "Even number..":"Odd Number...";
	System.out.println(result);
	
	//System.out.println((num%2==0)?"Even num....":"Odd num...");
	
}
}
