package models;

public class Book {
    int bookNumber;
    String bookName;
    int bookPrice;
    public Book(int bookNumber, String bookName, int bookPrice) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
        result = prime * result + bookNumber;
        result = prime * result + bookPrice;
        return result;
    }
    
    
    /** 
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (bookName == null) {
            if (other.bookName != null)
                return false;
        } else if (!bookName.equals(other.bookName))
            return false;
        if (bookNumber != other.bookNumber)
            return false;
        if (bookPrice != other.bookPrice)
            return false;
        return true;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookNumber=" + bookNumber + ", bookPrice=" + bookPrice + "]";
    }


    
  

}
