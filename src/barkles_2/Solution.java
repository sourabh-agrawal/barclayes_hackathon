package barkles_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args)throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine().trim());
        String a = br.readLine().trim();
        String b = br.readLine().trim();
        StringTokenizer st1 = new StringTokenizer(a);
        StringTokenizer st2 = new StringTokenizer(b);
        int cost1 = 0, cost2 = 0, sum1 = 0, sum2 = 0;
        while(st1.hasMoreTokens()){
            int a1 = Integer.parseInt(st1.nextToken());
            cost1 = (cost1)|a1;
            sum1 += a1;
        }
        while(st2.hasMoreTokens()){
            int b2 = Integer.parseInt(st2.nextToken());
            cost2 = (cost2)|b2;
            sum2 += b2;
        }
        int reward1 = sum1-cost1;
        int reward2 = sum2 - cost2;
        if(reward1>reward2){
            int margin = reward1 - reward2;
            System.out.println(1 + " "+ margin);
        }else if(reward2>reward1){
            int margin = reward2 - reward1;
            System.out.println(2 + " "+ margin);
        }else if(reward1==reward2){
            System.out.println(-1+"");
        }
    }

}
