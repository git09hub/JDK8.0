package forEachIterable;
import java.io.IOException;
import java.util.*;
import java.util.function.*;

public class ForEach{
	public static void main(String args[]){
		
		/*String[] arr = new String[] {"3","4"};
		List<String> asList = Arrays.asList(arr);
		asList.add("5");
		System.out.println("--"+arr.length+"----"+asList.size());
		*/
		
		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(1);
		list.add(2);
		
		list.remove(1);
		list.remove(new Integer(1));
		list.remove(new Integer(2));
		System.out.println(list);
		
		
		
		/*List<String> list = new ArrayList<String>();
			for(char i='a';i<='z';i--){
				list.add(Character.toString(i));
			}
			System.out.println("strings list...."+list);
			
			for(String s: list) {
				System.out.println("for with :(in) operator--->"+s);
			}
			
			ConsumerObj consumerObj = new ConsumerObj();
			list.forEach(consumerObj);
			
			ConsumerClass consumerClass = new ConsumerClass();
			//list.forEach(consumerClass);
*/			
	}
}

class TestThrow1{
	void m()throws IOException {
		throw new IOException("Hello");
	}
	void n()throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
			
		}catch(Exception e) {
			System.out.println("welcome");
		}
	}
	public static void main(String args[]) {
		TestThrow1 obj = new TestThrow1();
		obj.p();
		System.out.println("thankyou");
		
		try {
			Integer i = Integer.parseInt("X");
			System.out.println("--"+i);
			
		}catch(IllegalArgumentException e) {
			System.out.println("i..."+e);
		}catch(Exception e) {
			System.out.println("Gneric ex.."+e);
		}
		
		Thread t = new Thread();
		
		
	}
}




class ConsumerObj implements Consumer<String>{
		public void accept(String s){
				System.out.println(":"+s);
		}	
}