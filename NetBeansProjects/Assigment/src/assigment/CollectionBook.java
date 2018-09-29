/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

import java.util.*;

/**
 *
 * @author MyPC
 */
public class CollectionBook {
    public  ArrayList<Book> listBook;  
    
    public void setListBook(){
    listBook = new ArrayList<>();
    Book book1 = new Book();
    book1.setID(1);
    book1.setNameOfBook("Vứt bỏ anh là điều dũng cảm nhất");
    book1.setAuthor("Nhân Gian Tiểu Khả");
    book1.setPublishCompany("Nxb văn học");
    Book book2 = new Book();
    book2.setID(2);
    book2.setNameOfBook("Theo anh bay đến tận cùng thế giới");
    book2.setAuthor("Nguyệt Lưu Quang");
    book2.setPublishCompany("Nxb Văn Việt");
    Book book3 = new Book();
    book3.setID(3);
    book3.setNameOfBook("Combo hạnh phúc nhỏ của anh");
    book3.setAuthor("Đông Bôn Tây Cổ");
    book3.setPublishCompany("Nxb Thanh Niên");
    Book book4 = new Book();
    book4.setID(4);
    book4.setNameOfBook("Nếu còn có ngày mai");
    book4.setAuthor("Sidney Sheldon");
    book4.setPublishCompany("Nxb Văn Học");
    Book book5 = new Book();
    book5.setID(5);
    book5.setNameOfBook("Trăm năm cô đơn");
    book5.setAuthor("Gabriel Garcia");
    book5.setPublishCompany("NxbTN");
    listBook.add(book1);
    listBook.add(book2);
    listBook.add(book3);
    listBook.add(book4);
    listBook.add(book5);
    }
    
    public void getListBook(){
        System.out.println("Xem thông tin sách: ");
        System.out.println("");
        Iterator it=listBook.iterator();
        while(it.hasNext()) {
            Object obj=it.next();
            if(obj instanceof Book) {
                Book st=(Book)obj;
                System.out.println ("Id: "+ st.getID());
                System.out.println ("Tên sách: "+ st.getNameOfBook());
                System.out.println ("Tác giả: "+ st.getAuthor());
                System.out.println ("Nhà xuất bản: "+ st.getPublishCompany());
                System.out.println("----------------------------------");
            }
        }
        
        
    }
    
    public void modifyBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn ID sách muốn sửa: ");
        int b = sc.nextInt();
        System.out.println("Chọn danh mục sửa: ");
        System.out.println("1.Sửa tên sách     2. Sửa tác giả     3. Sửa NXB");
        int c = sc.nextInt();
        switch (c) {
            case 1: {
                System.out.println("Nhập tên sách mới: ");                
                Book changeBook = new Book(b, sc.next(), listBook.get(b - 1).getAuthor(), listBook.get(b - 1).getPublishCompany());
                listBook.set(b - 1, changeBook);
                break;
            }
            case 2: {
                System.out.println("Nhập tên tác giả mới: ");
                Book changeBook = new Book(b,listBook.get(b - 1).getNameOfBook(), sc.next(), listBook.get(b - 1).getPublishCompany());
                listBook.set(b - 1, changeBook);
                break;
            }
            case 3: {
                System.out.println("Nhập tên nhà xuất bản mới: ");
                Book changeBook = new Book(b, listBook.get(b - 1).getNameOfBook(), listBook.get(b - 1).getAuthor(), sc.next());
                listBook.set(b - 1, changeBook);                
                break;
            }
            default:
                System.out.println("Bạn nhập sai !");
                
                
        }
        getListBook();
    }
    
    
    public int findBook(String findBook){        
        Iterator it=listBook.iterator();
        while(it.hasNext()) {
            Object obj=it.next();
            if(obj instanceof Book) {
                Book st=(Book)obj;
                if(findBook.compareToIgnoreCase(st.getNameOfBook()) == 0 || findBook.compareToIgnoreCase(st.getAuthor()) == 0 || 
                findBook.compareToIgnoreCase(st.getPublishCompany()) == 0){
                    return st.getID();
                }
                
            }
        }
        return 10;
    }
}
