
// \*  
// * OOPSBannerApp UC7 – Store Character Pattern in a Class  
// *  
// * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate  
// * character-to-pattern mappings. The application retrieves and displays the "OOPS"  
// * banner using these mappings. This approach enhances code organization and modularity.  
// *  
// * @author Developer  
// * @version 7.0  
// */

// Extend the User Story 6 to implement a CharacterPatternMap class to encapsulate  
// character-to-pattern mappings. The application retrieves and displays the "OOPS"  
// banner using these mappings. Thereby addressing the drawback of not having  
// centralized character pattern management system.

// Key Requirements:  
// 1. Create CharacterPatternMap class to hold character and its pattern  
// 2. Implement methods to create and retrieve character patterns  
// 3. Use CharacterPatternMap to display the "OOPS" banner  
// 4. Implement modular and reusable character pattern management


public class OOPSBannerApp {
    static class CharacterPatternMap {
		public static String[] getOPattern() {
			return new String[] {
				"   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
			};
		}
	
	
		public static String[] getPPattern() {
			return new String[] {
				"******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
			};
		}
		public static String[] getSPattern() {
			return new String[] {
				"   ***** ",
				" **      ",
				"**       ",
				" **      ",
				"   ***   ",
				"      ** ",
				"       **",
				"      ** ",
				" *****   "
			};
		}
        public void printMessage(){
            String[] oPattern = getOPattern();
		    String[] pPattern = getPPattern();
		    String[] sPattern = getSPattern();

            for (int i = 0; i < oPattern.length; i++) {
                System.out.println(oPattern[i] + " " + oPattern[i] +  " " + pPattern[i] + " " + sPattern[i]);
            }
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap cpm = new CharacterPatternMap();
        cpm.printMessage();
    }
}