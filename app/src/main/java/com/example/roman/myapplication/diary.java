package com.example.roman.myapplication;

import java.io.Serializable;

/**
 * Created by Roman on 2016/9/20.
 */
public class diary implements Serializable{

    private static final long serialVersionUID = 1L;

    private int year;
    private int month;
    private String day;
    private int num;
    private String content;

    public diary() {}

    public diary(int year,int month,String day, int num, String content){
        this.day = day;
        this.num = num;
        this.content = content;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public String getDay(){
        return day;
    }

    public int getNum(){
        return num;
    }

    public String getContent(){
        return content;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(String day){
        this.day = day;
    }

    public void  setNum(int num){
        this.num = num;
    }

    public void setContent(String content){
        this.content = content;
    }
}