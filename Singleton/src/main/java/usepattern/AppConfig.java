package usepattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author dadongge
 * @date 2019/5/26
 */
public class AppConfig {
    private static AppConfig instance = new AppConfig();

    public static AppConfig getInstance(){
        return instance;
    }

    private String parameterA;

    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    private AppConfig(){
        readConfig();
    }

    private void readConfig(){
        Properties p = new Properties();
        InputStream in = null;
        try {
            in  = AppConfig.class.getResourceAsStream("AppConfig.properties");
            p.load(in);
            parameterA = p.getProperty("paramA");
            parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try{
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
