package Stocks;

import java.util.Scanner;

import Exception.ItemFormatException;

public abstract class CommonStock extends Stock{
	
	public CommonStock(StockKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind=getKindString();
		System.out.println("kind: "+skind+" id: "+id+" item:"+item+" name: "+name);
	}
	
	public void setStockItemwithYN(Scanner input) {
		char answer='x';
			while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
				System.out.print("Do you have an item? (Y/N)");
				answer=input.next().charAt(0);
				try {
					if(answer=='y'||answer=='Y') {
						System.out.print("Stock Item: ");
						String item=input.next();
						this.setItem(item);
						break;
					}
					else if(answer=='n'||answer=='N') {
						this.setItem("");
						break;
					}
					else {
						
					}
				}
				catch(ItemFormatException e) {
					System.out.println("Incorrect Item Format.Put the item that contains #");
				}
			}
	}
}
