package basic;

import java.util.Scanner;

public class ReplaceAll0sWith5 {

    int convertfive(int num)
    {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append('5');
            } else {
                sb.append(s.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
