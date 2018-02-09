package question7;

public class Solution {
    public static int reverse(int x) {
        long result = 0;
        int temp = x;
        int max_digit = 0;
        while (temp!=0){
            max_digit++;
            temp/=10;
        }

        while (x!=0){
            result+=getpow(x%10,--max_digit);
            x/=10;
        }
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

    public static long getpow(int num, int a){
        long result = 1;
        for (int i = 0; i<a;i++){
            result*=10;
        }
        result*=num;
        return result;
    }
}
