/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ongoingsolution.myhero.services.impl;

import com.ongoingsolution.myhero.dao.Tesdao;
import com.ongoingsolution.myhero.services.Testservices;

import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author malitha
 */
@Service

public class Testservicesimpl implements Testservices {

    @Autowired
    private Tesdao testDao;

    @Transactional
    @Override
    public Response getTestDetail(String employeeId) {
        int employeeId1 = Integer.parseInt(employeeId);

        if (employeeId == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        return Response.ok(testDao.view(employeeId1)).build();

    }

    @Transactional
    @Override
    public Response rederetuser() {

        return Response.ok(testDao.view2()).build();

    }

}
