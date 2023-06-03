package Stocks;

import java.io.Serializable;
import java.util.Scanner;

import Exception.ItemFormatException;

public abstract class Stock implements StockInput,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2169479925015984021L;
	protected StockKind kind = StockKind.Cu;
	protected int id;
	protected String item;
	protected String name;
	
	public Stock() {
	}
	
	public Stock(StockKind kind) {
		this.kind=kind;
	}


	public Stock(int id, String item) {
		this.id= id;
		this.item=item;

	}
	
	public Stock(int id, String item, String name) {
		this.id= id;
		this.item=item;
		this.name=name;
	
	}
	
	public Stock(StockKind kind,int id,String item,String name) {
		this.kind=kind;
		this.id=id;
		this.item=item;
		this.name=name;
	}
	
	public StockKind getKind() {
		return kind;
	}


	public void setKind(StockKind kind) {
		this.kind = kind;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item)throws ItemFormatException {
		if(!item.contains("#")&&!item.equals("")) {
			throw new ItemFormatException();
		}
		this.item = item;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public abstract void printInfo(); 
	
	public void setStockID(Scanner input) {//
		System.out.print("Stock ID:");
		int id=input.nextInt();
		this.setId(id);
	}
	
	public void setStockItem(Scanner input) {//
		String item="";
		while(!item.contains("#")) {
			System.out.print("Stock Item:");
			item=input.next();	
			try{
				this.setItem(item);
			}
			catch(ItemFormatException e) {
				System.out.println("Incorrect Item Format. Put the item that contains #");
			}
		}
		
	}
	
	public void setStockName(Scanner input) {
		System.out.print("Stock Name:");
		String name=input.next();				
		this.setName(name);
	}
	
	public String getKindString() {
		String skind ="none";
		switch(this.kind) {
		case Cu:
			skind="Cu.";
			break;
		case Gs25:
			skind="Gs.";
			break;
		case Seveneleven:
			skind="Seven.";
			break;
		case MiniStop:
			skind="Mini.";
			break;
		default:
		}
		return skind;
	}

}

