package com.zte.example;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class Newspaper extends Subject{
    private String content;

    /**
     * 获取报纸的具体内容
     * @return
     */
    public String getContent(){
        return content;
    }

    /**
     * 设置报纸的具体内容，相当于要出版报纸了
     * @param content
     */
    public void setContent(String content){
        this.content = content;
        notifyObservers();
    }
}
