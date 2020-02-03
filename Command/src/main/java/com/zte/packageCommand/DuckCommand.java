package com.zte.packageCommand;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class DuckCommand implements Command{
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi){
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("烤鸭");
    }
}
