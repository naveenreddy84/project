package computerstore;


import java.util.Scanner;


public class MainMenu {

	static int choice;
	
	 public static Computer[] inventory;
	 public static int maxComputers;
	 public static int currentSize; // to keep track of the number of computers in inventory
	 
	 // initilizing password and tries by using constructors
	 
	 public MainMenu(int maxComputers) {
	     this.maxComputers = maxComputers;
	     this.inventory = new Computer[maxComputers];
	     this.currentSize = 0;
	 }
    
    public static void mainMenu() {
		 
	    Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter your choice from below Menu");
    	System.out.println( );
    	
    	do {
    		System.out.println("1. Enter new computers ");
    		System.out.println("2. Change information of a computer ");
    		System.out.println("3. Display all computers by a specific brand ");
    		System.out.println("4. Display all computers under a certain a price ");
    		System.out.println("5. Quit ");
    		
    		 int choice = sc.nextInt();
     		
    		switch(choice) {
    		
    		case 1:
    			ComputerStoreOperations.addComputers();
    			System.out.println();
    			break;
    			
    		case 2:
    			ComputerStoreOperations.updateComputer();
    			System.out.println();
    			break;
    			
    		case 3:
    			ComputerStoreOperations.findComputersByBrand();
    			System.out.println();
    			break;
    		case 4:
    			ComputerStoreOperations.findInderCertenPrice();
    			System.out.println();
    			break;
    		case 5:
    			System.out.println("Closing the Computer Store. Goodbye!..");
    			break;
    		default:
    			System.out.println("Invalid Choice..! Please Check your option once.");
    			System.out.println();
    		}
    	}while(choice != 5);
    	sc.close();
    }
    
    public static void updateMenu() {
    	
    	//creating Computer class object to access the setters 
    	Computer computer = new Computer();
    	
    	do {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Choose the  Option Which you want change. Update Menu.. ");
    		System.out.println();
    		System.out.println("1. Brand ");
    		System.out.println("2. Model ");
    		System.out.println("3. Serial Number (SN) ");
    		System.out.println("4. Price ");
    		System.out.println("5. Quit ");
    		// taking input from scanner
    		 int choice = sc.nextInt();
    		switch(choice) {
    		
    		case 1:
    			System.out.print("Enter new brand: ");
    			String newbrand = sc.next();
    			computer.setBrand(newbrand);
    			System.out.println();
    			break;
    		case 2:
    			System.out.println("Enter new model: ");
    			String newmodel = sc.next();
    			computer.setModel(newmodel);
    			System.out.println();
    			break;
    		case 3:
    			System.out.println("Enter new SN (serial number) ");
    			long newSN = sc.nextLong();
    			computer.setSN(newSN);
    			System.out.println();
    			break;
    		case 4:
    			System.out.println("Enter new SN Price ");
    			long newprice = sc.nextLong();
    			computer.setSN(newprice);
    			System.out.println();
    			break;
    		case 5:
    			System.out.println("Back to MainMenu..");
    			System.out.println();
    			mainMenu();
    			break;
    		default:
    			System.out.println("Invalid Choice..! Please Check your option once.");
    			System.out.println();
    		}
    		
    	}while(choice != 5);
    }
    
}
