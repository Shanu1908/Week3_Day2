package week3.day2;

public class action{

		public static void main(String[] args) {
			// Here is the input
			String test = "$$ Welcome to 3rd Class of Automation $$ ";

			// Here is what the count you need to find
			int  letter = 0, space = 0, num = 0, specialChar = 0;

			// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/

		    char [] ch = new char[test.length()];
		    
				    int Splchar = 0;
					for (int i = 0; i < test.length(); i++){
				        
				        ch[i] = test.charAt(i);
				        
				        if (Character.isLetter(ch[i]))
				        {letter += 1;}
				        
				        else if (Character.isDigit(ch[i]))
				        {num += 1;}
				        
				        else if (Character.isSpaceChar(ch[i]))
				        {space += 1;}
				        
				        else {Splchar += 1;}
				    }
				    
				 // Print the count here
				    System.out.println("Letter: " +letter);
				    System.out.println("Space: " +space);
				    System.out.println("Number: " +num);
				    System.out.println("Special Character: " +Splchar);
				} 
				
		}
	