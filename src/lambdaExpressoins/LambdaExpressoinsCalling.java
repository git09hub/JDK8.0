package lambdaExpressoins;

import java.util.Collections;
import java.util.stream.IntStream;

@FunctionalInterface
interface funInterFace {

	// must contain only one abstract method
	void interfaceMethod();

}

@FunctionalInterface
interface paramsFunInterFace {
	void interfaceMethod(int x, int y);
}

@FunctionalInterface
interface returnFunInterFace {
	int interfaceMethod(int param);
}

public class LambdaExpressoinsCalling {
	public static void main(String args[]) {
		funInterFace fif = () -> {

			System.out.println("lambda called");
		};
		fif.interfaceMethod();

		paramsFunInterFace pfif = (int x, int y) -> {
			// business logic goes here
			int sum = x + y;
			System.out.println("lambda with params: " + x + " :  " + y);
			System.out.println("sum is:  " + sum);
		};
		pfif.interfaceMethod(3, 5);

		returnFunInterFace rfif = (int param) -> {
			int add = param + 10;
			return add;
		};
		int returnedParam = rfif.interfaceMethod(5);
		System.out.println("lambda with return param:   " + returnedParam);

		returnFunInterFace rfif1 = (int param) -> (param + 10);
		System.out.println("lambda with out return statement : " + rfif1.interfaceMethod(5));

		// LAMBDA FOR EACH
		java.util.List<Character> list = new java.util.ArrayList<Character>();
		for (char i = 'a'; i <= 'z'; i++) {
			list.add(i);
		}

		// lambda with for each
		list.stream().forEach(result -> {
			System.out.println(result + "   :  " + list.indexOf(result));
		});

		// Thread with lambda
		Runnable r2 = () -> {
			System.out.println("Thread with Lambda is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		Collections.sort(list, (a, b) -> {
			return b.compareTo(a);
		});

		System.out.println("List sorted in reverse using lambda and collections.sort method...");
		
		
		// lambda with for each
		list.stream().forEach(result -> {
			System.out.println(result + "   :  " + list.indexOf(result));
		});

	}
}
