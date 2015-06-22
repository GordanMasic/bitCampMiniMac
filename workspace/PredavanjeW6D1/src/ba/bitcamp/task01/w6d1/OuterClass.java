package ba.bitcamp.task01.w6d1;

public class OuterClass {

	private int number;
	public InnerClass ic;
	
	public OuterClass(){
		this.number = 10;
		this.ic = new InnerClass(20);
	}
	
	class InnerClass{
		private int innerNumber;
		private int number;
		
			
		public InnerClass(int number){
			this.number = number;
		}
		
		public void PrintVariables(int number){
			System.out.println("Param number: " + number);
			System.out.println("InnerClass number: " + this.number);
			System.out.println("OuterClass number: " + OuterClass.this.number);
		}
	}
}
