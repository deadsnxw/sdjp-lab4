import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<CharacterUnit> characters;

    public Word(String word) {
        characters = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            characters.add(new CharacterUnit(ch));
        }
    }

    public String getWord() {
        StringBuilder builder = new StringBuilder();
        for (CharacterUnit ch : characters) {
            builder.append(ch.getValue());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return getWord();
    }
}
