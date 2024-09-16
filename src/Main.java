public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance("<script>alert('XSS')</script>",1000);
        System.out.println(balance);
    }
}