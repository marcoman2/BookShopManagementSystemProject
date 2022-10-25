/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem;

import java.sql.Date;

/**
 *
 * @author WINDOWS 10
 */
public class customerData {
    
    private Integer customerId;
    private Integer bookId;
    private String title;
    private String author;
    private String genre;
    private Integer quantity;
    private Double price;
    private Date date;
    
    public customerData(Integer customerId, Integer bookId, String title, String author
            , String genre, Integer quantity, Double price, Date date){
        this.customerId = customerId;
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }
    public Integer getCustomerId(){
        return customerId;
    }
    public Integer getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    
}
