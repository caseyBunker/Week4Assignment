//Casey Bunker

import java.util.Scanner;

public class Week4Assignment {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			float length = 0;
			float width = 0;
			float height = 0; 
			
			System.out.println("");
			
			System.out.print("This program will accept a length, width and height of a box, \n "
				+"and then it will report the surface area and volume of it.\n\n\n");
			
			System.out.print("Please enter the box length: ");
		    length = s.nextFloat();
		    
		    System.out.print("Please enter the box height: ");
		    height = s.nextFloat();
		    
		    
		    System.out.print("Please enter the box width: ");
		    width = s.nextFloat();
		    
			System.out.println("");
			System.out.println("");
		    
		    surfaceArea(length, width, height);
		    volume(length, width, height);
		    	    
			

		}
		
		public static float surfaceArea(float a, float b, float c) {
			
			float surfaceArea = 0;
			String surfArea = "The surface area of your rectangle is: ";
			
			surfaceArea = (2*a*b) + (2*a*c) + (2*c*b);
			
			System.out.printf("%s %,5.2f \n", surfArea, surfaceArea);
			
			
			return surfaceArea;
				
			
			
		}
		
		public static float volume(float a, float b, float c) {
			
			float volume = 0;
			String vol = "The volume of your rectangle is: ";
			
			volume = a*b*c; 
			
			System.out.printf("%s %,8.2f", vol, volume);
			
			return volume;
			
			
		}

	}


