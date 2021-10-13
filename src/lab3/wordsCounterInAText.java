package lab3;

public class wordsCounterInAText {
    //This is my implementation of counting every word frequency's in a text

    private String text = " ";

    public String[] getUniqueWords(String[] words) {
        String[] uniqueWords = new String[words.length];
        uniqueWords[0] = words[0];
        int uniqueWordsIndex = 1;
        boolean wordAlreadyExists = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    wordAlreadyExists = true;
                }
            }
            if (!wordAlreadyExists) {
                uniqueWords[uniqueWordsIndex] = words[i];
                uniqueWordsIndex++;
            }
            wordAlreadyExists = false;
        }
        return uniqueWords;
    }

    public void MostUsedWordsSecondOption() {
        String[] words = text.split(" ");
        String[] uniqueWords;
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        int counter = 0;
        uniqueWords = getUniqueWords(words);

        for (String word : uniqueWords) {
            if (null == word) {
                break;
            }
            for (String s : words) {
                if (word.equals(s)) {
                    counter++;
                }
            }
            System.out.println("Count of [" + word + "] is : " + counter);
            counter = 0;
        }
    }
}
