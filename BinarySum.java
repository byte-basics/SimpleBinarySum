package com.bytebasics;

public class BinarySum {
    public String addBinaryNums(String binNum1, String binNum2) {
        StringBuilder answer = new StringBuilder();
        int i = binNum1.length() - 1;
        int j = binNum2.length() - 1;
        int carry = 0;
        while(i > -1 || j > -1 || carry > 0) {
            int num1 = i > -1? Character.getNumericValue(binNum1.charAt(i)) : 0;
            int num2 = j > -1? Character.getNumericValue(binNum2.charAt(j)) : 0;
            int sum = num1 + num2 + carry;
            if(sum < 2) {
                carry = 0;
                answer.append(sum);
            } else if(sum < 3) {
                carry = 1;
                answer.append(0);
            } else {
                carry = 1;
                answer.append(1);
            }
            i--;
            j--;
        }
        return answer.reverse().toString();
    }
}
