/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Camila Pietruszka
 * @version 2/4/19
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private String refNumber; //2.88
    private int pages; //2.85
    private int borrowed; //2.91
    private boolean courseText; //2.92

    /**
     * Set the author, title, and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; //2.85
        refNumber = ""; //2.88
        courseText = isCourseText; //2.92
    }

    // Add the methods here ...
    
    //GETTERS
    //2.83
    /**
     * provide access to the string holding the authors name
     * @return author
     */
    public String getAuthor(){
        return author;
    }
    /**
     * provide access to the string holding the titles name
     * @return title
     */
    public String getTitle(){
        return title;
    }
    //2.85
    /**
     * provide access to the int holding the num of pages
     * @return pages
     */
    public int getPages(){
        return pages;
    }
    //2.88
    /**
     * provide access to the String holding the nefNumber
     * @return refNumber
     */
    public String getRefNumber(){
        return refNumber;
    }
    //2.91
    /**
     * provide access to the int holding the times borrowed
     * @return borrowed
     */
    public int getBorrowed(){
        return borrowed;
    }
    //2.92
    /**
     * provide access to immutable courseText boolean
     */
    public boolean isCourseText(){
        return courseText;
    }
    
    //SETTERS
    //2.88
    /**
     * changes value of refNumber
     */
    public void setRefNumber(String ref){
        if(ref.length() < 3)//2.90
            System.out.println("ERROR: reference must be 3 characters long");
        else 
            refNumber = ref;
    }
    //2.91
    /**
     * increases when book is borrowed
     */
    public void borrow(){
        borrowed++;
    }
    
    //PRINTING
    //2.84
    /**
     * prints author to screen
     */
    public void printAuthor(){
        System.out.println(author);
    }
    /**
     * prints title to screen
     */
    public void printTitle(){
        System.out.println(title);
    }
    //2.87
    /**
     * prints author, title, and pages to screen
     */
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if(refNumber.equals("")) //2.89
            System.out.println("Reference Number: ZZZ");
        else
            System.out.println("Reference Number: " + refNumber);
        System.out.println("Times Borrowed: " + borrowed);
    }
    
    /**
     * 2.86 - Once the book object is created it is at this point
     * in time immutable because there are currently no
     * methods the change variables/fields, only methods to 
     * view and print them. Since viewing and printing isn't really
     * mutating a variable, Book is immutable. 
     */
    
    
    
    
}
