// Term 191 - Week 11
//Ananagrams
//156
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p156 {
	public static void main(String[] args) {
		int i, j;
		boolean foundAnagram;
		
		String currentWord;
		Scanner kb = new Scanner(System.in);
		
		ArrayList<String> wordsList = new ArrayList<>(30);
		ArrayList<String> ananagrams = new ArrayList<>(30);
		
		currentWord = kb.next();
		//This loop saves all words in a sorted by length ArrayList.
		while(!currentWord.equals("#")) {
			for(i = 0; wordsList.size() != 0 && i < wordsList.size() && currentWord.length() > wordsList.get(i).length(); i++)
				;
			wordsList.add(i, currentWord);
			currentWord = kb.next();
		}
		
		//This loop is responsible for comparing each word of length "k" with other words of length "k", and find out if this word is an anagram or not.
		//If an anagram is found, it gets removed from the array list, along with all the possible combinations, thus, the array size approaches zero.
		//Ananagram words are removed as well, and moved to another array list.
		for(i = 0; i < wordsList.size(); i++) {
			foundAnagram = false;
			currentWord = wordsList.get(i); //Saves the word that others will compare to.
			
			//If the ArrayList has more than one word, and the next word is of the same length (Obviously needed to be an anagram)
			if(wordsList.size() > 1 && currentWord.length() == wordsList.get(i + 1).length()) {
				
				//Compare currentWord will all words of the same length
				for(j = i + 1; j < wordsList.size() && currentWord.length() == wordsList.get(j).length(); j++) {
					
					//If there exists an anagram, delete it (keep the first instance because we need it to compare with other instances)
					if(isAnagram(currentWord.toLowerCase(), wordsList.get(j).toLowerCase())) {
						wordsList.remove(j);
						foundAnagram = true;
						j--; //To not skip the next word
					}
				}
				if(foundAnagram) {
					//Remove the first instance of the anagram
					wordsList.remove(currentWord);
					i = -1; //To recheck from the beginning of the original wordsList
				} else { //If the word is not an anagram, then save it to the ananagram list, and remove it from the current list.
					ananagrams.add(currentWord);
					wordsList.remove(currentWord);
					i = -1;
				}
			}
			//For all cases where the array may contain only one word, or the word is the only word with the same length, then it is an ananagram
			else {
				ananagrams.add(currentWord);
				wordsList.remove(currentWord);
				i = -1;
			}
		}
		Object[] sortedAnanagrams = ananagrams.toArray();
		Arrays.sort(sortedAnanagrams);
		for(i = 0; i < sortedAnanagrams.length; i++)
			System.out.println(sortedAnanagrams[i]);
		kb.close();
	}
	
	
	public static boolean isAnagram(String w1, String w2) {
		for(int i = 0; i < w1.length(); i++)
			w2 = w2.replaceFirst(String.valueOf(w1.charAt(i)), "");
		return w2.length() == 0;
	}
}

