
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
        System.out.println("Выберете категорию:");
        tov.vivodKat();
        kat= in.nextLine();
        tov.vivod(kat);
        System.out.println("Бренд:");
        String brend= in.nextLine();
        tov.vivodBrend(brend);
        System.out.println("ВЫберете модель:");
        String model= in.nextLine();
        System.out.println("Ваш выбор:" );
        tov.vivodModel(model);
        System.out.println("Введите ваше имя:");
        String name= in.nextLine();
        System.out.println("Введите ваш номер телефона:");
        String TelNumber= in.nextLine();
        vvod.signUpZakaz(name,brend,model,TelNumber);
        System.out.println("Продолжить покупки: Да или Нет");
        otv= in.nextLine();
        if (otv.equals("Нет")){
            tov.vivodZakaz(name,TelNumber);
            }
        }
        while (otv.equals("Да"));

    }
}