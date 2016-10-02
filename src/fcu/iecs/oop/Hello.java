package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		
		String Her="\"her\"";
		
		String cant="Can\'t";
		
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		
		
		//lyrics.replaceAll("it", Her);//不知道為甚麼不能直接用
		
		System.out.println(lyrics.replaceAll("it", Her).replaceAll("Cannot",cant));
		
		//System.out.println("Hello FCU");

	}

}
