public class Main {
    public static void main(String[] args) {
        String textInput = "Hello, world! Hello, Aboba? Hello, John.";
        Text text = new Text(textInput);

        System.out.println("Original Text: " + text);

        TextAnalyzer analyzer = new TextAnalyzer();
        analyzer.findMostFrequentWord(text);
    }
}
