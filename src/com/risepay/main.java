/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.risepay;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Jhonn
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        RisePay risepay = new RisePay("jhonndev","U0H464z4");
        
        Map<String, Object> data = new HashMap<String, Object>();
        
        data.put("NameOnCard", "Jhonn");
        data.put("CardNum", "5149612222222229");
        data.put("ExpDate", "1214");
        data.put("Amount", 10);
        data.put("CVNum", "678");
        data.put("Customer", "JR");
        
        //System.out.println(risepay.auth(data));
        
        risepay.auth(data);
        
         
        
        
    }
    
}
