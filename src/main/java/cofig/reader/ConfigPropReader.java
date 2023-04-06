package cofig.reader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {
    private Properties properties;
    private FileInputStream ip;
    public Properties initLangProp(String language){
        System.out.println("lang is "+language);
    properties=new Properties();
    try {
        switch (language.toLowerCase()) {
            case "english":
                ip = new FileInputStream("D:\\Selenium\\multiLanguage\\src\\main\\resource\\lang.eng.properties");
                break;
            case "french":
                ip = new FileInputStream("D:\\Selenium\\multiLanguage\\src\\main\\resource\\lang.french.properties");
                break;
            default:
                System.out.println("language not found" + language);
                break;
        }
        properties.load(ip);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return properties;
    }

}
