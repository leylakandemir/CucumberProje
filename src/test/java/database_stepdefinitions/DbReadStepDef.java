package database_stepdefinitions;
import io.cucumber.java.en.Given;
import java.sql.*;
public class DbReadStepDef {
    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=kaolapalacedb;user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";
    Connection connection; // Veritabanına bağlanmak için kullanacağız.
    Statement statement;   // Query'leri çalıştırmak ve verileri almak için kullanacağız.
    ResultSet resultSet;   // Aldığımız verileri resultset'in içine ekleyeceğiz.
    @Given("kullanici veritabanina baglanir")
    public void kullanici_veritabanina_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String string, String string2) throws SQLException {
        resultSet = statement.executeQuery("SELECT "+string2+" FROM dbo."+string);
    }
    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String string) throws SQLException {
        // ilk satıra geçiş yapacağız.
        resultSet.next(); // bunun yerine resultSet.first() de diyebilirdik.
        // resultSet.first() bizi ilk satıra götürür.
        // hangi satırda olduğumuzu yazdırdık.
        System.out.println(resultSet.getRow() + ". satırdayız.");
        // hangi satırdasak, oradaki veriyi aldık.
        String birinciSatirdakiVeri = resultSet.getObject(string).toString();
        System.out.println(birinciSatirdakiVeri);
        // bir sonraki satıra geçiş yapıyor.
        resultSet.next();
        // hangi satırda olduğumuzu yazdırdık.
        System.out.println(resultSet.getRow() + ". satırdayız.");
        // hangi satırdasak, oradaki veriyi aldık.
        String ikinciSatirdakiVeri = resultSet.getObject(string).toString();
        System.out.println(ikinciSatirdakiVeri);
        // bir sonraki satıra geçiş yapıyor.
        resultSet.next(); // 3. satır
        resultSet.next(); // 4. satır
        // hangi satırda olduğumuzu yazdırdık.
        System.out.println(resultSet.getRow() + ". satırdayız.");
        // hangi satırdasak, oradaki veriyi aldık.
        String dorduncuSatirdakiVeri = resultSet.getObject(string).toString();
        System.out.println(dorduncuSatirdakiVeri);
        // istediğimiz sıradaki satıra gidebilme.
        resultSet.absolute(20);
        // hangi satırda olduğumuzu yazdırdık.
        System.out.println(resultSet.getRow() + ". satırdayız.");
        // hangi satırdasak, oradaki veriyi aldık.
        String yirminciSatirdakiVeri = resultSet.getObject(string).toString();
        System.out.println(yirminciSatirdakiVeri);
        while(resultSet.next()){
            // iterator, bulunduğu bölümdeki resultset'in "DateStart" sütununda veriyi alır.
            Object veri = resultSet.getObject(string);
            System.out.println(veri.toString());
        }
        // resultsetin içindeki ilk satırı atlıyoruz.
        // bir sonraki veriye atlıyor.
        /*Object birinciVeri = resultSet.getObject(string);
        System.out.println(birinciVeri.toString());
        resultSet.next();
        Object ikinciVeri = resultSet.getObject(string);
        System.out.println(ikinciVeri.toString());*/
        /*int count = 0;
        while(resultSet.next()){
            count++;
            // iterator, bulunduğu bölümdeki resultset'in "Name" sütununda veriyi alır.
            Object veri = resultSet.getObject(string);
            System.out.println(count + "." +veri.toString());
            if( ! veri.toString().contains("@")){
                System.out.println(count + ". satırda email hatalı !");
                break;
            }
        }*/
    }
}