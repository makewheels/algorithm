package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.FileFilter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestCountLines {
    public static void main(String[] args) {
        File folder = new File("D:\\workSpace\\intellijidea");
        int count = 0;
        List<File> files = FileUtil.loopFiles(
                folder, pathname -> pathname.isFile() && pathname.getName().endsWith(".java"));
        for (File file : files) {
            List<String> lines = FileUtil.readLines(file, StandardCharsets.UTF_8);
            System.out.println(file);
            count += lines.size();
        }
        System.out.println("files.size() = " + files.size());
        System.out.println("count = " + count);
    }
}
