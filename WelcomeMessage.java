package computerstore;


import java.util.Scanner;

public class WelcomeMessage {

	public static void main(String[] args) {
		
		//Entering details of Application name and Developer details
		
		System.out.println("Welcome to The Application :- ComputerStore :");
		System.out.println("Developed by Naveen ");
		System.out.println("------------------------------------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the Required number of computers for your store can contain: ");
		 
		 //storing the user value in maxcomputer 
		 MainMenu.maxComputers = sc.nextInt();
		
		MainMenu menu = new MainMenu(MainMenu.maxComputers);
		menu.mainMenu();
	}

}
