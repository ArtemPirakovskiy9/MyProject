
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBHandler vvod=new DBHandler();
        Tovar tov=new Tovar();
        Scanner in=new Scanner(System.in);
        String otv;
        String kat;
        do{
        System.out.println("�������� ���������:");
        tov.vivodKat();
        kat= in.nextLine();
        tov.vivod(kat);
        System.out.println("�����:");
        String brend= in.nextLine();
        tov.vivodBrend(brend);
        System.out.println("�������� ������:");
        String model= in.nextLine();
        System.out.println("��� �����:" );
        tov.vivodModel(model);
        System.out.println("������� ���� ���:");
        String name= in.nextLine();
        System.out.println("������� ��� ����� ��������:");
        String TelNumber= in.nextLine();
        vvod.signUpZakaz(name,brend,model,TelNumber);
        System.out.println("���������� �������: �� ��� ���");
        otv= in.nextLine();
        if (otv.equals("���")){
            tov.vivodZakaz(name,TelNumber);
            }
        }
        while (otv.equals("��"));

    }
}