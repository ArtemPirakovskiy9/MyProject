import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Tovar extends DBHandler{
    String kategory;
    String price;
    String model;
    String brend;
    public Tovar() {

    }
    public Tovar(String kategory,String price,String brend,String model) {
        this.kategory=kategory;
        this.brend=brend;
        this.model=model;
        this.price=price;
    }
    public String toString(){
        return kategory+"  "+model+"  "+brend+"  "+price;
    }
    public  void vivodKat() throws SQLException, ClassNotFoundException {
        String out="Select distinct kategory from shope.produkt";
        Statement res= getDbConnection().prepareStatement(out);
        ResultSet resSet=res.executeQuery(out);

        while(resSet.next()){
            kategory=resSet.getString("kategory");
            System.out.println(kategory);
        }
    }
    public  void vivod(String ot) throws SQLException, ClassNotFoundException {
        String out="Select * from shope.produkt Where kategory='"+ot+"'";
        Statement res= getDbConnection().prepareStatement(out);
        ResultSet resSet=res.executeQuery(out);
        while(resSet.next()){
            kategory=resSet.getString("kategory");
            price=resSet.getString("price");
            brend=resSet.getString("brend");
            model=resSet.getString("model");
            Tovar kat= new Tovar(kategory,price,model,brend);
            System.out.println(kat);
        }
    }
    public  void vivodBrend(String ot) throws SQLException, ClassNotFoundException {
        String out="Select * from shope.produkt Where brend='"+ot+"'";
        Statement res= getDbConnection().prepareStatement(out);
        ResultSet resSet=res.executeQuery(out);
        while(resSet.next()){
            kategory=resSet.getString("kategory");
            price=resSet.getString("price");
            brend=resSet.getString("brend");
            model=resSet.getString("model");
            Tovar kat= new Tovar(kategory,price,model,brend);
            System.out.println(kat);
        }
    }
    public  void vivodModel(String ot) throws SQLException, ClassNotFoundException {
        String out="Select * from shope.produkt Where model='"+ot+"'";
        Statement res= getDbConnection().prepareStatement(out);
        ResultSet resSet=res.executeQuery(out);
        while(resSet.next()){
            kategory=resSet.getString("kategory");
            price=resSet.getString("price");
            brend=resSet.getString("brend");
            model=resSet.getString("model");
            Tovar kat= new Tovar(kategory,price,model,brend);
            System.out.println(kat);
        }
    }
    public  void vivodZakaz(String name,String number) throws SQLException, ClassNotFoundException {
        int price1;
        int sum=0;
        String out="Select * from zakaz " +
                "Join produkt ON zakaz.model=produkt.model Where zakaz.name=" +
                "'"+name+"'"+"&&"+"zakaz.Telnumber="+"'"+number+"'";
        Statement res= getDbConnection().prepareStatement(out);
        ResultSet resSet=res.executeQuery(out);
        while(resSet.next()){
            price=resSet.getString("price");
            kategory=resSet.getString("kategory");
            brend=resSet.getString("brend");
            model=resSet.getString("model");
            Tovar kat= new Tovar(kategory,price,model,brend);
            System.out.println(kat);
            price1=Integer.parseInt(price);
            List<Integer>x=new ArrayList<>();
            x.add(price1);
            for (int i:x){
                sum+=i;
            }
        }
        System.out.println("Сумма вашего заказа: "+sum);
    }


}




