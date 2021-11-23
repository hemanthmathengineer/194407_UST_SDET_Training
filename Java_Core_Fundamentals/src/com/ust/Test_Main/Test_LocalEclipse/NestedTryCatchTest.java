package com.ust.test;


public class NestedTryCatchTest {
   public static void main (String args[]) {
	   int a=10, b=0;
       int c=a/b;
	   
   try {	
	   		c=a/b;
            System.out.println(c);
         }  
	catch(ArrayIndexOutOfBoundsException e) 
   { 
			e.getStackTrace();
   }
   	catch(ArithmeticException e) 
   { 
			e.getStackTrace();
   }
   	catch(Exception e) 
   {
   			e.getStackTrace();
    }
   }
   
}

      
   

   
  

