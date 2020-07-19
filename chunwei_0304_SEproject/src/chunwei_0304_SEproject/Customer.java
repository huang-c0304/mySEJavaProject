package chunwei_0304_SEproject;

import java.util.Scanner;

public class Customer implements viewCart, favoriteAction{
	private int customerID;
	private String customerAccount;
	private String customerPwd;
	private String customerOrderHistory;
	
	public Customer() {
		
	}
	public Customer(int customerID, String customerAccount, String customerPwd) {
		this.customerID = customerID;
		this.customerAccount = customerAccount;
		this.customerPwd = customerPwd;
//		this.customerOrderHistory = customerOrderHistory;
	}
	
	// getters & setters
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String customerAccount() {
		return customerAccount;
	}
	public void setAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}
	public String getPwd(){
		return customerPwd;
	}
	public void setPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}
	public String getOrderHistory() {
		return customerOrderHistory;
	}
	public void setOrderHistory(String customerOrderHistory) {
		this.customerOrderHistory = customerOrderHistory;
	}
	
	
	
	// Customer actions
	
	public String leaveComments() {
		// Customer leaves comments
		Scanner input = new Scanner(System.in);
		System.out.println("Leave comments here: ");
		String comments = input.nextLine();
		return comments;
	}
	@Override
	public void showCartList() {
		//Show the all products in the cart
		System.out.println("Displaying products in Customer " + getCustomerID() + "'s shopping cart....");
		
	}
	
	@Override
	public boolean addFavorite() {
		// If a customer add the product into their favorite, productFavorite increase 1
		return true;
	}
	@Override
	public boolean removeFavorite() {
		// If a customer remove the product from their favorite, productFavorite decrease 1
		return true;
	}
	
}
