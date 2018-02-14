package lambdaExpressoins;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class SortingWithLambda {
	public static void main(String[] args) {
		java.util.List<Product> list = new java.util.ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000f));
		list.add(new Product(3, "Iphone 6S", 65000f));
		list.add(new Product(2, "Sony Xperia", 25000f));
		list.add(new Product(4, "Nokia Lumia", 15000f));
		list.add(new Product(5, "Redmi4 ", 26000f));
		list.add(new Product(6, "Lenevo Vibe", 19000f));

		// using lambda to filter data
		java.util.stream.Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

		System.out.println("Getting filtered - list price > 20000:  ");

		// using lambda to iterate through collection
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));

		// implementing lambda expression
		java.util.Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		System.out.println("Getting sorted - list with lambda & comparator   ");

		
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}
