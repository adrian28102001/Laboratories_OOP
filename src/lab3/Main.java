package lab3;

public class Main {
    public static void main(String[] args) {
        String MyText = "Find out exactly how many sentences are in your text content using this online sentence counter! " +
                "This sentence counting tool will also give you basic information on the number of words and characters in your text. " +
                "This tool will automatically figure out the number of sentences, words, and characters that you have in most any " +
                "type of text content. The text information you want to analyze can be many formats. This sentence counter can " +
                "handle anything from a single string of text or to very long content composed of numerous text paragraphs separated " +
                "by multiple line breaks.";

        TextManipulation text = new TextManipulation();
        text.setText(MyText);
        text.countWords();
        text.countSentences();
        text.countLetters();
        text.countVowelsConsonants();
        text.longestWordFunction();
        //text.longestWord(); this is using Java8
        text.countTopWords();
    }
}
