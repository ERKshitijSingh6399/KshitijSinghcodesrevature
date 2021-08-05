package vowelcodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class uniquevowelcount {

	public static int vowelcountinword(String s)
	{
		s=s.toLowerCase();
		int count=0;
		if(s.contains("a"))
		{
			count++;
		}
		if(s.contains("i"))
		{
			count++;
		}
		if(s.contains("o"))
		{
			count++;
		}
		if(s.contains("u"))
		{
			count++;
		}
		if(s.contains("e"))
		{
			count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		String s = "i thought his name was ChAndrashEkaranakumar but his real name was Rythmplystwqdfgcvhxzyt";
		System.out.println(sortSentenceBasedOnLengthOfWord(s));
	}

public static String sortSentenceBasedOnLengthOfWord(String s) {
	
	Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
	String ar[] = s.split(" ");
	Arrays.sort(ar, Collections.reverseOrder());
	for (String w : ar) {
		int vowelcount=vowelcountinword(w);
		if(map.containsKey(vowelcount)) {
			String temp=map.get(vowelcount);
			temp=temp+" "+w;
			map.put(vowelcount, temp);
		}else {
			map.put(vowelcount, w);
		}
	}
	System.out.println("map : "+map);
	StringBuilder sb=new StringBuilder();
	for(Entry<Integer, String> e:map.entrySet()) {
		sb.append(e.getValue()).append(" ");
	}
	return sb.toString().trim();
}

}