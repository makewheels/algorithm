package com.github.makewheels.algorithm.test;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestGenerateFFmpegTranscodeCommand {
    public static void main(String[] args) {
        File folder = new File("D:\\BaiduNetdiskDownload\\5 计算机网络");
        List<File> files = FileUtil.loopFiles(folder,
                file -> file.getName().endsWith(".ts"));
        List<String> commands = new ArrayList<>(files.size());
        for (File file : files) {
            String from = file.getPath();
            String oldName = file.getName();
            String newName = FilenameUtils.getBaseName(oldName) + ".mp4";
            String to = new File(file.getParent(), newName).getPath();
            String command = String.format("ffmpeg -y -i \"%s\" -codec copy \"%s\"", from, to);
            commands.add(command);
        }
        for (String command : commands) {
            System.out.println(command);
        }
    }
}
