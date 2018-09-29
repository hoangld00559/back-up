/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;





/**
 *
 * @author MyPC
 */
public class Book {
    private int ID;
    private String nameOfBook;
    private String author;
    private String publishCompany;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }
    
    public Book(){
        super();
    }
    public Book(int ID, String nameOfBook, String author, String publishCompany){
        this.ID = ID;
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.publishCompany = publishCompany;
    }
   
}
