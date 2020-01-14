package nopattern.lazy;

/**
 * @author dadongge
 * @date 2019/5/26
 */
public class Singleton {
    private static Singleton uniqueInstance = null;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void singletonOperation(){}
    private String singletonData;

    public String getSingletonData(){
        return singletonData;
    }
}
