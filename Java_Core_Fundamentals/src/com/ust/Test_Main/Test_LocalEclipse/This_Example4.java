package com.ust.test;
class Test__this
{
   int val_a;
   int val_b;
   Test__this()
    {
        val_a = 10;
        val_b = 20;
    }
 
   Test__this get() 
    {
        return this;
    }
 
   void display()
    {
         System.out.println("val_a = " + val_a + "  val_b = " + val_b);
    }
}
 
class This_Example4{
    public static void main(String[] args)
    {
        Test__this object = new Test__this();
        object.get().display();
    }
}



