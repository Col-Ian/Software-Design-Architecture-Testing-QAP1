package com.QAP1;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        if (this.hour>=10){
            return (this.hour+":"+this.minute+":"+this.second);
        } return ("0"+this.hour+":"+this.minute+":"+this.second);
    }

    public Time nextSecond(){
        if (this.second <  59){
            this.second = this.second+1;

        } else {
            if (this.minute < 59){
                this.minute = this.minute+1;
                this.second = 00;
            } else{
                if (this.hour < 23){
                    this.hour = this.hour+1;
                    this.minute = 00;
                    this.second = 00;
                } else {
                    this.hour = 0;
                    this.minute = 00;
                    this.second = 00;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        if (this.second >0){
            this.second = this.second-1;
        } else{
            if (this.minute >0){
                this.minute=this.minute-1;
                this.second = 59;
            } else{
                if (this.hour>0){
                    this.hour = this.hour-1;
                    this.minute = 59;
                    this.second = 59;
                }else {
                    this.hour = 23;
                    this.minute = 59;
                    this.second = 59;
                }
            }
        }
        return this;
    }
}
