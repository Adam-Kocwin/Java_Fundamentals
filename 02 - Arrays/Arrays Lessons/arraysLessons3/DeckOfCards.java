package arraysLessons3;

public class DeckOfCards
{

	public static void main(String[] args)
	{
		int [] deck = new int [52];
		String [] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
		
		for (int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
		
		for (int i = 0; i < deck.length; i++)// used for shuffling without losing any of the original subscript
		{
			int index = (int) (Math.random()* deck.length);
			int temp = deck[i];
			deck [i] = deck[index];
			deck[index] =temp;
		}

		for (int i = 0; i < 4; i++)// dividing number by 1/4 of deck to find the suit of the card
		{
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];// finding rank of the card
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit );
		}
	}

}
