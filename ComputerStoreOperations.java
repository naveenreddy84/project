package computerstore;


import java.util.Scanner;

public class ComputerStoreOperations {

	 private static  String PASSWORD = "password";
	private static  String securitypin = "pargol" ; 
	 private static final int MAX_TRIES = 3;
	 static int tries = 0;
	 
	static Scanner sc = new Scanner(System.in);
	
	
	public static  void addComputers() {
		
		while(tries < MAX_TRIES) {
			System.out.println("Enter the password : ");
			String password = sc.next();
			
		
			if(password.equals(PASSWORD) || password.equals(securitypin)) {
				
		        System.out.print("Enter the number of computers you want to add: ");
		        int numToAdd = sc.nextInt();
		        
		        // Checking the inventory if there's enough space available or not to add
		        if( MainMenu.currentSize + numToAdd <= MainMenu.maxComputers) {
		        	
		        	for(int i = 0; i < numToAdd; i++) {
		        		//Inputing the computer details
		                System.out.println("Enter details for Computer #" + (MainMenu.currentSize + 1));
		                System.out.print("Brand: ");
		                String brand = sc.next();
		                System.out.print("Model: ");
		                String model = sc.next();
		                System.out.print("Serial Number (SN): ");
		                long sn = sc.nextLong();
		                System.out.print("Price: ");
		                double price = sc.nextDouble();
		                
		                Computer computer = new Computer(brand, model, sn, price);
		                MainMenu.inventory[MainMenu.currentSize++] = computer;
		        	}
		        	System.out.println(numToAdd + " computers added successfully.");
		        }
		        else {
		           System.out.println("Not enough space in the inventory. You can add a maximum of " + (MainMenu.maxComputers - MainMenu.currentSize) + " computers.");
		        }
		        return;
			}
			else {
               tries++;
               System.out.println("Incorrect password. Try again. (" + (MAX_TRIES - tries) + " tries remaining)");
			}
		}
		System.out.println("You've exceeded the maximum number of attempts. Returning to the main menu."); 
	}
	
	
	public static void updateComputer() {
		
		while(tries < MAX_TRIES) {
			System.out.println("Enter the password : ");
			String password = sc.next();
			
			if(password.equals(PASSWORD)) {
				
				//taking index value of a computer for computer user want to update
				System.out.print("Enter the computer index you wish to update: ");
				int index = sc.nextInt();
				
				//checking the given index lies between 0 and currentsize or not
				if(index >=0 && index < MainMenu.currentSize) {
					Computer computer = MainMenu.inventory[index];
	                System.out.println("Current information of Computer #" + (index + 1));
	                System.out.println(computer);
	                MainMenu.updateMenu();
				}
				else {
					System.out.println("Invalid computer index. Returning to the main menu or Enter Another Index.");
				}
				return;
			}
			else {
               tries++;
               System.out.println("Incorrect password. Try again. (" + (MAX_TRIES - tries) + " tries remaining)");
			}
		}
		 System.out.println("You've exceeded the maximum number of attempts. Returning to the main menu.");
	}
	
	
    public static void findComputersByBrand() {
    	
        System.out.print("Enter the brand name : ");
        String searchBrand = sc.next();
        System.out.println("Computers with brand '" + searchBrand + "':");
        
        //looping the currentsize to check how many similar brands are there in inventory
        for (int i = 0; i < MainMenu.currentSize; i++) {
        	
        	//checking the condition search value is equal to previous values
            if (MainMenu.inventory[i].getBrand().equalsIgnoreCase(searchBrand)) {
            	
                System.out.println("Computer #" + (i + 1));
                System.out.println(MainMenu.inventory[i]);
                
            }
        }
    }
    
    public static void findInderCertenPrice() {
    	
    	System.out.println("Enter the price");
    	double searchPrice = sc.nextDouble();
    	System.out.println("Computers cheaper than $" + searchPrice + ":");
    	
    	//looping the currentsize inventory to check prices under seaarchPrice 
        for (int i = 0; i < MainMenu.currentSize; i++) {
        	
        	// checking the searchprice in inventory 
            if (MainMenu.inventory[i].getPrice() < searchPrice) {
            	
                System.out.println("Computer #" + (i + 1));
                System.out.println(MainMenu.inventory[i]);
            }
        }
    }
    
    
}
