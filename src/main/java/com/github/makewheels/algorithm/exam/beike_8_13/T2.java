package com.github.makewheels.algorithm.exam.beike_8_13;

/**
 * 牛妹拿到了一个只由小写字母组成的字符串s,
 * 接下来将字符串执,行k次操作,
 * 每次操作都会把s中ASCI1码马最小的字母从s中删除,
 * 请返回k次操作之后的字符串s.
 */
public class T2 {
    private char getMinChar(String s) {
        char minChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i);
            }
        }
        return minChar;
    }

    public String NS_String(String s, int k) {
        for (int i = 0; i < k; i++) {
            char minChar = getMinChar(s);
            s = s.replace(minChar + "", "");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new T2().NS_String("cbcb", 1));
    }
}
