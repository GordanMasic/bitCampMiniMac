
public class VariableType {

	public static String getType(String value){
		
		
		if(value.equals("true")||value.equals("false")){
			return "boolean";
		}
		try {
			Integer.parseInt(value);
			return "integer";
		}catch(Exception e){}
		try { 
			Double.parseDouble(value);
			return "double";
		}catch(Exception e){}
		if (value.length()==1){
			return "char";
		}else{
			return "String";
		}
			
		
		
		
		
		
			
	}
	public static void main(String[] args) {
		System.out.println(getType("Gordan"));

	}

}
