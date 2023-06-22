/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalassignment_d210231c;

public class Ebook extends Book {
    private String fileFormat;

    public Ebook(String title, String author, double price, int quantity, String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void openBook() {
        System.out.println("The e-book is opened.");
    }

    public void downloadBook() {
        System.out.println("The e-book is downloading.");
    }

    public boolean validateFormat() {
        return fileFormat.equals(".pdf") || fileFormat.equals(".epub");
    }
}