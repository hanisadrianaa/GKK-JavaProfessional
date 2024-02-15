package Lesson7.Exercise;

public class HTTPReader {
    private static final String EXAMPLE_URL = "https://www.google.com";

    private static final String MOCK_CONTENT = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Sample Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>Sample Heading</h1>\n" +
            "<p>This is some sample content.</p>\n" +
            "</body>\n" +
            "</html>";

    public String simulateParseUrlResponse() {
        // Replace with actual network calls and HTML parsing when possible
        return MOCK_CONTENT;
    }

    public void printContent() {
        String content = simulateParseUrlResponse();
        System.out.println(content);
    }
}
