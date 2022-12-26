package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("HD", 450.00));
		list.add(new Product("Tablet", 450.00));

		double factor = 1.1;

		list.forEach(p -> p.setPrice(p.getPrice() * factor));// forma inline *** principal

		list.forEach(System.out::println);

	}

}
