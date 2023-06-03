package martMangement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Stocks.CuStock;
import Stocks.Gs25ConvenienceStock;
import Stocks.MiniStopConvenienceStock;
import Stocks.StockInput;
import Stocks.StockKind;

public class StockManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9108719193476608529L;
	
	ArrayList<StockInput> stocks=new ArrayList<StockInput>();
	transient Scanner input;
	StockManager(Scanner input){
		this.input=input;
	}

	public void addStocks() {
		StockInput stockInput;
		int kind = 0;
		while(kind<=1||kind>3) {
			try {
				System.out.print("1 for Cu ");
				System.out.print("2 for Gs25 ");
				System.out.print("3 for Ministop ");
				System.out.print("Select num 1 , 2 or 3 for Stock kind :  ");
				kind =input.nextInt();
				if (kind == 1) {
					stockInput= new CuStock(StockKind.Cu);
					stocks.add(stockInput);
					stockInput.getUserInput(input);
					break;
				}
				else if(kind == 2) {
					stockInput= new Gs25ConvenienceStock(StockKind.Gs25);						
					stocks.add(stockInput);
					stockInput.getUserInput(input);
					break;
				}
				else if(kind == 3) {
					stockInput= new MiniStopConvenienceStock(StockKind.MiniStop);						
					stocks.add(stockInput);
					stockInput.getUserInput(input);
					break;
				}
				else {
					System.out.print("Select num for Student Kind between 1 and 2: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
				}
			}
	}

	
	public void deleteStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		int index=findIndex(stocksID);
	
		removefromStock(index,stocksID);
	
	}
	
	public int findIndex(int stocksID) {
		int index=-1;
		for(int i=0;i<stocks.size();i++) {
			if (stocks.get(i).getId()==stocksID) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStock(int index,int stocksID) {
		if(index>=0) {
			stocks.remove(index);
			System.out.println("the stock "+stocksID+" is deleted");
			return 1;
		}
		
		else {
			System.out.println("the stock has not been registered");
			return -1;
		}
	}
	
	public void editStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		
		for(int i=0;i<stocks.size();i++) {	
			StockInput stock =stocks.get(i);

		if (stock.getId()==stocksID) {
			int num =-1;
			while(num!=5) {
				showEditStock();
				num=input.nextInt();
				switch(num) {
				case 1:
					stock.setStockID(input);
					break;
				case 2:					 
					stock.setStockItem(input);
					break;
				case 3:
					stock.setStockName(input);
					break;
				default:
					continue;
				}
				
			}//while
			break;
		}//if
	
	}//for
}
	
	public void viewStocks() {
		System.out.println("# of registered students:"+ stocks.size());
		for(int i=0;i<stocks.size();i++) {		
			stocks.get(i).printInfo();
		}
}
	
	
	public void showEditStock() {
		System.out.println("***Stocks Management System Menu***");
		System.out.println("1. Edit Id: ");
		System.out.println("2. Edit Item: ");
		System.out.println("3. Edit name: ");
		System.out.println("4. Exit ");
	}
}
