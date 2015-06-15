package ba.bitcamp.creating.wallet;

public class WalletMain {

	public static void main(String[] args) {

		Wallet w = new Wallet(2);

		System.out.println("Wallet balance: " + w.getWalletBalance());

		CreditCard c1 = new CreditCard();

		c1.addMoney(7900);

		System.out.println("Card balance: " + c1.getCardBalance());

		w.addCard(c1);

		CreditCard c2 = new CreditCard();
		c2.addMoney(150);
		w.addCard(c2);

		System.out.println(c1);
		System.out.println(c2);
		CreditCard c3 = new CreditCard();

		w.addCard(c3);

		for (int i = 0; i < w.getNumberOfCards(); i++) {

			System.out.println(w.getCard(i).getCardBalance());

		}

	}

}
