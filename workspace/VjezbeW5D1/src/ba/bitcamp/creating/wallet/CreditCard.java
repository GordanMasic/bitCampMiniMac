package ba.bitcamp.creating.wallet;

public class CreditCard {

	private int cardNo;
	private String bankName;
	private int expirationMonth;
	private int expirationYear;
	private double cardBalance = 0;

	
	
	
	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", bankName=" + bankName
				+ ", expirationMonth=" + expirationMonth + ", expirationYear="
				+ expirationYear + ", cardBalance=" + cardBalance + "]";
	}

	/**
	 * Constructor for creating credit cards
	 * 
	 * @param cardNo
	 *            card number
	 * @param bankName
	 *            name of bank whose credit card is
	 * @param expirationMonth
	 *            month when credit card expiring
	 * @param expirationYear
	 *            year when credit card expiring
	 * @param cardMoney
	 *            credit card money set on 0
	 */
	public CreditCard() {
		super();
		this.cardBalance = cardBalance;
	}

	/**
	 * Adds money on card
	 * 
	 * @param money
	 *            value of adding money
	 */
	public void addMoney(double money) {
		cardBalance += money;
	}

	/**
	 * Removes money from the card
	 * 
	 * @param money
	 *            value of removing money
	 */
	public void removeMoney(double money) {
		cardBalance -= money;
	}

	/**
	 * Returns card money status
	 * 
	 * @return money value on the card
	 */
	public double getCardBalance() {
		return cardBalance;
	}

}
