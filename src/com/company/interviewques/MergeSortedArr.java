package com.company.interviewques;
import java.util.Arrays;
import java.util.Scanner;
public class MergeSortedArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array A:");
        int size1 = scan.nextInt();
        int A[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            A[i] = scan.nextInt();
        }
        System.out.println("Enter the size of an array B:");
        int size2 = scan.nextInt();
        int B[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            B[i] = scan.nextInt();
        }
        int[] C = new int[size1 + size2];
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            C[k++] = A[i];
        }
        //k = A.length;
        for (int j = 0; j < B.length; j++) {
            C[k++] = B[j];
        }
        for(int i=0;i<C.length;i++)
        //System.out.println(C[i]);
        Arrays.sort(C);
        int l = C.length;
        for (int m = 0, n = l - 1; m < n; m++, n--) {
            System.out.print(C[m] + " " + C[n]+" ");
        }
    }
}
