import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<Word>();
	}

	public Words(String s)
	{
		setWords(s);
	}

	public void setWords(String s)
	{
		//Clear the list
		wordList.clear();

		//Create a scanner to chop up the string of numbers
		Scanner chopper = new Scanner(System.in);

		//Chop up the string
		while(chopper.hasNext())
		{
			wordList.add(new Word(chopper.nextWord()));
		}

	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
		size = 5;
		//for every Word in the ArrayList "wordList"
		for(int i=0; i <wordList.Length(); i++)
			if(Words.length()==5)
				count++;				
			//if the length of the "theWord" is the same as the parameter "size"

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop

			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
		
			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "" + wordList;
	}
}