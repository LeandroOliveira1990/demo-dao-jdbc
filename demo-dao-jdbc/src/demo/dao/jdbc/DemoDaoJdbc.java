/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo.dao.jdbc;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Leandro
 */
public class DemoDaoJdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department obj = new Department(1, "Books");
        
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        
        System.out.println(seller);
    }
    
}
