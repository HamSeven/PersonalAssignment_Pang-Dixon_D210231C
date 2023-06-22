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
    Ebook ebook = new Ebook("Your Name", "Makoto Shin Kai", 35.99, 30, ".pdf");
    ebook.openBook();
    
    ebook.downloadBook();
    System.out.println("File format is valid:"+ebook.validateFormat());

    PhysicalBook physicalBook = new PhysicalBook("Harry Potter", "J.K Rowling", 65.99, 5, 1000);
    System.out.println(physicalBook.calculateShippingCost());
    System.out.println(physicalBook.getWeightInPounds());
}   
}
