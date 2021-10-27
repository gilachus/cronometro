/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timetracker.backend;


public class Chrono {
    private int duration;
    private int seconds;
    private int minutes;
    private int hours;
    private boolean start;
    
    public Chrono(){
        this.duration = 0;
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
        this.start = false;
    }
    public int calcHours(){
        int h = this.duration/3600000;
        this.hours = h;
        return h;
    }
    public int calcMinutes(){
        int m = this.duration/60000;
        this.minutes = m;
        return m;
    }
    public int calcSeconds(){
        int s = this.duration/1000;
        this.seconds = s;
        return s;
    }
    public String stringTime(){
        return numberFormat(this.hours)+":"+numberFormat(this.minutes)+":"+numberFormat(this.seconds);
    }
    public static String numberFormat(int n){
        return String.format("%02d", n);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
        this.calcHours();
        this.calcMinutes();
        this.calcSeconds();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
