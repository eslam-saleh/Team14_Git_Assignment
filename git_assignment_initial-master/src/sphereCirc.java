/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author computer
 */

import java.lang.Math.*;
public class sphereCirc implements ISubscriber{
    @Override
    public void notifySubscriber(String input){
        double circumference = 2 * Double.parseDouble(input) * Math.PI;
        System.out.println(circumference);
}
}