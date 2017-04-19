/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ongoingsolution.myhero.dao;

import com.ongoingsolution.myhero.model.Test;
import java.util.List;

/**
 *
 * @author Praneeth
 */
public interface Tesdao {

    public Test view(int id);

    public List<Test> view2();

}
