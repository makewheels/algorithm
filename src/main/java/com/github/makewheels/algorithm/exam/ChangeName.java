package com.github.makewheels.algorithm.exam;

import java.io.File;

public class ChangeName {
    public static void main(String[] args) {
        File folder = new File("D:\\workspace\\idea\\algorithm\\" +
                "src\\main\\java\\com\\github\\makewheels\\algorithm\\exam");
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                continue;
            }
            String name = file.getName();
            int index = name.indexOf("_");
            String company = name.substring(0, index);
            String date = name.substring(index + 1);
            String newName = "e_" + date + "_" + company;
            File newFile = new File(file.getParentFile(), newName);
            boolean renameResult = file.renameTo(newFile);
            System.out.println(renameResult + " " + newFile);
        }

    }
}
