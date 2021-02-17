import java.util.Scanner;

public class Read
{
    private static String bookColor;
    private static String genre;
    private static int numOfPages;
    private static int pagesYouRead;

    public Read(String bookColor, int numOfPages, String genre, int pagesYouRead) 
    {
        this.bookColor = bookColor;
        this.genre = genre;
        this.numOfPages = numOfPages;
        this.pagesYouRead = pagesYouRead;
    }

    public String pickBookColor(String bookColor) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color of book will you read?");
        String pickedbookColor = scanner.nextLine();
        return pickedbookColor;
    }

    public int getnumOfPages(int numOfPages)
    {
        return numOfPages;
    }

    public String pickgenre(String genre)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What genre of book will you read?");
        String bookgenre = scanner.nextLine();
        return bookgenre;
    }

    public int howMany(int pagesYouRead)
    {
        return pagesYouRead;
    }

    public static void main(String[] args) 
    {
        Read book = new Read(bookColor, 250, genre, 100);

        String bookColor2 = book.pickBookColor(bookColor);
        book.getnumOfPages(250);
        String genre2 = book.pickgenre(genre);
        book.howMany(100);
        book.theColor(bookColor2);
        book.theGenre(genre2);
        book.whatsLeft(250, 100);
    }

    public void theGenre(String genre2)
    {
        System.out.println("You are reading a book that is a "+genre2+" novel.");
    }

    public void theColor(String bookColor)
    {
        System.out.println("You are reading a book that is "+bookColor+".");
    }

    public void whatsLeft(int numOfPages, int pagesYouRead)
    {
        int pagesLeft = numOfPages - pagesYouRead;
        System.out.println("You have "+ pagesLeft+" pages left in the book.");
    }

}