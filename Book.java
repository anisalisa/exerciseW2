public class Book {
    //private field
    private String title;
    private String author;
    private boolean isAvailable;

    //constructor
    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    //getter for title
    public String getTitle(){
        return title;
    }
    //setter for title
    public void setTitle(String title) {
        this.title = title;
    }
    //getter for author
    public String getAuthor(){
        return author;
    }
    //setter for author
    public void setAuthor(String author){
        this.author = author;
    }
    //method to borrow a book (set to false)
    public void borrowBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("You have borrowed " + title);
        } else {
            System.out.println("Sorry, the book " + title + "is already borrowed");
        }
    }
    //method to return book (set to true)
    public void returnBook(){
        if (!isAvailable){
            isAvailable = true;
            System.out.println("You have returned " + title);
        } else {
            System.out.println(title + " is already in the library");
        }
    }
    //method to display book available
    public void displayBook(){
        System.out.println("Title: " + title + ", Author:" + author + (isAvailable ? "(Available)" : "(Not Available)"));
    }

    public boolean isAvailable() {
        return false;
    }

}
