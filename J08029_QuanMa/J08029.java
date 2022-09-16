/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08029_QuanMa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class pair{
    private int fi, se;

    public pair(int fi, int se) {
        this.fi = fi;
        this.se = se;
    }

    public int getFi() {
        return fi;
    }

    public int getSe() {
        return se;
    }
}
public class J08029 {
    private static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int solve(pair a, pair b) {
        int[][] f = new int[9][9];
        Queue <pair> q = new LinkedList<>();
        q.add(a);
        while(!q.isEmpty()){
            pair top = q.poll();
            if(top.getFi() == b.getFi() && top.getSe() == b.getSe()){
                return f[b.getFi()][b.getSe()];
            }
            int x = top.getFi(), y = top.getSe();
            for(int i = 0; i < 8; i++){
                int x1 = x + dx[i];
                int y1 = y + dy[i];
                if(x1 > 0 && x1 < 9 && y1 > 0 && y1 < 9 && f[x1][y1] == 0){
                    q.add(new pair(x1, y1));
                    f[x1][y1] = f[x][y] + 1;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String start = sc.next(), end = sc.next();
            pair beg = new pair(start.charAt(0) - 'a' + 1, start.charAt(1) - '0');
            pair fis = new pair(end.charAt(0) - 'a' + 1, end.charAt(1) - '0');            
//            System.out.println(beg.getFi() + " " + beg.getSe());
            System.out.println(solve(beg, fis));
        }   
    }
}
