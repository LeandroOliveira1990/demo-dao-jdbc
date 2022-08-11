/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo.dao.jdbc;

import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
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
        
        SellerDao sellerdao = DaoFactory.createSellerDao();
        
        System.out.println("=== Test 1: seller findById ===");
        
        Seller seller = sellerdao.findById(3);
        
        System.out.println(seller);
        
        
        System.out.println("\n=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);
        
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }
        
        
         System.out.println("\n=== Test 3: seller findAll ===");
         list = sellerdao.findAll();
        
        for (Seller seller1 : list) {
            System.out.println(seller1);
        }
        
         System.out.println("\n=== Test 4: seller insert ===");
         
         Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
         sellerdao.insert(newSeller);
         System.out.println("Inserted! New id = " + newSeller.getId());
         
         
         System.out.println("\n=== Test 5: seller update ===");
         seller = sellerdao.findById(1);
         seller.setName("Martha waine");
         sellerdao.update(seller);
         System.out.println("Update Complete");
    }
    
}
