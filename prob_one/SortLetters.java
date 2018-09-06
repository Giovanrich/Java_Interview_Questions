

import java.util.*;
public class SortLetters{
	public static void main(String[] args) {
		String toSort="abcdefghijklmnopqrstuvwxyz_";//answer
		StringBuffer finalAns=new StringBuffer();
		ArrayList<Letter> letters= new ArrayList<>();
		int count=0;

		for(int i=0;i<toSort.length();i++){
			Letter l= new Letter();
			l.setLetter(toSort.charAt(i));
			l.setValue(getCount(toSort.charAt(i)));
			letters.add(l);
		}
		
		letters.sort((p1, p2)->new Integer(p2.getValue()).compareTo(p1.getValue()));

		for (int i=0;i<6;i++ ) {
			finalAns.append(letters.get(i).getLetter());
			
		}
		System.out.println(finalAns);

	}

	public static int getCount(char c){
		String poolOfOccurances="aaaaaaaaaaaaaaaaaaannnnnnnnnnnnsssssssswwwwwweeeerrvloqpkmbhrx__";
		int count=0;
		for(int i=0;i<poolOfOccurances.length();i++){
			if (poolOfOccurances.charAt(i)==c) {
				count +=1;
			}
		}
		return count;
	}

}