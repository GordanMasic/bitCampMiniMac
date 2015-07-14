import java.util.ArrayList;
import java.util.Random;


public class Lists {

	public static void main(String[] args) {
		
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		for (int i = 0; i < 11; i++) {
//			Random rand = new Random();
//			a.add(rand.nextInt(11));
//		}
//		
//		System.out.println(a.toString());
//		removeAll(2, a);
//		System.out.println(a.toString());
//		a=reverseAll(a);
//		System.out.println(a.toString());
//		a=switchPairs(a);
//		System.out.println(a.toString());
//		a=switchPairsTemp(a);
//		System.out.println(a.toString());
		
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Bit");
		words.add("Camp");
		words.add("Java");
		words.add("Javatars");
		words.add("Dot");
		words.add("Net");
		
		System.out.println(markLength(words, 3));
	}

	public static void removeAll(int num, ArrayList<Integer> arrayList){
		while(arrayList.indexOf(num)!=-1){
			arrayList.remove((Integer)num);
		}
	}
	
	public static ArrayList<Integer> reverseAll(ArrayList<Integer> arrayList){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = arrayList.size()-1; i >= 0; i--) {
			arr.add(arrayList.get(i));
			
		}
		return arr;
	}
	
	public static ArrayList<Integer> switchPairs(ArrayList<Integer> arrayList){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<= arrayList.size()-1;i+=2){
			if(i<arrayList.size()-1){
			arr.add(arrayList.get(i+1));
			arr.add(arrayList.get(i));
			} else {
				arr.add(arrayList.get(arrayList.size()-1));
			}
		}
			
		return arr;
	}
	public static ArrayList<Integer> switchPairsTemp(ArrayList<Integer> arrayList){
		int temp = 0;
		for(int i = 0; i< arrayList.size()-1;i+=2){
			temp = arrayList.get(i);
			arrayList.set(i,arrayList.get(i+1));
			arrayList.set(i+1,temp);
		}
			
		return arrayList;
	}
	
	public static ArrayList<String> markLength(ArrayList<String> arrayList,int num){
		ArrayList<String> words = new ArrayList<String>();
		String s = "";
		for (int j = 0; j < num; j++) {
			s += "*";
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).length() == num){	
				words.add(s);
				words.add(arrayList.get(i));
			}else{
				words.add(arrayList.get(i));
			}
		}
		return words;
	}
}
