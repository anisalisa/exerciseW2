import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] library = new Book[2];
        Scanner scanner = new Scanner(System.in);

        //loop to populate the array of books by taking input
        for(int i=0; i<library.length; i++){
            System.out.println("Enter details for book" + (i+1));
            //input book title
            System.out.println("Enter book title: ");
            String title = scanner.nextLine();
            System.out.println("Enter author name: ");
            String author = scanner.nextLine();
            //to create new book and add to the array
            library [i] = new Book(title, author);
        }
        //decision construct
        boolean running = true;
        while (running) {
            System.out.println("\n Library Details Menu:");
            System.out.println("1. Display all available books");
            System.out.println("2. Borrow a book ");
            System.out.println("3. Return a book ");
            System.out.println("4. Exit the program ");
            System.out.println("Choose a program: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1: 
                //option for no 1
                System.out.println("\n Available books: ");
                for (Book book : library){
                    if (book.isAvailable()){
                        book.displayBook();
                    }
                } 
                break;

                case 2:
                // option for no 2
                System.out.print("Enter the title of the book to borrow: ");
                String borrowTitle = scanner.nextLine();
                boolean foundBorrow = false;
                for (Book book : library) {
                    if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                        book.borrowBook();
                        foundBorrow = true;
                        break;
                    }
                }
                if (!foundBorrow) {
                    System.out.println("Book not found.");
                }
                break;

            case 3:
                // Return a book
                System.out.print("Enter the title of the book to return: ");
                String returnTitle = scanner.nextLine();
                boolean foundReturn = false;
                for (Book book : library) {
                    if (book.getTitle().equalsIgnoreCase(returnTitle)) {
                        book.returnBook();
                        foundReturn = true;
                        break;
                    }
                }
                if (!foundReturn) {
                    System.out.println("Book not found.");
                }
                break;

            case 4:
                // Exit the program
                running = false;
                System.out.println("Exiting the system.");
                break;

            default:
                System.out.println("Invalid option. Please choose again.");
        }
    
        } scanner.close();
        }
    }
