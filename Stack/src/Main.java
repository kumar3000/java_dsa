import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();

        games.push("Minecraft");
        games.push("Rimworld");
        games.push("CS2");
        games.push("Madden");

        System.out.println(games.pop());
    }
}
