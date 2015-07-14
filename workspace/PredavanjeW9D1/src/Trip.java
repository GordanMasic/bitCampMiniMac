import java.util.Scanner;

public class Trip {

	private Place start;
	
	private Trip(Place start){
		this.start = start;
	}
	public void setPlace(Place e){
		this.start = e;
	}
	
	public Place getStart(){
		return start;
	}
	
	public String toString(){
		return String.format("%s", start);
	}
	
	public void add (Place nePlace){
		if(start == null){
		
		}
		Place last = start;
		while (last.getNext() != null){
			last = last.getNext();
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Place  head = null;
		Place last = null;
		
		System.out.println("Unesite imena gradova koje zelit obici: ");
		
		while (true) {
			String n = in.nextLine();
			if (!n.equals("")) {
				Place newPlace = new Place(n);
				
				if(head == null && last == null){
					head = newPlace;
					last = newPlace;
				}else{
					last.setNext(newPlace);
					last = newPlace;
				}
			}else{
				break;
			}
		}
		
	Trip t = new Trip(head);
	Place currentPlace = t.getStart();
	
		System.out.println("Vase putovanje ima slijedece destinacije: ");
	}
	
			
	
	
}
