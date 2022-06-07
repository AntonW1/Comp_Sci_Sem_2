import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String[] myArray;
		myArray = new String[30];
		int c = 0;
		
		myArray[0] =  "      __           _           _               _          _             __               ";
		myArray[1] =  "     /  \\         / \\         / \\             / \\        / \\           /  \\            ";
		myArray[2] =  "    /    \\       /   \\       /   \\           /   \\      /   \\         /    \\           ";
		myArray[3] =  "   /      \\     /     \\     /     \\         /     \\    /     \\       /      \\          ";
		myArray[4] =  "  |        \\   /       \\   /       \\       /       \\  /       \\     /        |         ";
		myArray[5] =  "  |         \\                       _______                        /         |          ";
		myArray[6] =  "  |          \\                      |     |                       /          |          ";
		myArray[7] =  "  |           \\                    {@     @}                     /           |	       ";
		myArray[8] =  "  |                                 |\\   /|                                  |           ";
		myArray[9] =  "  |                                 | \\ / |                                  |           ";
		myArray[10] = "  \\                                 |  \\/ |                                  /          ";
		myArray[11] = "   \\                                |     |                                 /           ";
		myArray[12] = "    \\                                |   |                                 /            ";
		myArray[13] = "     \\                               |   |                                /             ";
		myArray[14] = "      \\                            --     --                             /              ";
		myArray[15] = "       \\                           /         \\                          /               ";
		myArray[16] = "        \\                        --           --                       /                ";
		myArray[17] = "         \\                      /               \\                     /                 ";
		myArray[18] = "          \\                    /                 \\                   /                  ";
		myArray[19] = "           \\                  /                   \\                 /                   ";
		myArray[20] = "            \\                /                     \\               /                    ";
		myArray[21] = "              ---           |                       |           ---                     ";
		myArray[22] = "                  \\         |                       |         /                        ";
		myArray[23] = "                     \\       \\                      /      /                          ";
		myArray[24] = "                       ------ \\                    / ------                           ";
		myArray[25] = "                                ---     -----    ---                                    ";
		myArray[26] = "                                   \\   /    \\  /                                     ";
		myArray[27] = "                                    | |     | |                                       ";
		myArray[28] = "                                    /|\\     /|\\                                     ";
		myArray[29] = "                                                                                        ";
	
		
		
		while(true) {
			if (c == myArray.length) {
				break;
			}
			System.out.println(myArray[c]);
			c++;
		}
		
		
		
		
	}
}
