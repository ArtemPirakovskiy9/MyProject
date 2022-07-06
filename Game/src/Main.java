
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int player = 0;
        int komputer = 0;
        int round = 1;

        do {
            System.out.println("Раунд: " + round);
            ++round;
            System.out.println("Ваш ход:");
            System.out.println("1.Камень  2.Ножницы   3.Бумага");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            System.out.println("Ход компьютер:");
            Random random = new Random();
            int ran = random.nextInt(3) + 1;
            if (ran == 1) {
                System.out.println("Камень");
            } else if (ran == 2) {
                System.out.println("Ножницы");
            } else {
                System.out.println("Бумага");
            }

            if (choice == 1 & ran == 1) {
                System.out.println("Ничья");
            } else if (choice == 1 & ran == 2) {
                System.out.println("Выиграл Игрок");
                ++player;
            } else if (choice == 1 & ran == 3) {
                System.out.println("Выиграл Комьютер");
                ++komputer;
            } else if (choice == 2 & ran == 1) {
                System.out.println("Выиграл Компьютер");
                ++komputer;
            } else if (choice == 2 & ran == 2) {
                System.out.println("Выиграл Ничья");
            } else if (choice == 2 & ran == 3) {
                System.out.println("Выиграл Игрок");
                ++player;
            } else if (choice == 3 & ran == 1) {
                System.out.println("Выиграл Игрок");
                ++player;
            } else if (choice == 3 & ran == 2) {
                System.out.println("Выиграл Компьютер");
                ++komputer;
            } else if (choice == 3 & ran == 3) {
                System.out.println("Ничья");
            }

            System.out.println("Игрок: " + player + "  Компьютер: " + komputer);
        } while(player < 3 && komputer < 3);

        if (player == 3) {
            System.out.println("Победил Игрок");
        } else if (komputer == 3) {
            System.out.println("Победил Компьютер");
        }

        System.out.println("Конец игры");
    }
}