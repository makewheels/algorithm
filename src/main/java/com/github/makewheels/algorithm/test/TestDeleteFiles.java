package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileNameUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDeleteFiles {
    public static void main(String[] args) {
        List<File> files = FileUtil.loopFiles("D:\\BaiduNetdiskDownload\\pan-images");
        Map<String, Integer> map = new HashMap<>();
        for (File file : files) {
            String ext = FileNameUtil.extName(file);
            map.merge(ext, 1, Integer::sum);
            String[] array = {"zip", "xlsx", "amr", "docx", "pptx", "mp4", "mp3", "txt", "pdf", "mov",
                    "doc", "m4a", "apk", "xls", "rar", "MP4", "MOV", "ppt", "gif", "XMP", "webp",
                    "psd", "lib", "cab", "MPG", "sys", "ogg", "exe", "avi", "cat", "THM", "mkv",
                    "3gp", "inf", "cdd", "mpg", "CAB", "dll", "AVI", "btn"};
            if (StringUtils.equalsAny(ext, array)) {
                System.out.println(file);
                System.out.println(file.delete());
            }
        }
        System.out.println(map);
    }
}
