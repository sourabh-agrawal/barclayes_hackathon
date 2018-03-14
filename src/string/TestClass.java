package string;
import org.apache.commons.lang3.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine().trim());
//        String a = br.readLine().trim();
//        char[] c = a.toCharArray();
//        String b = br.readLine().trim();
//        int k = Integer.parseInt(br.readLine().trim());
//122-
        System.out.println(compare('z','e',2));

    }
    public static String compare(char a, char b, int c){

        char A = a;
        char B = b;
        if(a>b){
            int inc = 0;
            int dec = 0;
            while(!(Math.abs((int)A-(int)B)%25 <=c)){
                if(A=='z'){
                    A = 'a';
                }else{
                    A = (char)((int)A+1);
                }
                inc++;
            }
            A = a;
            B = b;
            while(!(Math.abs((int)A-(int)B)%25 <=c)){
                if(B=='a'){
                    B = 'z';
                }else{
                    B = (char)((int)B-1);
                }
                dec++;
            }
            return inc+" "+dec;
        }else if(a<b){
            int inc = 0;
            int dec = 0;
            while(!(Math.abs((int)A-(int)B)%25 <=c)){
                if(B=='z'){
                    B = 'a';
                }else{
                    B = (char)((int)B+1);
                }
                inc++;
            }
            A = a;
            B = b;
            while(!(Math.abs((int)A-(int)B)%25 <=c)){
                if(A=='z'){
                    A = 'a';
                }else{
                    A = (char)((int)A-1);
                }
                dec++;
            }
            return inc+" "+dec;
        }
        else{
            return 0+" "+0;
        }
    }
}
