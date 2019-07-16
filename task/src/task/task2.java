/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Random;

/**
 *
 * @author V I R E N
 */
public class task2 {
    public static void main(String[] args) {
        int userpoint=1000;
        int arr[]={1,0,2,0,3,0,4,0,5,0};
        
        for(int i=0;i<=1000;i++)
        {
      
        Random r =new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println("chooseing num:"+arr[randomNumber]);
            int points=10*(arr[randomNumber])-10;
            System.out.println("Won points is :"+points);
            userpoint=userpoint+points;
            System.out.println("Totalpoint is:"+userpoint);
        }
        System.out.println("Points after 1000 bet :"+userpoint);
        
    }
    
}
