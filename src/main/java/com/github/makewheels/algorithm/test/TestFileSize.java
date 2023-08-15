package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.List;

public class TestFileSize {
    public static void main(String[] args) {
        List<File> files = FileUtil.loopFiles("D:\\BaiduNetdiskDownload\\COLLECTION OF FROM");
        long maxSize = 0;
        for (File file : files) {
            if (file.getName().endsWith(".jpg")) {
                if (file.length() > maxSize) {
                    maxSize = file.length();
                    System.out.print(FileUtil.readableFileSize(maxSize) + " ");
                    System.out.println(file);
                }
            }
        }
    }
}
