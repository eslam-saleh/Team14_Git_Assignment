/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_assignment;

/**
 *
 * @author DELL
 */
public class BallVolume implements ISubscriber{
    public double ball_volume(String r){
        double pi = 22/7.0 ,volume = 0.0 , c = 4/3.0;
        volume = c * pi * Math.pow( Double.parseDouble(r) , 3);
        return volume;
    } 
    
    @Override
    public void notifySubscriber(String input) {
        
        System.out.println("CircleVolume = " + ball_volume(input));
    }
}
