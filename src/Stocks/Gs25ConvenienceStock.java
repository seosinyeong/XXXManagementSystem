package Stocks;

import java.util.Scanner;

public class Gs25ConvenienceStock extends CommonStock {
	
	public Gs25ConvenienceStock(StockKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setStockID(input);
		setStockItem(input);
		setStockName(input);
		
	}
}
