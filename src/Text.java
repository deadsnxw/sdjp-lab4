import java.util.ArrayList;
import java.util.List;

public class Text {
    private final List<Sentence> sentences;

    public Text(String input) {
        sentences = new ArrayList<>();
        String cleanedInput = input.replaceAll("[\\t\\s]+", " ");
        String[] sentenceParts = cleanedInput.split("[.!?]");
        for (String part : sentenceParts) {
            if (!part.trim().isEmpty()) {
                sentences.add(new Sentence(part.trim()));
            }
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : sentences) {
            builder.append(sentence.toString()).append(". ");
        }
        return builder.toString().trim();
    }
}
