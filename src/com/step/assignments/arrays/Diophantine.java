package com.step.assignments.arrays;

public class Diophantine {
    public static void main(String[] args) {
            long largeX = 0;
            int largeD = 0;
        for(int d=149;d<=149;d++){
            if(d%Math.sqrt(d) == 0) {
                continue;
            }
            long y=1;
            long x;
            while (true){
                 x = 1 + (d*y*y);
                if (x%Math.sqrt(x) == 0){
                    break;
                }
                y++;
            }
            System.out.println(d+" "+y+" "+Math.sqrt(x));
        }
    }
}
