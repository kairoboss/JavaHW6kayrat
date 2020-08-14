package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book<Integer> myBook = new Book(140,18);
        myBook.count();
        Book<Integer> myBook2 = new Book<Integer>(380,32);
        myBook2.count();
        Book<Integer> myBook3 = new Book<Integer>(720,52);
        myBook3.count();
    }
}
