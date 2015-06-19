package ba.bitcamp.game.card;

/**
 * 
 * @author gordan.masic
 *
 */
public class Card {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;
	private static final int MIN_SUIT = 1;
	private static final int MAX_SUIT = 4;

	public static final int HEART = 0;
	public static final int DIAMOND = 1;
	public static final int CLUBS = 2;
	public static final int SPADE = 3;
	public static final int JOCKER = 4;

	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private int value;
	private int suit;
	private boolean isJocker = false;

	public Card() {
		this.value = 0;
		this.suit = JOCKER;
		this.isJocker = true;
	}

	
	public Card(int value, int suit) throws IllegalArgumentException{

		if (value < MIN_VALUE && value > MAX_VALUE) {
			throw new IllegalArgumentException("Value mus tbe in range 1-13");
		}
		if (suit < MIN_SUIT && suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0-4");
		}
		this.value = value;
		this.suit = suit;
		if(suit == 4) {
			this.isJocker = true;
		}

	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public void setValue(int value) {
		if (isJocker == false) {
			throw new UnsupportedOperationException(
					"Can't change tje value of a non Jocker card.");
		}
		this.value = value;
	}

	public void setSuit(int suit) {
		if (isJocker == false) {
			throw new UnsupportedOperationException(
					"Can't change tje value of a non Jocker card.");
		}
		if (suit < 0 && suit > 4) {
			throw new IllegalArgumentException("Suit must be in range 0-4");
		}

		this.suit = suit;
	}

	public String getValueString() {
		if (value == 1 || value > 10) {
			switch (value) {
			case ACE:
				return "Ace";
			case JACK:
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING:
				return "King";
			default:
				return "";
			}
		} else {
			return Integer.toString(value);
		}

	}

	public String getSuitString() {
		switch (suit) {
		case HEART:
			return "Heart";
		case DIAMOND:
			return "Diamond";
		case CLUBS:
			return "Clubs";
		case SPADE:
			return "Spade";
		default:
			return "Jocker";
		}
	}

	public String getCard() {
		return getValueString() + " " + getSuitString();
	}

	public String toString() {
		return getCard();
	}
}