package com.github.makewheels.algorithm.exam.e_9_4_lanhu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1 {
    private static String simpleNumber(int number) {
        if (number == 0) {
            return "zero";
        } else if (number == 1) {
            return "one";
        } else if (number == 2) {
            return "two";
        } else if (number == 3) {
            return "three";
        } else if (number == 4) {
            return "four";
        } else if (number == 5) {
            return "five";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "seven";
        } else if (number == 8) {
            return "eight";
        } else if (number == 9) {
            return "nine";
        }
        return null;
    }

    private static String getTen(int number) {
        if (number == 0) {
            return "zero";
        } else if (number == 1) {
            return "ten";
        } else if (number == 2) {
            return "twenty";
        } else if (number == 3) {
            return "thirty";
        } else if (number == 4) {
            return "forty";
        } else if (number == 5) {
            return "fifty";
        } else if (number == 6) {
            return "sixty";
        } else if (number == 7) {
            return "seventy";
        } else if (number == 8) {
            return "eighty";
        } else if (number == 9) {
            return "ninety";
        }
        return null;
    }

    private static List<String> s1(String s1) {
        List<String> list = new ArrayList<>();

        return list;
    }

    private static List<String> s2(String s2) {
        return new ArrayList<>();
    }

    private static List<String> s3(String s3) {
        String c1 = s3.substring(0, 1);
        String c2 = s3.substring(1, 2);
        String c3 = s3.substring(2, 3);
        List<String> list = new ArrayList<>();
        if (!c1.equals("0")) {
            list.add(simpleNumber(Integer.parseInt(c1)));
            list.add("hundred");
            if (!c2.equals("0") || !c3.equals("0")) {
                list.add("and");
            }
        }
        int ten = Integer.parseInt(c2 + c3);
        if (ten >= 11 && ten <= 19) {
            if (ten == 11) {
                list.add("eleven");
            } else if (ten == 12) {
                list.add("twelve");
            } else if (ten == 13) {
                list.add("thirteen");
            } else if (ten == 14) {
                list.add("fourteen");
            } else if (ten == 15) {
                list.add("fifteen");
            } else if (ten == 16) {
                list.add("sixteen");
            } else if (ten == 17) {
                list.add("seventeen");
            } else if (ten == 18) {
                list.add("eighteen");
            } else {
                list.add("nineteen");
            }
            return list;
        }
        if (!c2.equals("0")) {
            list.add(getTen(Integer.parseInt(c2)));
        }
        if (!c3.equals("0")) {
            list.add(simpleNumber(Integer.parseInt(c3)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(9);
        for (int i = 0; i < 9 - str.length(); i++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(str);
        //123 456 789
        // thousand hundred
        String s1 = stringBuilder.substring(0, 3);
        String s2 = stringBuilder.substring(3, 6);
        String s3 = stringBuilder.substring(6, 9);

        List<String> list1 = s1(s1);
        List<String> list2 = s2(s2);
        List<String> list3 = s3(s3);

        List<String> result = new ArrayList<>(list1.size() + list2.size() + list3.size());
        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3);
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println(result.get(result.size() - 1));
    }
}
