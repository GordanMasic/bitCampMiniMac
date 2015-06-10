
public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double metaraPretrcano = 0;
		int ukupnoMetara = 41150;
		int brojIteracija = 0;
		do {
			metaraPretrcano += Math.random();
			brojIteracija++;
		}while (metaraPretrcano <= ukupnoMetara);
		System.out.println("Cilj");
		System.out.println(brojIteracija);

	}

}
