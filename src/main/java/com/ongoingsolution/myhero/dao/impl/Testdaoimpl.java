/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ongoingsolution.myhero.dao.impl;

import com.ongoingsolution.myhero.dao.Tesdao;
import com.ongoingsolution.myhero.model.Test;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Praneeth
 */
@Repository
public class Testdaoimpl implements Tesdao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Test view(int id) {
        return (Test) sessionFactory.getCurrentSession().get(Test.class, id);
    }

    @Override
    public List<Test> view2() {
        return sessionFactory.getCurrentSession().createCriteria(Test.class).list();
    }

}
