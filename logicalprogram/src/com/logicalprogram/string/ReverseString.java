package com.logicalprogram.string;

public class ReverseString {

	public static void main(String[] args) {
		//1St way to reverse
            String s="abanti";
            char []ch=s.toCharArray();
            for(int i=ch.length-1;i>=0;i--) {
            	System.out.print(ch[i]);
            
            }
            System.out.println();
          //2nd way to revese	
        	StringBuilder bl= new StringBuilder();
        	bl.append(s);
        	bl.reverse();
        	System.out.println(bl);
        	//3rd way to reverse
        	String st="abanti purty";
        	String str="";
        	for(int i=st.length()-1;i>=0;i--) {
        		str=str+st.charAt(i);
        	}
        	System.out.println(str);
	}

}
