package com.zte.facade.nopattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class ConfigModel {
    private boolean needGenPresentation = true;
    private boolean needGenBusiness = true;
    private boolean needGenDAO = true;

    public boolean isNeedGenPresentation(){
        return needGenPresentation;
    }

    public boolean isNeedGenBusiness(){
        return needGenBusiness;
    }

    public boolean isNeedGenDAO(){
        return needGenDAO;
    }

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }

    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }
}
