package com.daytonadaynerestaurants;
import java.util.Arrays;

public class Restaurants {
    	
	public static void main(String[] args) {
			
		//3 sets of restaurants
		String[] lowCostFood = {"Burger King", "McDonald's", "KFC", "Popeye's", "Pizza Hut", "Papa John's", "Panda Express (Mall)", "Sakura Japan (Mall)"};
		
		String[] midCostFood = {"China Wok", "Jackie Lee's", "Donna's", "Golden Crust", "Dutch Pot", "Sybill's", "R.O.K.", "TGIFriday's", "Chili's", "Benihana",
		                         "Olive Garden", "New River Pizza"};
		String[] highCostFood = {"Morton's the Steakhouse", "Cheesecake Factory", "Rustic Inn", "Blue Moon Fish Co.", "Ruth's Chris Steak House", "The Capital Grille",
				                   "TruLuck's"};
		
		// find out how many restaurants are in each list
		int oneLength = lowCostFood.length;
		int twoLength = midCostFood.length;
		int threeLength = highCostFood.length;
		
		// generate three random numbers
		int lowCostFood1 = (int) (Math.random() * oneLength);
		int midCostFood2 = (int) (Math.random() * twoLength);
		int highCostFood3 = (int) (Math.random() * threeLength);
		
		// now build a phrase 
		String phrase = lowCostFood[lowCostFood1] + " is really unhealthy but ooooohhh so good when you got the munchie's, " + midCostFood[midCostFood2] + 
				" is off the chain good but i really could go for some " + highCostFood[highCostFood3] + " it's a gamble because its pricey and you may have to wait ";
		
		//print out the phrase 
		System.out.println ("I'm starving, what should I eat... " + phrase);
	}

}
