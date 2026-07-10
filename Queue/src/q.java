import java.sql.SQLOutput;
import java.util.*;

public class q {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();

        line.offer("karen");
        line.offer("chad");
        line.offer("steve");

        System.out.println(line);

        line.poll();

        System.out.println(line.peek());
    }
}
