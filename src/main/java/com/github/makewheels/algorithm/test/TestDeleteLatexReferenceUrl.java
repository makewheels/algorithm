package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;
import sun.security.krb5.internal.tools.Klist;

import java.io.File;
import java.util.List;

public class TestDeleteLatexReferenceUrl {
    public static void main(String[] args) {
        File file = new File("D:\\UOW\\新建 Text Document.txt");
        List<String> lines = FileUtil.readUtf8Lines(file);
        for (String line : lines) {
            if (!line.trim().startsWith("url")) {
                System.out.println(line);
            }
        }
    }
}
