package Day_11;

public class Product {
	// properties
	int productId;
	String productName;
	double productPrice;
	
	//Behavior
	public void setProductData(int id, String name, double price) {
		productId = id;
		productName = name;
		productPrice = price;
	}

	
	public void getProductInfo() {
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+productPrice);
	}
}

/*
Write a Program on OOPs to define Product class properties and behaviour.

properties :
productId : int
productName : String
productPrice : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setProductData() : public void
getProductInfo() : public void
*/