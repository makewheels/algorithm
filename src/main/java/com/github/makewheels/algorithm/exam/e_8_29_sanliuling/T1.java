package com.github.makewheels.algorithm.exam.e_8_29_sanliuling;

import java.util.*;

/**
 * 老师捞我
 * 时间限制： 3000MS
 * 内存限制： 1048576KB
 * 题目描述：
 * 又到了一学期一次的大学生期末考试。但很多人期末考试的卷面成绩是不能及格的，
 * 需要靠较高的平时成绩来拖上去。平时成绩与期末考试的占比已经确定，
 * 假设平时成绩占比为p，期末考试占比为q，平时分为a，期末考试分数为b，则总成绩为(p*a+q*b)/100。
 * （平时分与期末成绩都是整数，但总成绩可以是小数。）
 * <p>
 * 饶老师心肠特别好，他希望自己的学生及格率尽可能的高。
 * 但他也坚持期末考试分数更高的学生平时成绩也一定要更高。饶老师想知道在这种情况下，
 * 他们班的最大及格人数是多少（及格是指总成绩不低于60分）。
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 第一行三个正整数n，p，q（1<=n<=200,0<=p<=100,0<=q<=100,p+q=100）
 * <p>
 * 第二行n个正整数表示n个学生的期末考试分数（0<=分数<=100）
 * <p>
 * 输出描述
 * 仅一行，一个正整数，表示最大及格人数。
 * <p>
 * <p>
 * 样例输入
 * 2 50 50
 * 50 50
 * 样例输出
 * 2
 * <p>
 * 提示
 * 输入样例2
 * <p>
 * 2 20 80
 * <p>
 * 51 50
 * <p>
 * 输出样例2
 * <p>
 * 1
 * <p>
 * <p>
 * <p>
 * 样例1中，两名同学，考试分数相同，平时分可以分配为100 100，两人都能及格。
 * <p>
 * 样例2中，两名同学，第一位同学因为考试成绩高于第二位同学，故平时分也需要高于第二位同学；
 * 假设第一位同学平时分为100分，第二位同学最高只能得到99分的平时分，无论如何都无法及格。
 */
public class T1 {
    private static final Scanner scanner = new Scanner(System.in);

    private static int[] readArray() {
        String[] split = scanner.nextLine().split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        return arr;
    }

    private static boolean check(int pingshi, int exam, int pingshiRate, int examRate) {
        return (pingshi * pingshiRate + exam * examRate) / 100.0 >= 60.0;
    }

    public static void main(String[] args) {
        int[] arr1 = readArray();
        int p = arr1[1];
        int q = arr1[2];
        int[] scores = readArray();
        Arrays.sort(scores);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = scores.length - 1; i >= 0; i--) {
            Integer num = map.get(scores[i]);
            if (num == null || num == 0) {
                map.put(scores[i], 1);
            } else {
                map.put(scores[i], map.get(scores[i]) + 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        int pingshi = 100;
        int maxExamScore = scores[scores.length - 1];
        int result = 0;
        for (Integer examScore : keySet) {
            if (examScore < maxExamScore) {
                pingshi--;
            }
            boolean check = check(pingshi, examScore, p, q);
            if (check) {
                result += map.get(examScore);
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}
