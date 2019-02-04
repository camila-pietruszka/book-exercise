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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    
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
}
