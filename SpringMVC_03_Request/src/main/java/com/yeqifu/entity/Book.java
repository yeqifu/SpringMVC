package com.yeqifu.entity;

/**
 * @Author: 落亦-
 * @Date: 2020/10/5 8:04
 */
public class Book {
    private String bookName;
    private String author;
    private Integer price;
    private Integer stock;
    private Integer sales;

    private Address address;

    public Book() {
    }

    public Book(String bookName, String author, Integer price, Integer stock, Integer sales,Address address) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
        this.address = address;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                ", address=" + address +
                '}';
    }
}
