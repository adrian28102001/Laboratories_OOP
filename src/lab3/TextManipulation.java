package lab3;

import java.util.*;
import java.util.stream.Collectors;

public class TextManipulation {
    private String text = " ";

    public String getText() {
        return text;
    }
    //setter of a text

    public void setText(String text) {
        this.text = text;
    }

    //function to count sentences in a text
    public void countSentences() {
        int counterSentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') //checks for ending of a sentence
                counterSentences++;
        }
        System.out.println("The number of sentences " + counterSentences);
    }

    public void countWords() {
        int wordCount = 1; //1 because each text will end in an . or ! which is not an white space as we ask. For example "Ana has apples!" 2 whitespaces, 3 words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("In your text, there are: " + wordCount + " words");
    }

    //function to count letters in a text
    public void countLetters() {
        String temporary;
        temporary = text.replaceAll("[^a-zA-Z0-9]", ""); //take out every symbol from the text
        System.out.println("The number of letters " + temporary.length());
    }

    public void countVowelsConsonants() {
        int counterVowel = 0;
        int counterConsonants = 0;
        String str = text.toLowerCase();
        String temporary = str.replaceAll("[^a-zA-Z0-9]", ""); //take out every symbol from the text
        for (int i = 0; i < temporary.length(); i++) {
            //Checks whether a character is a vowel
            if (temporary.charAt(i) == 'a' || temporary.charAt(i) == 'e' || temporary.charAt(i) == 'i' || temporary.charAt(i) == 'o' || temporary.charAt(i) == 'u') {
                //Increments the vowel counter
                counterVowel++;
            }
            //Checks whether a character is a consonant
            else {
                counterConsonants++;
            }
        }
        System.out.println("Number of vowels: " + counterVowel);
        System.out.println("Number of consonants: " + counterConsonants);
    }

    //this is the easiest method to implement it, by using power of Java libraries
    // but there is a similar function in class WordsCounterInAText
    public void countTopWords() {

        String strArray[] = text.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].replaceAll("[^\\w]", "");
        }
        var freq = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        List<Map.Entry<String, Long>> result = freq.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void longestWord() { //this function uses JavaPower
        String longest = Arrays.stream(text.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null); //
        System.out.println("Longest text word in this text is: " + longest);
    }

    public void longestWordFunction() { //this function uses my knowledge
        String[] word = text.split(" ");
        String longest = " ";

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longest.length())
                longest = word[i];
        }
        System.out.println("Longest text word in this text is: " + longest);
    }

}






