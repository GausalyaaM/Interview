package com.company.interviewques;
import java.util.Scanner;
public class CommonElementsInArr {
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
        System.out.println("Enter the size of an array C:");
        int size3 = scan.nextInt();
        int C[] = new int[size3];
        for (int i = 0; i < size3; i++) {
            C[i] = scan.nextInt();
        }
        for (int j = 0; j < A.length; j++) {
            for (int k = 0; k < B.length; k++) {
                if (A[j] == B[k]) {
                    for (int m = 0; m < C.length; m++) {
                        if (A[j] == C[m]) {
                            System.out.println(A[j] + " ");
                        }
                    }
                }
            }
        }
    }
}


