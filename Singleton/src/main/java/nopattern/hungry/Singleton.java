package nopattern.hungry;

/**
 * @author dadongge
 * @date 2019/5/26
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public void singletonOperation(){

    }

    private String singletonData;

    public String getSingletonData(){
        return singletonData;
    }
}
