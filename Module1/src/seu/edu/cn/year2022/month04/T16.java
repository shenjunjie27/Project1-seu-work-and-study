package seu.edu.cn.year2022.month04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            print(line);
        }
        sc.close();


    }

    public static void print(String s) {
        HashMap<Integer, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsValue(s.charAt(i))) {
                map.put(i, s.charAt(i));
            }

        }
        StringBuffer sb = new StringBuffer();
        for (Character c : map.values()) {
            sb.append(c);
        }
        System.out.println(sb.toString());


    }

}

