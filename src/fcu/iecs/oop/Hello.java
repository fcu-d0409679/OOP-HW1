package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//��k�@
		/*String Her="\"her\"";
		
		String cant="Can\'t";
		
		System.out.println(lyrics.replaceAll("it", Her).replaceAll("Cannot",cant));*/
		
		
		
		//��k�G
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		
		lyrics=lyrics.replace("it","\"her\"" );//replaceAll=replace
		
		lyrics=lyrics.replace("Cannot","Can\'t");
		
		System.out.println(lyrics);
		
		
		
		
		//System.out.println("Hello FCU");

	}

}
