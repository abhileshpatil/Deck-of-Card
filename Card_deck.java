package demo.gradle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Card_deck {
	public static void main(String[] args)
    {
		String[] suit ={ "hearts","spades", "clubs", "diamonds"};
		String[] face_value ={ "Ace","two","three", "four", "five","six","seven", "eight", "nine","ten","Jack", "Queen", "King"};
		ArrayList<String> deck = new ArrayList<String>();
		
		int track=0;
    	for(int i=0;i<4;i++)
    	{
    		for(int j=0;j<13;j++)
    		{
    			deck.add(suit[i]+" "+face_value[j]);
    		}
    	}
    	
    	Scanner scan= new Scanner(System.in);
    	int i=0;
    	while(i<52)
    	{
    	System.out.println("Enter the number of cards to be drawn Randomly");
    	int m=scan.nextInt();
    	track=track+m;
    	if(track<=52)
    	{
    	dealOnecard(m,deck);
    	}
    	else
    	{
    		System.out.println("All the cards are already drawn. No cards left in the deck");
    		break;
    	}
    	}
    }
	
	public static void dealOnecard(int m,ArrayList deck)
	{   
		ArrayList card=new ArrayList();
		int z=0;
		while(z<m)
		{
		shuffle(deck);
		card.add(deck.get(deck.size()-1));                     
		deck.remove(deck.size()-1);
		z++;
		}
		System.out.println("Card withdrawn:"+card);
		
	}
	
	public static ArrayList<String> shuffle(ArrayList deck) {
		Collections.shuffle(deck);                             // shuffle the deck of cards
		return deck;
	}

}

