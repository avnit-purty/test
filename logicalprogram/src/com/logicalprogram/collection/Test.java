package com.logicalprogram.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Test tt= new Test();
		/*
		 * List<String> s=Arrays.asList("anamyi","rahjfk","fgiopd"); List<String>
		 * result=s.stream().filter(li->!"anamyi".equals(li)).collect(Collectors.toList(
		 * )); result.forEach(System.out::println); }
		 */
		Test1 t=(a,b)->System.out.println(a+b);
	t.add(10, 20);
	Sub s=(a,b)->{
		return a-b;
		
		
	};
	t.hii();
Test1.say();

System.out.println(s.sub(30, 20));
	
}
}
interface Test1{
void add(int a,int b);
public static void say() {
	System.out.println(" hello say");
}
default void hii() {
	System.out.println(" default day");
}

}
interface Sub{
	int sub(int a,int b);
}
interface Mul{
	int mul(int a,int b);
}