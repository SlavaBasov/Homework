package Lesson3;
/*Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
        по очереди вводят координаты клетки в которую хотят сделать ход. После
        каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
        Игра продолжается до победы одного из игроков или ничьи.*/

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int size = 4;
        int moves = (size - 1) * (size - 1);
        String[][] field = new String[size][size];
        Scanner sc = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        int[] nums = new int[size - 1];
        boolean check = false;
        int count = 0;

        for (int i = 1; i <= nums.length; i++) {
            nums[i - 1] = i;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0 && j != 0) {
                    field[i][j] = Integer.toString(j);
                } else if (j == 0 && i != 0) {
                    field[i][j] = Integer.toString(i);
                } else {
                    field[i][j] = ".";
                }
            }
        }
        field[0][0] = " ";

        for (String[] i : field) {
            for (String j : i) {
                System.out.printf("%3s", j);
            }
            System.out.println();
        }
        while (count < moves) {
            if (count % 2 == 0) {
                System.out.println("Первый игрок делает ход... ");
            } else {
                System.out.println("Второй игрок делает ход... ");
            }
            while (!check) {
                System.out.print("Введите координаты строки: ");
                if (sc.hasNextInt()) {
                    input1 = sc.nextInt();
                    for (int j : nums) {
                        if (j == input1) {
                            check = true;
                            break;
                        }
                    }
                } else {
                    sc.next();
                }
            }
            while (check) {
                System.out.print("Введите координаты столбца: ");
                if (sc.hasNextInt()) {
                    input2 = sc.nextInt();
                    for (int j : nums) {
                        if (j == input2) {
                            check = false;
                            break;
                        }
                    }
                } else {
                    sc.next();
                }
            }
            if(field[input1][input2].equals("X") || field[input1][input2].equals("O")){
                System.out.println("Некорректный ввод.");
            } else {
                if (count % 2 == 0) {
                    field[input1][input2] = "X";
                } else {
                    field[input1][input2] = "O";
                }
                for (String[] j : field) {
                    for (String k : j) {
                        System.out.printf("%3s", k);
                    }
                    System.out.println();
                }
                count++;
            }

            if((field[1][1].equals("X") && field[1][2].equals("X") && field[1][3].equals("X"))
                    || (field[2][1].equals("X") && field[2][2].equals("X") && field[2][3].equals("X"))
                    || (field[3][1].equals("X") && field[3][2].equals("X") && field[3][3].equals("X"))
                    || (field[1][1].equals("X") && field[2][1].equals("X") && field[3][1].equals("X"))
                    || (field[1][2].equals("X") && field[2][2].equals("X") && field[3][2].equals("X"))
                    || (field[1][3].equals("X") && field[2][3].equals("X") && field[3][3].equals("X"))
                    || (field[1][1].equals("X") && field[2][2].equals("X") && field[3][3].equals("X"))
                    || (field[1][3].equals("X") && field[2][2].equals("X") && field[3][1].equals("X")))
            {
                System.out.println("Выиграл первый игрок.");
                break;
            }
            else if((field[1][1].equals("O") && field[1][2].equals("O") && field[1][3].equals("O"))
                    || (field[2][1].equals("O") && field[2][2].equals("O") && field[2][3].equals("O"))
                    || (field[3][1].equals("O") && field[3][2].equals("O") && field[3][3].equals("O"))
                    || (field[1][1].equals("O") && field[2][1].equals("O") && field[3][1].equals("O"))
                    || (field[1][2].equals("O") && field[2][2].equals("O") && field[3][2].equals("O"))
                    || (field[1][3].equals("O") && field[2][3].equals("O") && field[3][3].equals("O"))
                    || (field[1][1].equals("O") && field[2][2].equals("O") && field[3][3].equals("O"))
                    || (field[1][3].equals("O") && field[2][2].equals("O") && field[3][1].equals("O")))
            {
                System.out.println("Выиграл второй игрок.");
                break;
            }
            else if(count == 9){
                System.out.println("Ничья.");
            }
        }
        System.out.println("Игра окончена!");

    }
}
