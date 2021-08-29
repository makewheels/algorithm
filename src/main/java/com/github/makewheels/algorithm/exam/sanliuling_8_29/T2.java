package com.github.makewheels.algorithm.exam.sanliuling_8_29;

import org.springframework.cache.interceptor.CacheOperationInvoker;

import java.util.Scanner;

/**
 * 长城守卫军
 * 时间限制： 3000MS
 * 内存限制： 1048576KB
 * 题目描述：
 * 长城上有连成一排的n个烽火台，每个烽火台都有士兵驻守。
 * <p>
 * 第i个烽火台驻守着ai个士兵，相邻峰火台的距离为1。另外，有m位将军，
 * 每位将军可以驻守一个峰火台，每个烽火台可以有多个将军驻守，
 * 将军可以影响所有距离他驻守的峰火台小于等于x的烽火台。
 * 每个烽火台的基础战斗力为士兵数，另外，每个能影响此烽火台的将军都能使这个烽火台的战斗力提升k。
 * 长城的战斗力为所有烽火台的战斗力的最小值。
 * <p>
 * 请问长城的最大战斗力可以是多少？
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 第一行四个正整数n,m,x,k(1<=x<=n<=10^5,0<=m<=10^5,1<=k<=10^5)
 * <p>
 * 第二行n个整数ai(0<=ai<=10^5)
 * <p>
 * 输出描述
 * 仅一行，一个整数，表示长城的最大战斗力
 * <p>
 * <p>
 * 样例输入
 * 5 2 1 2
 * 4 4 2 4 4
 * 样例输出
 * 6
 * <p>
 * 提示
 * 有5个烽火台，2名将军，将军的影响范围为1，提升战斗力的值为2。
 * 令将军驻守在第2和第4个烽火台，这样所有烽火台的战斗力都是6。
 */
public class T2 {
    private static final Scanner scanner = new Scanner(System.in);
    static long n,m,k,x;
    static long a[]=new long[100100];
    static long sum[]=new long[100100];
    static boolean check(long mid){
        for(int i=0;i<=n+1;i++) sum[i]=0;
        int res=0;
        for(int i=1;i<=n;i++){
            sum[i]+=sum[i-1];
            if(a[i]+sum[i]<mid){
                long num=(mid-sum[i]-a[i]-1+k)/k;
                res+=num;
                sum[i]+=num*k;
                int len=(int)Math.min(i+x*2+1,n+1);
                sum[len]-=num*k;
                //sum[(int)(i+x*2+1)]-=num*k;
            }
        }
        return res<=m;
    }
    public static void main(String[] args) {
        n=scanner.nextLong();
        m=scanner.nextLong();
        x=scanner.nextLong();
        k=scanner.nextLong();
        long l=0,r=0;
        for(int i=1;i<=n;i++){
            a[i]=scanner.nextLong();
            r=Math.max(r,a[i]);
        }
        r+=k*m+1;
        long ans=0;
        while(l<=r){
            long mid=(l+r)>>1;
            if(check(mid)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.println(ans);
    }
}
