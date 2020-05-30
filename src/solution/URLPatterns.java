package solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class URLPatterns{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(new MyRegex().pattern);
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    //String pattern = "(00[0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5] \\.){3}00[0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5] ";
	String pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])[.]){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])$";
}
