package ExeciciosVetores;

public class exerciciosWhile {
    public void exe1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exe2() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int vetorB[] = new int[8];
        int i = 0;

        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exe3() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[15];
        int i = 0;

        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exe4() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double vetorB[] = new double[15];
        int i = 0;

        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exe5() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorB[] = new int[8];
        int i = 0;

        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }
    
    public void exe6() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorB[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorC[] = new int[10];
        int i = 0;

        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("VetorC[" + i + "]=" + vetorC[i]);
            i++;
        }
    }
}
