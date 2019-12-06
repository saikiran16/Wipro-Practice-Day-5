/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supra.Day5;



/**
 *
 * @author Saikiran
 */
class Day5_Program1and2 {
    public static void main(String[] args) {
        
        Author a1 = new Author("saikiran","jaddusaikiran9978@gmail.com",'M');
        Book b1 = new Book("Java" , a1 , 500 , 10);
        System.out.println("Details of Book");
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getGtyInStock());
        System.out.println("Author Details");
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.getEmail());
    }
    
    
}
class Author
{
    private String email,name;
    private char gender;
    Author(String name,String email,char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    
    
}
class Book
{
    private String  name;
    Author authorName;
    double price;
    int gtyInStock;
    Book(String name , Author authorName , double price , int gtyInStock)
    {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.gtyInStock = gtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGtyInStock(int gtyInStock) {
        this.gtyInStock = gtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getGtyInStock() {
        return gtyInStock;
    }
    
    
}
