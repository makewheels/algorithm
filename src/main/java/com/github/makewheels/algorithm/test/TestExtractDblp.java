package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.List;

public class TestExtractDblp {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\miuser\\Downloads\\new 1.txt");
        List<String> lines = FileUtil.readUtf8Lines(file);
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("@")) {
                line = StringUtils.substringBetween(line, "{", ",");
                String ref = "\\cite{" + line + "}";
                System.out.println(ref);
            }
        }

    }
}
