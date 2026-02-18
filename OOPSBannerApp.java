/**
* OOPSBannerApp UC4
*
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console using array.
*
* @author Developer
* @version 4.0
*/



public class OOPSBannerApp
{
	public static void main(String[] args)
	{
		
		String arr[] = new String[9];
		arr[0] = String.join(" ","    ***   " , " " , "   ***    " , "******    " , "   *****  ");
		arr[1] = String.join(" ","  **   ** " , " " , " **   **  " , "**    **  " , " **       ");
		arr[2] = String.join(" "," **     **" , " " , "**     ** " , "**     ** " , "**        ");
		arr[3] = String.join(" "," **     **" , " " , "**     ** " , "**    **  " , " **       ");
		arr[4] = String.join(" "," **     **" , " " , "**     ** " , "******    " , "   ***    ");
		arr[5] = String.join(" "," **     **" , " " , "**     ** " , "**        " , "      **  ");
		arr[6] = String.join(" "," **     **" , " " , "**     ** " , "**        " , "       ** ");
		arr[7] = String.join(" ","  **   ** " , " " , " **   **  " , "**        " , "      **  ");
		arr[8] = String.join(" ","    ***   " , " " , "   ***    " , "**        " , " *****    ");
		
		for(String line : arr){
			System.out.println(line);
		}

	}
}

