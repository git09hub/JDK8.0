package functionalInterface;

@FunctionalInterface
interface funInterFace {

	String interfaceMethod(String param);

	default void defMethod(String parameter) {
		System.out.println("default method..." + parameter);
	}
	
	static void statMethod(String name) {
		System.out.println("static method...parameter:name:  " + name);
	}
}

public class FunctionalInterfaceEx  {
	public static void main(String[] args) {
		
		funInterFace.statMethod("taraq");
		
		//lambda expressions
		funInterFace fif = (param) -> {
			return param+param.length();
		};
		
		System.out.println("data from lambda..."+ fif.interfaceMethod("taraq"));
		System.out.println("data from lambda..."+ fif.interfaceMethod("sai"));
	}
}
