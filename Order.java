public class Order {

	private int orderNum;
	private double totalPrice;
	private Product item[]; // can have max 10
	private int index;

	public Order() {

		orderNum = 0;
		totalPrice = 0.0;

		item = new Product[10];
		index = 0;

	}

	public Order(int orderNum)
	{
		this.orderNum = orderNum;

		totalPrice = 0.0;

		item = new Product[10];
		index = 0;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void addOrder(Product p)
	{
		item[index++] = p;
		totalPrice += p.getUnitPrice();
	}

	public int getIndex()
	{
		return index;
	}

	public Product getProduct(int i)
	{
		return new Product(item[i]);
	}

}
