import java.util.Scanner;
public class OnlineStore {

	private String name;
	private Product products[];
	private Order orders[];
	private int index;
	private int orderIndex;

	public OnlineStore(String s)
	{
		products = new Product[10];
		orders = new Order[10];
		this.name = s;
		index = 0;
		orderIndex = 0;
	}

	public void addProduct()
	{
		Scanner keyboard = new Scanner(System.in);

		int num;
		String name;
		double price;

		System.out.print("Product Number: ");
		num = keyboard.nextInt();

		System.out.print("Product Name: ");
		name = keyboard.next();

		System.out.print("Product Price: ");
		price = keyboard.nextDouble();

		if( exists(num) != -1 ){
			System.out.println("Input Error: Product " +  num + " already exists.");
			return;

		}

		Product temp = new Product(num, name, price);

		products[index++] = new Product(temp);

		System.out.println("Product Added: " + temp);

	}

	public void productInfo()
	{
		for(int i = 0; i < index; i++)
			products[i].printDetails();
	}

	public void makeOrder() {

		Scanner keyboard = new Scanner(System.in);

		int orderNum;
		System.out.print("Order Number: ");
		orderNum = keyboard.nextInt();

		Order temp = new Order(orderNum);

		int input = 1;
		while(input != 0)
		{
			System.out.print("Type Product Number (0 to finish): ");
			input = keyboard.nextInt();

			int check = exists(input);

			if(check == -1)
			{
				System.out.println("Fatal Error: Does not exist.");
			}

			else {

				temp.addOrder(products[check]);
			}

		}

		System.out.println("Order Info Order Number: " + orderNum);
		for(int i = 0; i < temp.getIndex(); i++)
		{
			System.out.printf("\tItem %d ", i + 1);
			temp.getProduct(i).printDetails();
		}
		System.out.printf("\tTotal Price: $%.2f %n", temp.getTotalPrice() );

	}

	public int exists(int prodNum) {

		for(int i = 0; i < index; i++)
		{
			if(products[i].getProductNum() == prodNum)
				return i;
		}

		return -1;
	}
}
