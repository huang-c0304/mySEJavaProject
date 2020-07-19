package chunwei_0304_SEproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineOrdering {
	
	public static void main(String[] args) {
		List<Products> products = readProductsFromCSV("productsList.csv");
		Customer cust1 = new Customer(1, "cust1_account", "cust1_password");
		
		System.out.println("ID\tName\tPrice\tQuantity\tDescription\tFavorite\tClick\tComments");
		for(Products p : products) {
			System.out.println(p);
		}
		
		// Viewing Shopping Cart
		System.out.println("\nCustomer 1 are viewing cart....");
		cust1.showCartList();
		
		// Leaving Comments
		products.get(0).setComments(cust1.leaveComments());
		System.out.println("Comments of Product_A:");
		System.out.println(products.get(0).getComments());
		
		// Add to Favorite
		if(cust1.addFavorite()) {
			System.out.println("Customer 1 has added the product to Favorite.");
			int favoriteNum = products.get(0).getFavoriteNum();
			favoriteNum++;
			products.get(0).setFavoriteNum(favoriteNum);
		} else if(cust1.removeFavorite()) {
			System.out.println("Customer 1 has removed the product out of Favorite.");
			int favoriteNum = products.get(0).getFavoriteNum();
			favoriteNum--;
			products.get(0).setFavoriteNum(favoriteNum);
		}
		
	}
	
	public static List<Products> readProductsFromCSV(String fileName) {
		
		List<Products> products = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try(BufferedReader buffer = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			buffer.readLine();
			String line = buffer.readLine();
			while(line != null) {
				String[] attr = line.split(",");
				Products product = createProduct(attr);
				
				products.add(product);
				line = buffer.readLine();
			}	
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public static Products createProduct(String[] data) {
		int id = Integer.parseInt(data[0]);
		String name = data[1];
		float price = Float.parseFloat(data[2]);
		int quantity = Integer.parseInt(data[3]);
		String description = data[4];
		
		return new Products(id, name, price, quantity, description);
	}
}

