package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//方法一
		/*String Her="\"her\"";
		
		String cant="Can\'t";
		
		System.out.println(lyrics.replaceAll("it", Her).replaceAll("Cannot",cant));*/
		
		
		
		//方法二
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		
		lyrics=lyrics.replace("it","\"her\"" );//replaceAll=replace，而String是在記憶體改建一個新的字串
		
		lyrics=lyrics.replace("Cannot","Can\'t");//所以必須重新賦予 lyrics才會改變 lyrics內的值
		
		System.out.println(lyrics);
		
		
		
		
		//System.out.println("Hello FCU");

	}

}
