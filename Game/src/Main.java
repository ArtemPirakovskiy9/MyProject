
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
            System.out.println("�����: " + round);
            ++round;
            System.out.println("��� ���:");
            System.out.println("1.������  2.�������   3.������");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            System.out.println("��� ���������:");
            Random random = new Random();
            int ran = random.nextInt(3) + 1;
            if (ran == 1) {
                System.out.println("������");
            } else if (ran == 2) {
                System.out.println("�������");
            } else {
                System.out.println("������");
            }

            if (choice == 1 & ran == 1) {
                System.out.println("�����");
            } else if (choice == 1 & ran == 2) {
                System.out.println("������� �����");
                ++player;
            } else if (choice == 1 & ran == 3) {
                System.out.println("������� ��������");
                ++komputer;
            } else if (choice == 2 & ran == 1) {
                System.out.println("������� ���������");
                ++komputer;
            } else if (choice == 2 & ran == 2) {
                System.out.println("������� �����");
            } else if (choice == 2 & ran == 3) {
                System.out.println("������� �����");
                ++player;
            } else if (choice == 3 & ran == 1) {
                System.out.println("������� �����");
                ++player;
            } else if (choice == 3 & ran == 2) {
                System.out.println("������� ���������");
                ++komputer;
            } else if (choice == 3 & ran == 3) {
                System.out.println("�����");
            }

            System.out.println("�����: " + player + "  ���������: " + komputer);
        } while(player < 3 && komputer < 3);

        if (player == 3) {
            System.out.println("������� �����");
        } else if (komputer == 3) {
            System.out.println("������� ���������");
        }

        System.out.println("����� ����");
    }
}