package chunwei_0304_SEproject;

public class Products implements clickAction {
	private int productID;
	private String productName;
	private float productPrice;
	private int productQuantity;
	private String productDescription;
	private int productFavoriteNum = 0;
	private int productClickNum = 0;
	private String productComments;
	
	public Products() {
		
	}
	public Products(int productID, String productName, float productPrice, int productQuantity, String productDescription) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
	}
	
	// getters & setters
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return productName;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return productPrice;
	}
	public void setPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return productQuantity;
	}
	public void setQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getDescription() {
		return productDescription;
	}
	public void setDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getFavoriteNum() {
		return productFavoriteNum;
	}
	public void setFavoriteNum(int productFavoriteNum) {
		this.productFavoriteNum = productFavoriteNum;
	}
	public int getClickNum() {
		return productClickNum;
	}
	public void setClickNum(int productClickNum) {
		this.productClickNum = productClickNum;
	}
	public String getComments() {
		return productComments;
	}
	public void setComments(String productComments) {
		this.productComments = productComments;
	}
	
	// Actions
	
	@Override
	public void productOnClicked() {
		// If a customer clicks on the specific product, productClickNum increase 1
		productClickNum++;
		
	}
	

	
	@Override
	public String toString() {
		return productID + "\t" + productName + "\t" + productPrice
				+ "\t" + productQuantity + "\t" + productDescription;
	}

}
