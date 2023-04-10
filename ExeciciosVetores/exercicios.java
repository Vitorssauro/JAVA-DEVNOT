package ExeciciosVetores;

import java.util.Scanner;

public class exercicios {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        int A[] = new int[] { 1, 2, 3, 4, 5 };
        int B[] = new int[5];
        B[0] = A[0];
        B[1] = A[1];
        B[2] = A[2];
        B[3] = A[3];
        B[4] = A[4];
        System.out.println("o vetor B é ");
        System.out.println(B[0]);
        System.out.println(B[1]);
        System.out.println(B[2]);
        System.out.println(B[3]);
        System.out.println(B[4]);
    }

    public void ex2() {
        int A[] = new int[] { 2, 4, 6, 8, 10, 12, 14, 16 };
        int B[] = new int[8];
        B[0] = A[0] * 2;
        B[1] = A[1] * 2;
        B[2] = A[2] * 2;
        B[3] = A[3] * 2;
        B[4] = A[4] * 2;
        B[5] = A[5] * 2;
        B[6] = A[6] * 2;
        B[7] = A[7] * 2;
        System.out.println("o vetor B é ");
        System.out.println(B[0]);
        System.out.println(B[1]);
        System.out.println(B[2]);
        System.out.println(B[3]);
        System.out.println(B[4]);
        System.out.println(B[5]);
        System.out.println(B[6]);
        System.out.println(B[7]);
    }

    public void ex3() {
        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int B[] = new int[15];
        B[0] = A[0] * A[0];
        B[1] = A[1] * A[1];
        B[2] = A[2] * A[2];
        B[3] = A[3] * A[3];
        B[4] = A[4] * A[4];
        B[5] = A[5] * A[5];
        B[6] = A[6] * A[6];
        B[7] = A[7] * A[7];
        B[8] = A[8] * A[8];
        B[9] = A[9] * A[9];
        B[10] = A[10] * A[10];
        B[11] = A[11] * A[11];
        B[12] = A[12] * A[12];
        B[13] = A[13] * A[13];
        B[14] = A[14] * A[14];
        System.out.println("o vetor B é ");
        System.out.println(B[0]);
        System.out.println(B[1]);
        System.out.println(B[2]);
        System.out.println(B[3]);
        System.out.println(B[4]);
        System.out.println(B[5]);
        System.out.println(B[6]);
        System.out.println(B[7]);
        System.out.println(B[8]);
        System.out.println(B[9]);
        System.out.println(B[10]);
        System.out.println(B[11]);
        System.out.println(B[12]);
        System.out.println(B[13]);
        System.out.println(B[14]);
    }

    public void ex4() {
        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double B[] = new double[15];
        B[0] = Math.sqrt(A[0]);
        B[1] = Math.sqrt(A[1]);
        B[2] = Math.sqrt(A[2]);
        B[3] = Math.sqrt(A[3]);
        B[4] = Math.sqrt(A[4]);
        B[5] = Math.sqrt(A[5]);
        B[6] = Math.sqrt(A[6]);
        B[7] = Math.sqrt(A[7]);
        B[8] = Math.sqrt(A[8]);
        B[9] = Math.sqrt(A[9]);
        B[10] = Math.sqrt(A[10]);
        B[11] = Math.sqrt(A[11]);
        B[12] = Math.sqrt(A[12]);
        B[13] = Math.sqrt(A[13]);
        B[14] = Math.sqrt(A[14]);
        System.out.println("o vetor B é ");
        System.out.println(B[0]);
        System.out.println(B[1]);
        System.out.println(B[2]);
        System.out.println(B[3]);
        System.out.println(B[4]);
        System.out.println(B[5]);
        System.out.println(B[6]);
        System.out.println(B[7]);
        System.out.println(B[8]);
        System.out.println(B[9]);
        System.out.println(B[10]);
        System.out.println(B[11]);
        System.out.println(B[12]);
        System.out.println(B[13]);
        System.out.println(B[14]);
    }

    public void ex5() {
        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int B[] = new int[10];
        B[0] = A[0] * 0;
        B[1] = A[1] * 1;
        B[2] = A[2] * 2;
        B[3] = A[3] * 3;
        B[4] = A[4] * 4;
        B[5] = A[5] * 5;
        B[6] = A[6] * 6;
        B[7] = A[7] * 7;
        B[8] = A[8] * 8;
        B[9] = A[9] * 9;
        System.out.println("o vetor B é ");
        System.out.println(B[0]);
        System.out.println(B[1]);
        System.out.println(B[2]);
        System.out.println(B[3]);
        System.out.println(B[4]);
        System.out.println(B[5]);
        System.out.println(B[6]);
        System.out.println(B[7]);
        System.out.println(B[8]);
        System.out.println(B[9]);
    }

    public void ex6() {
        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int B[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ;
        int C[] = new int[10];
        C[0] = A[0] + B[0];
        C[1] = A[1] + B[1];
        C[2] = A[2] + B[2];
        C[3] = A[3] + B[3];
        C[4] = A[4] + B[4];
        C[5] = A[5] + B[5];
        C[6] = A[6] + B[6];
        C[7] = A[7] + B[7];
        C[8] = A[8] + B[8];
        C[9] = A[9] + B[9];
        System.out.println("o vetor C é ");
        System.out.println(C[0]);
        System.out.println(C[1]);
        System.out.println(C[2]);
        System.out.println(C[3]);
        System.out.println(C[4]);
        System.out.println(C[5]);
        System.out.println(C[6]);
        System.out.println(C[7]);
        System.out.println(C[8]);
        System.out.println(C[9]);
    }
}
