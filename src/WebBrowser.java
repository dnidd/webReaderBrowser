/**
 * Entry point
 * Takes a URL as argument.
 */
public class WebBrowser {
    public static void main(String[] args) {

        if (args.length == 1) {
            String url = args[0];
            UrlReader reader = new UrlReader();
            // Reads arg as URL line by line.
            reader.getPage(url);
        }

        if (args.length != 1) {
            System.err.println("Usage: java WebBrowser <web address>");
        }
    }
}