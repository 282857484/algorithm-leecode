package com.leecode.algorithm.easy.convertToBase7;

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num >= 0 ? false : true;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (negative) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
