
import java.util.*;
public class SortMap{
	public static void main(String[] args) {
		String toSort="abcdefghijklmnopqrstuvwxyz_";//answer
		String poolOfOccurances="aaaaaaaaaaaaaaaaaaannnnnnnnnnnnsssssssswwwwwweeeerrvloqpkmbhrx__";

		/**
		This is the Map that will store the Key_Value of the Letters(Characters) 
		& their frequence.
		**/
		Map<Character,Integer> theMap=new TreeMap<Character,Integer>();

		//Add key-value pairs to the map
		addEntriesToMap(theMap,toSort,poolOfOccurances);

		//Now sort the map, using a comparator
		Map<Character,Integer> map = new TreeMap<Character,Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		});
		System.out.println(theMap.toString());

	}


	/***
	This method will parse the 'toSort' string, for each char it will
	get the frequence from the 'poolOfOccurances', this becomes the value
	in the key-value Map.
	*/
	private static void addEntriesToMap(
		Map<Character,Integer> map,String toSort, String poolOfOccurances
		){

		//Loop the toStort
		for(int i=0;i<toSort.length();i++){
			map.put(toSort.charAt(i),new Integer(getCharacterFrequence(toSort.charAt(i),poolOfOccurances)));
		}

	}

	private static int getCharacterFrequence( char c,String poolOfOccurances){
		int count=0;
		for(int j=0;j<poolOfOccurances.length();j++){
			if(poolOfOccurances.charAt(j)==c){
				count+=1;
			}
		}
		return count;
	}
}