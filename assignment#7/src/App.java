public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy! ";
        String target1 = "not "; 
        String target1again = " >:(";

        String message2 = "That was great - lol.";
        String target2 = "laugh out loud";

        System.out.println(message1.substring(0,5) + target1 + message1.substring(10,15) + target1again);
        System.out.println(message2.substring(0,17) + target2);
    }
}
