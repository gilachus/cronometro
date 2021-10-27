/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timetracker.backend;

import java.util.Date;
import java.util.TimerTask;


public class Chrono2 extends TimerTask{
    
    @Override
    public void run() {
        System.out.println("Tarea"+ new Date());
    } 
}
