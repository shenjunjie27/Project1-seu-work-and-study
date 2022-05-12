package seu.edu.cn.year2022.month04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (sc1.hasNextLine()) {
            String s = sc1.nextLine();
            if (s.equals("0"))
                break;
            list.add(s);
        }
    }
}
