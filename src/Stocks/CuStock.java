package Stocks;

import java.util.Scanner;

public class CuStock extends Stock {
	
	public CuStock(StockKind kind) {
		super(kind);
	}
	
	
	
	public void getUserInput(Scanner input) {
		setStockID(input);
		setStockItem(input);
		setStockName(input);

	}
	public void printInfo() {
		String skind =getKindString();
		System.out.println("kind: "+skind+" company's id: "+id+" company's item: "+item+" name: "+name);
	}
	
}
