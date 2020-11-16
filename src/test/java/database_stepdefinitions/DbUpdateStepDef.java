package database_stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.runner.Result;
import utilities.DBUtils;

import java.net.Socket;
import java.sql.SQLException;

public class DbUpdateStepDef {

    @Given("kullanici dbutils ile veritabanina baglanir")
    public void kullanici_dbutils_ile_veritabanina_baglanir() {
        DBUtils.createConnection();
    }

    @Given("kullanici id degeri {string} olan verinin {string} bilgisini {string} ile gunceller")
    public void kullanici_id_degeri_olan_verinin_bilgisini_ile_gunceller(String string, String string2, String string3) throws SQLException {
    String query = "SELECT "+string2+" FROM dbo.tHOTELROOMRESERVATION";
    DBUtils.executeQuery(query);
    DBUtils.getResultset().next();
    System.out.println(DBUtils.getResultset().getObject(string2).toString());
    String updateQuery = "UPDATE dbo.tHOTELRESERVATION SET "+string2+" = '"+string3+"' WHERE IDHotelReservation = "+string;
    DBUtils.executeQuery(updateQuery);
    System.out.println(DBUtils.getResultset().getObject(string2).toString());
    while (DBUtils.getResultset().next()){
        System.out.println(DBUtils.getResultset().getObject(string2).toString());
    }
    }

}
