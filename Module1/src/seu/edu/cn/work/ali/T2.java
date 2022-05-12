/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.338-+08:00
 */

package seu.edu.cn.work.ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        List<String> list = new ArrayList<>();
        int n_count = n;
        while (n_count-- != 0) {
            String s1 = sc.nextLine();
            list.add(s1);
        }
        String[][] chessboard = new String[n][m];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                chessboard[i][j] = String.valueOf(list.get(i).charAt(j));
            }

        }
        if (isWin(chessboard, "r")) {
            System.out.println("kou");

        } else if (isWin(chessboard, "p")) {
            System.out.println("yukari");
        } else {
            System.out.println("to be continued");
        }


    }
        //五子棋胜负判断
    public static boolean isWin(String[][] chessboard, String player) {
        int n = chessboard.length;
        int m = chessboard[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chessboard[i][j].equals(player)) {
                    if (isWin(chessboard, i, j, player)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //判断是否连成五子
    public static boolean isWin(String[][] chessboard, int i, int j, String player) {
        int n = chessboard.length;
        int m = chessboard[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        if (!chessboard[i][j].equals(player)) {
            return false;
        }
        if (i == 0 && j == 0) {
            return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i, j + 1, player);
        } else if (i == 0 && j == m - 1) {
            return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i, j - 1, player);
        } else if (i == n - 1 && j == 0) {
            return isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j + 1, player);
        } else if (i == n - 1 && j == m - 1) {
            return isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j - 1, player);
        } else if (i == 0) {
            return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i, j + 1, player) || isWin(chessboard, i, j - 1, player);
        } else if (i == n - 1) {
            return isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j + 1, player) || isWin(chessboard, i, j - 1, player);
        } else if (j == 0) {
            return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j + 1, player);
}
        else if (j == m - 1) {
            return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j - 1, player);
        }
        return isWin(chessboard, i + 1, j, player) || isWin(chessboard, i - 1, j, player) || isWin(chessboard, i, j + 1, player) || isWin(chessboard, i, j - 1, player);
    }
}

