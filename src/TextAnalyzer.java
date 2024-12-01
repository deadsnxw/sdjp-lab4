import java.util.List;

public class TextAnalyzer {
    public void findMostFrequentWord(Text text) {
        List<Sentence> sentences = text.getSentences();
        int maxFrequency = 0;
        String mostFrequentWord = "";

        for (Sentence sentence : sentences) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    String word = ((Word) element).getWord().toLowerCase();
                    int frequency = countWordFrequency(word, sentences);

                    if (frequency > maxFrequency) {
                        maxFrequency = frequency;
                        mostFrequentWord = word;
                    }
                }
            }
        }

        System.out.println("The most frequent word is: " + mostFrequentWord);
        System.out.println("Number of sentences containing the word: " + maxFrequency);
    }

    private int countWordFrequency(String word, List<Sentence> sentences) {
        int count = 0;
        for (Sentence sentence : sentences) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word && ((Word) element).getWord().equalsIgnoreCase(word)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
