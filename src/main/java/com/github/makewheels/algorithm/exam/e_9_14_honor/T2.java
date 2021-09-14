package com.github.makewheels.algorithm.exam.e_9_14_honor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    String name;
    List<Integer> values;
    int ruleNumber;
    String levelString;
    int levelNumber;
    int total;
}

public class T2 {
    private static int count(Person person, int minValue, int maxValue) {
        int count = 0;
        for (Integer value : person.values) {
            if (value >= minValue && value <= maxValue) {
                count++;
            }
        }
        return count;
    }

    private static boolean commonJudgeMethod(Person person, int days, int minValue, int maxValue) {
        int count = count(person, minValue, maxValue);
        return count >= days;
    }

    private static boolean rule2(Person person) {
        if (!commonJudgeMethod(person, 4, 30000, Integer.MAX_VALUE)) {
            return false;
        }
        List<Integer> days = new ArrayList<>();
        for (int i = 0; i < person.values.size(); i++) {
            if (person.values.get(i) > 30000) {
                days.add(i);
            }
        }
        for (int i = 0; i < days.size() - 1; i++) {
            if (days.get(i + 1) - days.get(i) <= 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            String[] split1 = line.split(":");
            Person person = new Person();
            person.name = split1[0];
            String numberString = split1[1];
            String[] split2 = numberString.split(" ");
            List<Integer> values = new ArrayList<>(split2.length);
            for (String s : split2) {
                values.add(Integer.parseInt(s));
            }
            person.values = values;
            personList.add(person);
        }
        for (Person person : personList) {
            int sum = 0;
            for (Integer value : person.values) {
                sum += value;
            }
            person.total = sum;
        }
        for (Person person : personList) {
            if (rule2(person) || commonJudgeMethod(person, 15, 10000, Integer.MAX_VALUE)) {
                person.levelString = "excellent";
                person.levelNumber = 3;
            } else if (commonJudgeMethod(person, 15, 5000, 10000)) {
                person.levelString = "good";
                person.levelNumber = 2;
            } else {
                person.levelString = "bad";
                person.levelNumber = 1;
            }
        }
        personList.sort((p1, p2) -> {
            if (p1.levelNumber != p2.levelNumber) {
                return p2.levelNumber - p1.levelNumber;
            } else {
                return p2.total - p1.total;
            }
        });
        for (Person person : personList) {
            System.out.println(person.name + ":" + person.levelString + " " + person.total);
        }
    }
}
