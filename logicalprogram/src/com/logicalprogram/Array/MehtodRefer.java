package com.logicalprogram.Array;

public class MehtodRefer {
public  void helloMessage() {
	System.out.println("hello abanti");
}
	public static void main(String[] args) {
          Test1 t= new MehtodRefer()::helloMessage;
          t.say();
          
	}

}
interface Test1{
	public void say();
	//public void hello();
}
