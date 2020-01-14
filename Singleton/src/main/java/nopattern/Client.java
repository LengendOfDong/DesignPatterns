package nopattern;

/**
 * @author dadongge
 * @date 2019/5/26
 */
public class Client {
    public static void main(String[] args){
        AppConfig config = new AppConfig();
        String paramA = config.getParameterA();
        String paramB = config.getParameterB();

        System.out.println("paramA=" + paramA + ",paramB=" + paramB );
    }
}
