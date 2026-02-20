
// OOPSBannerApp – Use Map for Character Patterns and Render via Function   
// This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts  
// such as the Collections Framework to manage character patterns in a more flexible  
// and efficient manner. The application retrieves and displays the "OOPS" banner  
// using a HashMap thereby enhancing code organization and modularity.    
// @author Developer  
// @version 8.0  


// Extend the User Story 7 to utilize advanced Object-Oriented Programming concepts  
// such as the Collections Framework to manage character patterns in a more flexible  
// and efficient manner. The application retrieves and displays the "OOPS" banner  
// using these mappings.

// Key Requirements:  
// 1. Use HashMap to store ASCII art patterns for characters  
// 2. Create methods to generate and retrieve character patterns  
// 3. Retrieve and display patterns for the message "OOPS"  
// 4. Implement modular and reusable character pattern system  
// 5. Utilize Collections Framework for pattern management


     // 1. Define a method createCharacterMap() to initialize a HashMap with character patterns
     // 2. Implement displayBanner(String message, HashMap<Character, String[]> charMap)
     //    to render the banner for the given message using the character map

import java.util.HashMap;
public class OOPSBannerApp{
     public static HashMap<Character, String[]> createCharacterMap() {
         HashMap<Character, String[]> charMap = new HashMap<>();
         // Populate charMap with patterns for 'O', 'S'
         charMap.put('O',new String[] {
				"   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
			});
        charMap.put('P', new String[] {
				"******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
			});
        charMap.put('S',new String[] {
				"   ***** ",
				" **      ",
				"**       ",
				" **      ",
				"   ***   ",
				"      ** ",
				"       **",
				"      ** ",
				" *****   "
			});
         return charMap;
     }

     // Example of method to display banner:
     public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
         // Loop through each line of the pattern height and build the banner line
         int patternHeight = charMap.get('O').length;
         for (int line = 0; line < patternHeight; line++) {
             StringBuilder sb = new StringBuilder();
             for (char ch : message.toCharArray()) {
                 String[] pattern = charMap.get(ch);
                 sb.append(pattern[line]).append(" "); // Adding space between characters
             }
             System.out.println(sb.toString());
         }
     }
     public static void main(String args[]){
        HashMap<Character,String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message,charMap);
     }
}
