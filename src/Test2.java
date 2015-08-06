package src;

import java.util.HashMap;

public class Test2 {
	public static void main( String args[] )
	{
		String asd =  new String("342523");
		Integer	zxc		=	null;
		zxc				=	0;
		
		HashMap<String, Object> check		=		new HashMap<String, Object>();
		check.put( "one", null);
		System.out.println( check.get("one") == null );
		System.out.println( check.get("one").equals(null) );
		System.out.println( String.valueOf(check.get("one")).equalsIgnoreCase("null") );
		
		for( String qwe : asd.split(",") )
		{
			System.out.println( qwe );
			String response		=		String.join(",","","asd");
			System.out.println( response );
		}
		System.out.println( "Unstaged" );
		System.out.println( "Unstaged" );
		System.out.println(  "Unstaged 4" );
	}
}
