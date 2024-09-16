# Balance Class

The `Balance` class represents a user's monetary balance and encodes the user's name to make it safe for HTML contexts. This is particularly useful to avoid security issues such as **HTML injection** or **Cross-Site Scripting (XSS)** attacks, where an attacker might insert malicious code that gets executed by a browser.

## Features

- Stores a user's name and balance.
- Encodes special characters in the user's name to their HTML-safe equivalents (e.g., `<`, `>`, `&`).
- Prevents malicious HTML from being injected and executed.
- Provides a human-readable string representation of the user's balance.

### Encoding Logic

The following characters are replaced with their HTML entities:
- `&` → `&amp;`
- `<` → `&lt;`
- `>` → `&gt;`

## Class Breakdown

### Balance Class

#### Constructor

```java
public Balance(String name, int balance)
```

- name: The user's name, which is encoded in HTML-safe format.
- balance: The user's balance as an integer.

### Methods
- `public static String encodeHtml(String text)`: Encodes the string to replace special HTML characters 
with their corresponding entities.
- `@Override public String toString()`: Returns a user-friendly message displaying the user's name and balance.


### Example
This example demonstrates how the class works by creating a Balance object with 
a potentially harmful string as the name and printing out the result.

### Main class

```java
public class Main {
public static void main(String[] args) {
Balance balance = new Balance("<script>alert('XSS')</script>", 1000);
System.out.println(balance);
}
}
```

Output
```bash
Hello, &lt;script&gt;alert('XSS')&lt;/script&gt;! Your balance is $1000.
```