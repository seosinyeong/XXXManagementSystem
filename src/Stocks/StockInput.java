package Stocks;


import java.util.Scanner;

import Exception.ItemFormatException;

public interface StockInput {
	
	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setItem(String item) throws ItemFormatException;
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setStockID(Scanner input);
	public void setStockItem(Scanner input);
	public void setStockName(Scanner input);
}
