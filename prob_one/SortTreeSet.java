import java.util.*;
public class SortTreeSet{

	TreeSet ts=new TreeSet(new MyComparator());

	public static void main(String[] args) {
		SortTreeSet sts= new SortTreeSet();
		String toSort="abcdefghijklmnopqrstuvwxyz_";//answer
		String poolOfOccurances="aaaaaaaaaaaaaaaaaaannnnnnnnnnnnsssssssswwwwwweeeerrvloqpkmbhrx__";
		//add the elements to the TreeSet, alread sorted.
		for(int i=0;i<toSort.length();i++){
			Letter l=new Letter();
			l.setLetter(toSort.charAt(i));
			l.setValue(getCharacterFrequence(toSort.charAt(i),poolOfOccurances));
			sts.ts.add(l);
		}

		ArrayList list= new ArrayList(sts.ts);
		for(int i=0;i<6;i++){
			Letter letter=(Letter)list.get(i);
			System.out.println(letter.getLetter()+" : "+letter.getValue());
		}
	}//end main

	private static int getCharacterFrequence( char c,String poolOfOccurances){
		int count=0;
		for(int j=0;j<poolOfOccurances.length();j++){
			if(poolOfOccurances.charAt(j)==c){
				count+=1;
			}
		}
		return count;
	}

	private class MyComparator implements Comparator{
		public int compare(Object o1,Object o2){
			Letter l1=(Letter)o1;
			Letter l2=(Letter)o2;
			return (new Integer(l2.getValue())).compareTo(new Integer(l1.getValue()));

		}
	}

}//end class

