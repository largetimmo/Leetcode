package question13;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        /**
         * I -> 1
         * V -> 5
         * X -> 10
         * L -> 50
         * C -> 100
         * D -> 500
         * M -> 1000
         */
        HashMap<Character,Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I',1);
        romanIntMap.put('V',5);
        romanIntMap.put('X',10);
        romanIntMap.put('L',50);
        romanIntMap.put('C',100);
        romanIntMap.put('D',500);
        romanIntMap.put('M',1000);
        String roman = "IVXLCDM";
        Character[] roman_arr = {'I','V','X','L','C','D','M'};
        int result = 0;
        for (int i = 0; i<s.length();i++){
            char cur_chr = s.charAt(i);
            if(i != 0){
                char prev_chr = s.charAt(i-1);
                if(roman.indexOf(prev_chr)<roman.indexOf(cur_chr)){
                    result -= (2*romanIntMap.get(prev_chr));
                }
            }
            result += romanIntMap.get(cur_chr);
        }

        return result;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXC"));
    }
}