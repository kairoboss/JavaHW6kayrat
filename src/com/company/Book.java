package com.company;

public class Book<T extends Number> implements Countable {
    private T page;
    private T hours;
    public Book(T page,T hours){
        this.page = page;
        this.hours = hours;
    }
    public T getPage(){
        return page;
    }
    public T getHours(){
        return hours;
    }

    @Override
    public void count() {
        System.out.println("За "+getHours()+" часов я прочитал "+getPage()+" страниц книги");
    }
}
