package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class totalbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<billlist> bill = new ArrayList<>();
		bill.add(new billlist("pencil",5,10));
		bill.add(new billlist("rubber",6,2));
		bill.add(new billlist("scale",10,10));
		bill.add(new billlist("pen",10,18));
		Collections.sort(bill);
		System.out.println("  ItemName  "+"Price    "+"Qty  "+"LineTotal  ");
		for (billlist transaction : bill) {
			transaction.printStatement();
		}
		System.out.println("                           _________");
		
		double s=bill.stream().map(e->e.getPrice()*e.getQty()).reduce(0.0, (sum, element) -> sum + element);
		System.out.println("                      Total= "+s);
		System.out.println("                           _________");
		
	}
}