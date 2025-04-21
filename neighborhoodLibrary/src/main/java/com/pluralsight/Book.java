package com.pluralsight;

public class Book {

    private int ID;
    private String ISBN;
    private String Title;
    private boolean isCheckout;
    private String checkedOutTo;



    public Book(int ID, String ISBN, String Title) {
        this.ID = ID;
        this.ISBN = ISBN;
        this.Title = Title;
        isCheckout = false;
        checkedOutTo = "";
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        if(isCheckout) {
            this.isCheckout = true;
            this.checkedOutTo = name;
            System.out.println("Book checked out to. " + name);
        } else {
            System.out.println("This book is already checked out. ");
        }
    }

    public void checkIn() {
        if(isCheckout) {
            this.isCheckout = true;
            this.checkedOutTo = "";



        }
    }








}
