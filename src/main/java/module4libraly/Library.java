package module4libraly;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public ArrayList<Books> libralyForBook;

    public Library() {
        this.libralyForBook = new ArrayList<Books>();
    }

    public void AddBookForLibraly(Books books){
        this.libralyForBook.add(books);
    }

    public void ListBookOnLibraly(String name,String author){
        for(int i = 0; i < libralyForBook.size();i++){
            if(0 != libralyForBook.size()){
                libralyForBook.get(i).getName();
                libralyForBook.get(i).getAuthor();
            }else{
                System.out.println("В библиотеке нет книг");
            }
        }
    }

    public void SearchByAuthor(String author){
        for(int i = 0; i < libralyForBook.size();i++){
            if(author == libralyForBook.get(i).getAuthor()){
                libralyForBook.get(i).GetInfo();
            }else{
                System.out.println("Такой книги нету");
            }
        }
    }

    public void SearchByPublishingHouse(String publishingHouse){
        for(int i = 0; i < libralyForBook.size();i++){
            if(publishingHouse == libralyForBook.get(i).getPublishingHouse()){
                libralyForBook.get(i).GetInfo();
            }else{
                System.out.println("Такой книги нету");
            }
        }
    }

    public void SearchByTheYearOfPublishing(short year){
        for(int i = 0; i < libralyForBook.size();i++){
            if(year <= libralyForBook.get(i).getYear()){
                libralyForBook.get(i).GetInfo();
            }else{
                System.out.println("Такой книги нету");
            }
        }
    }
}
