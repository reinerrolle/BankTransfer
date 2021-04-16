package com.rrolle.banktransferv3.services;

import com.rrolle.banktransferv3.models.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Service API layer
 * @author jrice
 */
public class UserService {
    // TODO: hit the database here and fetch some data
    public User getUser(int id) {
        switch (id) {
            case 1:
                return new User(1, "Jason", "Rice", 34);
            case 2:
                return new User(1, "Alyssa", "Rice", 33);
            default:
                return null;
        }
    }    
}
