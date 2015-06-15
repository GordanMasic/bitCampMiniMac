package ba.bitcamp.creating.wallet;

import java.util.Arrays;

public class Wallet {

	private double moneyInWallet;
	private CreditCard[] numOfCreditCards;

	@Override
	public String toString() {
		return "Wallet [moneyInWallet=" + moneyInWallet + ", numOfCreditCards="
				+ Arrays.toString(numOfCreditCards) + "]";
	}

	/**
	 * Constructor creates wallet with specific number of credit cards allowed
	 * 
	 * @param numOfCreditCards
	 *            how many credit cards can wallet have
	 */
	public Wallet(int maxCards) {
		super();
		this.numOfCreditCards = new CreditCard[maxCards];
	}

	/**
	 * Adds money to wallet
	 * 
	 * @param money
	 *            value of adding money
	 */
	public void addMoneyToWallet(double money) {
		moneyInWallet += money;
	}

	/**
	 * Removes money from wallet
	 * 
	 * @param money
	 *            value of removing money
	 */
	public void removeMoneyFromWallet(double money) {
		if (moneyInWallet - money >= 0) {
			moneyInWallet -= money;
		} else {
			System.out.println("You don't have that much money!");
		}
	}

	/**
	 * Prints how much money is in the wallet
	 * 
	 * @return money from wallet
	 */
	public double getWalletBalance() {
		return moneyInWallet;
	}

	/**
	 * Adding cards to wallet
	 * 
	 * @param c
	 *            card we want to add to wallet
	 */
	public void addCard(CreditCard c) {
		for (int i = 0; i < numOfCreditCards.length; i++) {
			if (numOfCreditCards[i] == null) {
				numOfCreditCards[i] = c;
				break;
			}
		}
	}

	/**
	 * Returns number of cards in wallet
	 * 
	 * @return number of cards in wallet
	 */
	public int getNumberOfCards() {

		return numOfCreditCards.length;
	}

	/**
	 * Returns specific card from wallet
	 * 
	 * @param i
	 *            position of card in wallet
	 * @return card from wallet
	 */
	public CreditCard getCard(int i) {
		return numOfCreditCards[i];
	}
}
