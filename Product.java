public class Product {

	private int productNum;
	private String name;
	private double unitPrice;

	public Product()
	{
		productNum = 0;
		name = "";
		unitPrice = 0.0;
	}

	public Product(int productNum, String name, double unitPrice)
	{
		setProductNum(productNum);
		setName(name);
		setUnitPrice(unitPrice);
	}

	public Product(Product p)
	{
		productNum = p.productNum;
		name = p.name;
		unitPrice = p.unitPrice;
	}

	public int getProductNum() {
		return productNum;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setProductNum(int productNum)
	{
		this.productNum = productNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String toString()
	{

		return name + ",  No: " + productNum + ", Price: " + unitPrice;
	}

	public void printDetails() {

		System.out.printf("%s (No. %d): $%.2f%n", name, productNum, unitPrice);

	}

}
