package com.ust.test;
public class Main11 {

  String language;

  // constructor with no parameter
  Main11() {
    this.language = "Java";
  }

  // constructor with a single parameter
  Main11(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) {

    // call constructor with no parameter
    Main11 obj1 = new Main11();

    // call constructor with a single parameter
    Main11 obj2 = new Main11("Python");

    obj1.getName();
    obj2.getName();
  }
}
