package com.logicalprogram.collection;

public class Inter  implements Testlass{
	public static void main(String[] args) {
		Testlass ts= new Inter();
		ts.say("maa");
		
	}

	@Override
	public void say(String s) {
		System.out.println(" hello say");
		
	}


}
interface Testlass{
	void say(String s);
	
}
