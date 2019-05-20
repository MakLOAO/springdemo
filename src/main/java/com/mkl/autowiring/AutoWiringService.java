package com.mkl.autowiring;

public class AutoWiringService {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 20:03
 **/
    private AutoWiringDAO autoWiringDAO;

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }


}
