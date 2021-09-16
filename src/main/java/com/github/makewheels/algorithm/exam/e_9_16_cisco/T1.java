package com.github.makewheels.algorithm.exam.e_9_16_cisco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        String[] split = line.split(",");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        int hour = Integer.parseInt(split[3]);
        int minute = Integer.parseInt(split[4]);
        int second = Integer.parseInt(split[5]);
        int offsetSeconds = Integer.parseInt(split[6]);
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        dateTime = dateTime.plusSeconds(offsetSeconds);
        String formatDateString = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);
        System.out.println(formatDateString);
    }
}
