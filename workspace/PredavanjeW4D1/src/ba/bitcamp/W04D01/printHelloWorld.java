package ba.bitcamp.W04D01;

public class printHelloWorld {

	
	
	public static void main(String[] args) {
	//	sayHello();
	//	sayHello("Gordan");
		if(args.length == 0){
			System.out.println("Usage HelloWORLD.jar Name1 Name2 ...");
		}
	//	else{
	//	for(int i = 0; i<args.length;i++){
	//	sayHello(args[i]);
	//	}
	// 
		
		for(String name: args){
			sayHello(name);
		}
	}
//	}
	/**
	 * Prints hello world to the screen.
	 * <p>
	 * Sends string "Hello, world!" to the standard output.
	 */
	public static void sayHello(){
		System.out.println("Hello, world!");
	}
	/**
	 * Greets user by name.
	 * 
	 * @param name Name of a user to greet.
	 */
	public static void sayHello(String name){
		System.out.printf("Hello, %s\n",name);
	}

}





















