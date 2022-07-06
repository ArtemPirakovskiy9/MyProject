import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler extends Config{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException,SQLException{
        String connectionString="jdbc:mysql://"+ dbHost+":"+dbPort+"/"+dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection=DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }

    public void signUpProdukt(String kategory,String brend, String model, String price){
        String insert= "INSERT "+Const.USER_TABLEProd+"("+Const.USER_KATEGORY+","+Const.USER_BREND+
                ","+Const.USER_MODEL+","+Const.USER_PRICE+")"
                +"VALUES (?,?,?,?)";
        try {
            PreparedStatement prSt=getDbConnection().prepareStatement(insert);
            prSt.setString(1,kategory);
            prSt.setString(2,brend);
            prSt.setString(3,model);
            prSt.setString(4,price);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);}
    }
        public void signUpZakaz(String name,String brend, String model,String TelNumber){
            String insert= "INSERT "+Const.USER_TABLEZakaz+"("+Const.USER_Name+","+Const.USER_BREND+
                    ","+Const.USER_MODEL+","+Const.USER_TelNumber+")"
                    +"VALUES (?,?,?,?)";

            try {
                PreparedStatement prSt=getDbConnection().prepareStatement(insert);
                prSt.setString(1,name);
                prSt.setString(2,brend);
                prSt.setString(3,model);
                prSt.setString(4,TelNumber);
                prSt.executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);}
    }
}
