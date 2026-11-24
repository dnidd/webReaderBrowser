import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Class takes URL argument.
 * Creates URL object with argument in constructor.
 * Reads HTML content line by line.
 */
public class UrlReader {

    /**
     * URL points to input address and fetches content via HTML.
     * @param urlString = user input.
     */
    public void getPage(String urlString) {
        StringBuffer buffer = new StringBuffer();
        String line = "";

        try {
            URL url = new URL(urlString);
            try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
                while ((line = in.readLine()) != null) {
                    buffer.append(line).append("\n");
                }
            }

            String text = buffer.toString();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
