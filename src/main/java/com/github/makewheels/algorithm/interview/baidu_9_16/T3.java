package com.github.makewheels.algorithm.interview.baidu_9_16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T3 {
    static class IpCountTime {
        String ip;
        int count;
        int time;

        @Override
        public String toString() {
            return "IpCountTime{" +
                    "ip='" + ip + '\'' +
                    ", count=" + count +
                    ", time=" + time +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("word=xxx ip=10.10.10.1 time=1711");
        list.add("word=xxx ip=10.10.10.1 time=2352");
        list.add("word=xxx ip=10.10.10.3 time=3413");
        list.add("word=xxx ip=10.10.10.4 time=2014");
        list.add("word=xxx ip=10.10.10.1 time=5315");
        list.add("word=xxx ip=10.10.10.2 time=2616");

        //逐行读入文件
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
//                new FileInputStream("")));
//        String str = bufferedReader.readLine();
//        if (str != null) {
//
//        }
        //先不用TreeMap，最后都插入完后再排序
        //map key: 10.10.10.2
        //value: IpCountTime{ip='10.10.10.1', count=3, time=9378}
        Map<String, IpCountTime> map = new HashMap<>();

        for (String line : list) {
            String[] split = line.split(" ");
            String ip = split[1].split("=")[1];
            int time = Integer.parseInt(split[2].split("=")[1]);
            IpCountTime ipCountTime = map.get(ip);
            if (ipCountTime == null) {
                ipCountTime = new IpCountTime();
            }
            ipCountTime.ip = ip;
            ipCountTime.count++;
            ipCountTime.time += time;
            map.put(ip, ipCountTime);
        }
        //排序
        List<IpCountTime> ipList = new ArrayList<>(map.size());
        for (String key : map.keySet()) {
            ipList.add(map.get(key));
        }
        ipList.sort((o1, o2) -> o2.count - o1.count);
        for (IpCountTime ipCountTime : ipList) {
            System.out.println(ipCountTime + " average time: " + ipCountTime.time / ipCountTime.count);
        }
    }
}
