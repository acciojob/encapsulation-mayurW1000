package com.driver;

public class Main {
  public static void main(String args[]){
    RWOnly obj = new RWOnly();
    //obj.data = 15;
    obj.setName("shubham");
    System.out.println(obj.getName());
}
}