import java.io.*;
import java.util.*;

public class αlphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char ch = buffer.readLine().charAt(0);
        if (Character.isUpperCase(ch))
            sb.append("A\n");
        else
            sb.append("a\n");
        System.out.println(sb);
    }
}
