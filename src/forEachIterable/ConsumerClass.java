package forEachIterable;

import java.util.function.Consumer;

public class ConsumerClass implements Consumer<String> {
	public void accept(String s) {
		System.out.println("consumer class :  " + s);
		
	}
}
