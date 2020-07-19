package chunwei_0304_SEproject;

public class ShoppingCart implements cartAction{
	private int cartID;
	private String orderList;
	
	public ShoppingCart() {
		
	}
	public ShoppingCart(int cartID, String orderList) {
		this.cartID = cartID;
		this.orderList = orderList;
	}
	
	public int getID() {
		return cartID;
	}
	public void setID(int cartID) {
		this.cartID = cartID;
	}
	public String getOrderList() {
		return orderList;
	}
	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}
	
	// Actions
	
	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFromCart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float calculateTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		
	}

}
