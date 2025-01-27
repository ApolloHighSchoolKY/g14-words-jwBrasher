public class WordTester
{
    public static void main (String[] args)
    {
        Word word = new Word("word");

        System.out.println(word);
        System.out.println("Number of vowels = " + wordgetNumVowels());
        System.out.println("Length = " + word.getLength());

        word.setWord("newWord");
        System.out.println(word);
        System.out.println("Number of vowels = " + wordgetNumVowels());
        System.out.println("Length = " + word.getLength());
    }
}