package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ententites.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Product product = new Product();
		OrderItem item = new OrderItem();
				
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Bithday(DD/MM/YYYY): ");
		LocalDate d01 = LocalDate.parse(sc.next(), fmt1);
		
		
		Client client = new Client(name, email, d01);
		
		System.out.println("Enter the ordem data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDate.now(), status, client);
		
		System.out.println();
		System.out.print("How many items to this ordem?: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		
		
		for (int i = 0; i < n; i++ ) {
			sc.nextLine();
			System.out.println("Enter the  #" + (i+1) +  " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			System.out.println();
			
			product = new Product(productName, price);
			item = new OrderItem(quantity, price, product);
			
			order.addItem(item);

			
		}

		System.out.println();
		System.out.println(order);
		
		
		sc.close();
	}
	

}
