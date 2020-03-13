package BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromFileProp {

    public Properties properties =new Properties();
    public FileInputStream fileInputStream;
    public String path = System.getProperty("user.dir");


    public  ReadFromFileProp(String fileName) throws FileNotFoundException {

         properties = new Properties();
       try {
           fileInputStream = new FileInputStream((path + "//src//main//resources//" +fileName));
           properties.load(fileInputStream);
       }catch(Exception e){
           e.printStackTrace();
       }
    }

public String getbroswer(){
        return properties.getProperty("browser");
}

    public String getloadDriverPath(){
        return properties.getProperty("loaddriverpath");
    }

    public String geturl(){
        return properties.getProperty("url");
    }


    public static void main(String[] args) throws FileNotFoundException {

        ReadFromFileProp readFromFilePropObj = new ReadFromFileProp("config.properties");

        System.out.println("Broswer " + readFromFilePropObj.getbroswer() );
        System.out.println("loaddriverPath " + readFromFilePropObj.getloadDriverPath() );
        System.out.println("URL " + readFromFilePropObj.geturl() );

    }


}
