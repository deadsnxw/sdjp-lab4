import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements;

    public Sentence(String sentence) {
        elements = new ArrayList<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty() && !word.matches("[.,!?]")) {
                elements.add(new Word(word));
            } else {
                for (char ch : word.toCharArray()) {
                    elements.add(new CharacterUnit(ch));
                }
            }
        }
    }

    public List<Object> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object element : elements) {
            builder.append(element.toString());
        }
        return builder.toString();
    }
}
