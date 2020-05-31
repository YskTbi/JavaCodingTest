package solution;

import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        // 標準入力を1行ずつ読み出す。
        int count = 1;
        while (stdin.hasNextLine()) {
            String line = stdin.nextLine();
            System.out.println(count +" " +line);
            count++;
        }
        stdin.close();
    }
}