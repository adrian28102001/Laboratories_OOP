package lab3;

import java.util.*;

import java.util.stream.Collectors;

public class textManipulation {
    private String text = " ";
    private int counterVowel;
    private int counterConsonants;
    private int counterSentences;


    //setter of a text
    public void setText(String text) {
        this.text = text;
    }

    //function to count sentences in a text
    public void countSentences() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') //checks for ending of a sentence
                counterSentences++;
        }
        System.out.println("The number of sentences " + counterSentences);
    }

    //function to count letters in a text
    public void countLetters() {
        String temporary;
        temporary = text.replaceAll("[^a-zA-Z0-9]", ""); //take out every symbol from the text
        System.out.println("The number of letters " + temporary.length());
    }

    public void countVowelsConsonants() {
        String str = text.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                counterVowel++;
            }
            //Checks whether a character is a consonant
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //Increments the consonant counter
                counterConsonants++;
            }
        }
        System.out.println("Number of vowels: " + counterVowel);
        System.out.println("Number of consonants: " + counterConsonants);
    }
    //this is the easiest method to implement it, by using power of Java libraries
    // but there is a similar function in class wordsCounterInAText
    public void countTopWordsUsingJava() {
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


}






