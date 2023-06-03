package martMangement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import log.EventLogger;


public class Menumanagement {
	
	static EventLogger logger =new EventLogger("log.txt");


	public static void main(String[] args) {
	
		
		Scanner input =new Scanner(System.in);
		StockManager stockmanager= getObject("stockmanager.ser");
		if(stockmanager==null) {
			stockmanager =new StockManager(input);
		}

		selectMenu(input,stockmanager);
		
		putObject(stockmanager,"stockmanager.ser");
	}
		
		public static void selectMenu(Scanner input,StockManager stockmanager) {
			int num =-1;
			while(num!=5) {
				try {		
					showMenu();
				
				num=input.nextInt();
				switch(num) {
				case 1:				
					stockmanager.addStocks();
					logger.log("add a stock");
					break;

				case 2:
					stockmanager.deleteStocks();
					logger.log("delete a stock");
					break;

				case 3:
					stockmanager.editStocks();
					logger.log("edit a stock");
					break;

				case 4:
					stockmanager.viewStocks();
					logger.log("edit a list of stock");
					break;
				default:
					continue;
					
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 and 5!");
					if(input.hasNext()) {
						input.next();
					}
					num=-1;
				}
			}

		}
		
	
	public static void showMenu() {
		System.out.println("***Stocks Management System Menu***");
		System.out.println("1. Add stocks: ");
		System.out.println("2. Delete stocks: ");
		System.out.println("3. Edit stocks: ");
		System.out.println("4. View stocks: ");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-5: ");

	}

	public static StockManager getObject(String filename) {
		StockManager stockmanager = null;
		try {
			FileInputStream file =new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			
			stockmanager=(StockManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return stockmanager;			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return stockmanager;
	}
	
	public static void putObject(StockManager stockmanager,String filename) {
		try {
			FileOutputStream file =new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(stockmanager);
			
			out.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

