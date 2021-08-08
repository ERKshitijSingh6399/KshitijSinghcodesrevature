package eg1;

public class billlist implements Comparable<billlist> {

	private String itemName;
	private double price;
	private int qty;
	public billlist(String itemName, double price, int qty) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public int compareTo(billlist o) {
		String i1=this.itemName;
		String i2=o.itemName;
		return i1.compareTo(i2);
	}
	@Override
	public String toString() {
		return itemName+" "+price+ " "+qty+"\n";
	}
   public void printStatement() {
		
		System.out.printf("  %8s %5.2f %6d %10.2f\n",itemName,price,qty,price*qty);

	}

}