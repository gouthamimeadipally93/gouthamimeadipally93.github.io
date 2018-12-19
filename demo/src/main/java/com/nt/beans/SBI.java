/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nt.beans;

/**
 *
 * @author GOUTHAMI
 */
public class SBI implements CreditCard{

    @Override
    public String getCardType() {
      return "Master Card";
        }

    @Override
    public String getCardName() {
        return "SBI";
        }
       
}
