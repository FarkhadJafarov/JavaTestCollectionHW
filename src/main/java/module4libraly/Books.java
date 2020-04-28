package module4libraly;

public class Books {
    private String name;
    private String author;
    private String publishingHouse;
    private short year;
    private int numberOfPages;
    private String typeOfBinding;
    private int price;

    public Books(
        String name,
        String author,
        String publishingHouse,
        short year,
        int numberOfPages,
        String typeOfBinding,
        int price
    ) {
        this.name            = name;
        this.author          = author;
        this.publishingHouse = publishingHouse;
        this.year            = year;
        this.numberOfPages   = numberOfPages;
        this.typeOfBinding   = typeOfBinding;
        this.price           = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void GetInfo(){
        System.out.print("| название: " + name +"|");
        System.out.print("| автор: " + author+"|");
        System.out.print("| издательство: " + publishingHouse+"|");
        System.out.print("| год издания: " + year+"|");
        System.out.print("| количество страниц: " + numberOfPages+"|");
        System.out.print("| тип переплета: " + typeOfBinding+"|");
        System.out.println("| цена: " + price+"|");
    }
}
