package Stocks;

import java.util.Scanner;

import Exception.ItemFormatException;

public class MiniStopConvenienceStock extends CommonStock {
	
	
	protected int companyid;
	protected String companyitem;
	
	public MiniStopConvenienceStock(StockKind kind) {
		super(kind);
	}

	
	public void getUserInput(Scanner input) {
		setStockID(input);
		setStockItemwithYN(input);
		setCompanyItemwithYN(input);
		setStockName(input);
	}
		
	public void setCompanyItemwithYN(Scanner input) {
		char answer='x';
		while(answer!='y'&& answer!='Y' && answer!='N' && answer!='n') {
			System.out.print("Do you have a company's item? (Y/N)");
			 answer=input.next().charAt(0);
			try {
				if(answer =='y'|| answer=='Y') {
					setStockItem(input);
					break;
				}
				else if(answer=='N'||answer=='n') {
					this.setItem("");
					break;
				}
				else {
				}
			}
			catch(ItemFormatException e) {
				System.out.println("Incorrect Item Format. Put the item that contains #");
			}
		}
	}
		
	
		public void printInfo() {
			String skind =getKindString();
			System.out.println("kind: "+skind+"company's id"+id+"company's item:"+item+"name:"+name);
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
