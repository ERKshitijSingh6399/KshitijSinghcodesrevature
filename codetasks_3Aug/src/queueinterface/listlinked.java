package queueinterface;
import java.util.*;
public class listlinked {
public static void main(String[] args)
{
	LinkedList<Integer> L = new LinkedList<Integer>();
	L.add(1);
	L.add(7);
	L.add(6);
	L.add(4);
	L.add(5);
	L.add(0);
	L.add(9);
	L.add(11);
	L.add(1,45);
	L.add(1);
	System.out.println(L);
	L.remove(1);  //remove index 1 value
	System.out.println(L);
}
}
