package com.zte.facade.rewriteusepattern;

import com.zte.facade.nopattern.Business;
import com.zte.facade.nopattern.DAO;
import com.zte.facade.nopattern.Presentation;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Facade {
    public void generate(){
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
