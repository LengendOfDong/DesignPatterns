package com.zte.packageCommand;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class ChopCommand implements Command{

    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi){
        this.cookApi = cookApi;
    }


    @Override
    public void execute() {
        this.cookApi.cook("绿豆排骨汤");
    }
}
