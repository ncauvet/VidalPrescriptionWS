
package com.vidal.merlin.wsclient.foodInteraction;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:26 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
public class FoodInteractionService_FoodInteractionServiceHttpPort_Server{

    protected FoodInteractionService_FoodInteractionServiceHttpPort_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new FoodInteractionServiceImpl();
        String address = "CHANGE_ME";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new FoodInteractionService_FoodInteractionServiceHttpPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
