import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        main14();
    }

    public static void main1() {
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        int[][] arr1 = new int[2][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int t = arr[1][j];
                arr1[i][j] = arr[0][j];
                arr1[0][j] = arr[1][j];
                System.out.print(arr1[i][j] + " \t");
            }
            System.out.println();
        }

    }

    public static void main2() {
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        int[][] arr1 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][4] = arr1[i][0];
                arr[i][0] = arr1[i][4];
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public static void main3() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int s = 0;
        int max = 0;
        int x = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                s = s + arr[i][j];
                if (s > max) {
                    max = s;

                    x = i;
                }
            }
            System.out.println(s);
            s = 0;

        }
        System.out.println("Наибольшая сумма элементов в строке под номером " + x);
    }

    public static void main4() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int s = 0;
        int max = 0;
        int x = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                s = s + arr[j][i];
                if (s > max) {
                    max = s;
                    x = i;
                }
            }
            System.out.println(s);
            s = 0;

        }
        System.out.println("Наибольшая сумма элементов в столбце под номером " + x);
    }

    public static void main5() {
        Random random = new Random();
        int[][] arr = new int[4][8];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    s = s + arr[i][j];
                }
            }
            System.out.println(s);
        }
    }

    public static void main6() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    s = s + arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(s);
    }

    public static void main7() {
        Random random = new Random();
        int[][] arr = new int[7][4];
        int s = 0;
        int max = 0;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    s = j;
                }
            }
        }
        System.out.println("Наибольший элемент в строке под номером " + x + " в столбце под номером " + s);
    }

    public static void main8() {
        Random random = new Random();
        int[][][] arr = new int[2][2][2];
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = random.nextInt(10);

                }
            }
        }
        System.out.println(Arrays.deepToString(arr) + "\t");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = arr[i][j][k] * s;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr) + "\t");
    }

    public static void main9() {

        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    arr[i][j] = "B";
                } else if (i % 2 == 0 && j % 2 != 0) {
                    arr[i][j] = "B";
                } else {
                    arr[i][j] = "W";
                }
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }


    public static void main10() {
        Random random = new Random();
        int[][] arr = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr1 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                }
            }
        }
        System.out.println(Arrays.deepToString(arr) + "\t");
        System.out.println();
        System.out.println(Arrays.deepToString(arr1) + "\t");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr2[i][k] += arr[i][j] * arr1[j][k];
                }
                System.out.println(arr2[i][j] + "\t");

            }
            System.out.println();
        }
    }

    public static void main11() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int s = 0;
        int s1 = 0;
        double sr = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                s = s + arr[i][j];

            }
            System.out.println(s);

        }
    }

    public static void main12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов: ");
        int x = scanner.nextInt();
        int[][] mas = new int[x][x];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Диагонали: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i == j) || (i + j == x - 1)) {
                    System.out.print(mas[i][j] + "\t");
                } else System.out.print("   " + "\t");
            }
            System.out.println();
        }
    }

    public static void main13() {
        int[][] arr = {{5, 4, 45, 12}, {7, 5, 8, 85},};
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                int J = j + 1;
                while (J < arr[i].length) {
                    if (arr[i][J] < arr[i][j]) {
                        int x = arr[i][j];
                        arr[i][j] = arr[i][J];
                        arr[i][J] = x;
                    }
                    ++J;
                }
            }
        }
        for (int i = 0; i < arr.length; ++i)
            System.out.println(java.util.Arrays.toString(arr[i]));
    }
}

