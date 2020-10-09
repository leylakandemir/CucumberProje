package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //bu classi projemizin her yerinden nesne uretmeden ve miras almadan kullanabilecek sekilde tasarlayalim
    //static:  program calisir calismaz bellekte yer tutmaya yarayan keyword
    static Properties properties;
    static {
        String path= "configuration.properties";

        try {
            FileInputStream file =new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
