/**
 * The Balance class represents a user's monetary balance with their name
 * and balance. It provides functionality to encode the user's name in HTML format
 * and display a representation of the balance information.
 */
public class Balance {
    private String name;
    private int balance;

    /**
     * Constructor for the Balance class. It initializes the user's name and balance,
     * encoding the name in HTML format to prevent security issues related to
     * HTML injection.
     * @param name      The user's name, which will be encoded in HTML format.
     * @param balance   The user's initial balance.
     */
    public Balance(String name, int balance) {
        this.name = encodeHtml(name);
        this.balance = balance;
    }

    /**
     * Encodes a text string to be safe in an HTML context, replacing special
     * characters like "&", "<", ">", and double quotes with their corresponding
     * HTML entities.
     * @param text      The text to be encoded.
     * @return          A string where special characters are replaced by their corresponding
     *                  HTML entities
     */
    public static String encodeHtml(String text) {
        text = text.replace("&", "&amp;");
        text = text.replace("<", "&lt;");
        text = text.replace(">", "&gt;");
        text = text.replace("\"", "&quot;");
        return text;
    }

    /**
     * Returns a string representation of the user's balance, including their
     * name and balance formatted in a friendly message.
     * @return          A message that includes the user's name and balance in a readable
     *                  text format.
     */
    @Override
    public String toString() {
        return "Hello, " + name + "! Your balance is $" + balance + ".";
    }

}
