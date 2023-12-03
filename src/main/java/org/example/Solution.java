package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> answArr = new ArrayList<String>();
        if(digits.length()==0) return answArr;
        combination(digits, 0, "", answArr);
        return answArr;
    }
    public static void combination (String digits, int index, String answ, ArrayList<String> answArr){
        if (index==digits.length()){
            answArr.add(answ);
            return;
        }
        String key = keypad[digits.charAt(index)-'0'];
        for (int i = 0; i < key.length(); i++) {
            combination(digits, index+1, answ+key.charAt(i), answArr);
        }
    }

    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target){
        ArrayList<Integer> answ = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)+nums.get(j)==target){
                    answ.add(i);
                    answ.add(j);
                    return answ;
                }
            }
        }
        return nums;
    }

    public static boolean isPalindrome(int x){
        int n = x;
        int reversed = 0;
        if (n < 0){return false;}
        if (n%10==0 && n!=0){return false;}
        while (n!=0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(reversed);
        return x==reversed;
    }
}