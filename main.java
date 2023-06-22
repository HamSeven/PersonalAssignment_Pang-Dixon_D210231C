/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalassignment_d210231c;

/**
 *
 * @author User
 */
public class main {
 public static void main(String[] args) {
    Ebook ebook = new Ebook("Rich Dad Poor Dad", "Albert Einstein", 16.99, 100, ".pdf");
    ebook.openBook();
    
    ebook.downloadBook();
    System.out.println("File format is valid:"+ebook.validateFormat());

    PhysicalBook physicalBook = new PhysicalBook("Wolf", "AAA Hello", 17.99, 3, 1000);
    System.out.println(physicalBook.calculateShippingCost());
    System.out.println(physicalBook.getWeightInPounds());
}   
}
