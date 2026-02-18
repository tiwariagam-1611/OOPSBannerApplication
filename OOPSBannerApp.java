/**
* OOPSBannerApp UC5
*
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console using direct array initialization.
*
* @author Developer
* @version 5.0
*/



public class OOPSBannerApp
{
	public static void main(String[] args)
	{
		
		String lines[] = {
		String.join(" ","    ***   " , " " , "   ***    " , "******    " , "   *****  "),
		String.join(" ","  **   ** " , " " , " **   **  " , "**    **  " , " **       "),
		String.join(" "," **     **" , " " , "**     ** " , "**     ** " , "**        "),
		String.join(" "," **     **" , " " , "**     ** " , "**    **  " , " **       "),
		String.join(" "," **     **" , " " , "**     ** " , "******    " , "   ***    "),
		String.join(" "," **     **" , " " , "**     ** " , "**        " , "      **  "),
		String.join(" "," **     **" , " " , "**     ** " , "**        " , "       ** "),
		String.join(" ","  **   ** " , " " , " **   **  " , "**        " , "      **  "),
		String.join(" ","    ***   " , " " , "   ***    " , "**        " , " *****    ")
		};
		
		for(String line : lines){
			System.out.println(line);
		}

	}
}

