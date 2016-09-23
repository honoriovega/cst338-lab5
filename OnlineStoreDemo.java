import java.util.Scanner;

public class OnlineStoreDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		OnlineStore csumbOnlineStore = new OnlineStore("CSUMB");
		
		int option;
		System.out.println("Welcome to CSUMB OnlineStore");
		do {
			System.out.println("Select your choice:");
			System.out.println("    1. Add Product");
			System.out.println("    2. Product Info");
			System.out.println("    3. Make Order");
			System.out.println("    4. Exit");
			option = sc.nextInt();
			
			if(option == 1) {
				csumbOnlineStore.addProduct();
			} else if (option == 2) {
				csumbOnlineStore.productInfo();
			} else if (option == 3) {
				csumbOnlineStore.makeOrder();
			} else if (option == 4) {
				System.out.println("Bye");
				return;
			} else {
				System.out.println("Incorrect option");
			}
			System.out.println("\n\n");
			
		} while(true);
		
	}
}

/*
		SAMPLE RUN 
		
 Welcome to CSUMB OnlineStore
Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
1
Product Number: 1111
Product Name: iPhone
Product Price: 200.0
Product Added: iPhone,  No: 1111, Price: 200.0



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
1
Product Number: 2222
Product Name: PC
Product Price: 550.0
Product Added: PC,  No: 2222, Price: 550.0



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
1
Product Number: 2222
Product Name: Eraser
Product Price: 55.55
Input Error: Product 2222 already exists.



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
2
iPhone (No. 1111): $200.00
PC (No. 2222): $550.00



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
1
Product Number: 3333
Product Name: Eraser
Product Price: 55.55
Product Added: Eraser,  No: 3333, Price: 55.55



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
3
Order Number: 1000
Type Product Number (0 to finish): 1111
Type Product Number (0 to finish): 2222
Type Product Number (0 to finish): 0
Fatal Error: Does not exist.
Order Info Order Number: 1000
	Item 1 iPhone (No. 1111): $200.00
	Item 2 PC (No. 2222): $550.00
	Total Price: $750.00 



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
3
Order Number: 2000
Type Product Number (0 to finish): 4444
Fatal Error: Does not exist.
Type Product Number (0 to finish): 3333
Type Product Number (0 to finish): 0
Fatal Error: Does not exist.
Order Info Order Number: 2000
	Item 1 Eraser (No. 3333): $55.55
	Total Price: $55.55 



Select your choice:
    1. Add Product
    2. Product Info
    3. Make Order
    4. Exit
4
Bye

*/
