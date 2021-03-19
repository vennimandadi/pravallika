package com.java.lab1;

public class Fibannoci {
		static int n1 = 0, n2 = 1, temp = 0;
	   static void fib(int count)
	   {
	      if (count > 0) 
	      {
	         temp = n1 + n2;
	         n1 = n2;
	         n2 = temp;
	         System.out.print(" " + temp);
	         fib(count - 1);
	      }
	   }
	   public static void main(String args[])
	   {
	      int count = 8;
	      System.out.print(n1 + " " + n2);
	      fib(count - 2);
	   }

}
