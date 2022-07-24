package Digitalsplit;

import java.util.Scanner;

public class Digital_split {
    public static void main(String[] args) throws NumberException {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入自然数n（n小于8）");
        System.out.print("n=");
        int n = cin.nextInt();
        if(n<=0||n>=8) throw new NumberException("输入错误，输入的数字必须在1到8之间。");
        if (n == 1) {
            System.out.println("改自然数无法分解。");
        }
        else {
        System.out.println("分解改自然数为：");
        if (n % 2 == 0) {
            if (2 <= n) {
                operator(n);
            }
            if (4 <= n) {
                printf1(n);
            }
            if (6 <= n) {
                int[] arr3 = new int[n - 4];
                for (int i = 0; i < arr3.length; i++) {
                    if (i > arr3.length - 3) {
                        arr3[i] = 3;
                    } else arr3[i] = 1;
                }
                printf2(arr3);
            }
            if (n == 8) {
                System.out.println("4+4");
            }
        } else {
            operator(n);
            printf1(n);
            if (n == 7) {
                System.out.println("3+4");
            }
        }
    }

}
    private static void printf2(int[] arr3) {
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = i; j < arr3.length; j++) {
                if (j < arr3.length - 1) {
                    System.out.print(arr3[j] + "+");
                } else System.out.println(arr3[j]);
            }
            arr3[arr3.length - 2] += 1;
            arr3[i] -= 1;
        }
    }

    private static void printf1(int n) {
        int[] arr2 = new int[n - 2];
        for (int i = 0; i < arr2.length; i++) {
            if (i > arr2.length-3) {
                arr2[i] = 2;
            } else arr2[i] = 1;
        }
        printf2(arr2);
    }

    private static void operator(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        printf2(arr);
    }
}
