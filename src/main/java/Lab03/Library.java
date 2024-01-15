package Lab03;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BorrowableItems> BorrowableItemsList = new ArrayList<>();

    public void addLibraryItems(BorrowableItems items){
        BorrowableItemsList.add(items);
    }

    public void checkoutItems(String title){
        for (BorrowableItems items : BorrowableItemsList){
            if (items instanceof Book){
                Book book = (Book) items;
                if (book.getTitle().equals(title) && book.isAvailable()){
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found or already checked" + title);
    }

    public void ListAvailableItems(){
        System.out.println("Available items in the library: ");
        for (BorrowableItems items : BorrowableItemsList){
            if (items instanceof Book){
                Book book = (Book)  items;
                if (book.isAvailable()){
                    book.displayInfo();
                }
            }
        }
    }

    public void DisplayLibraryInfo(){
        System.out.println("Total number of items in the library : " + BorrowableItemsList.size());
    }


}
