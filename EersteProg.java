import java.lang.*;

/**
* De klasse EersteProg is een Java applicatie
*
* @author Dorien Vanermen
* @version 1.5
*/

public class EersteProg
{
	public static void main( String args[])
	{
		drukaf(100);
	}

	private static void drukaf(int m)
	{
		int a; 
		for (a = 0; a < m; a++)
			{
				System.out.println(a);
			}
	}
}