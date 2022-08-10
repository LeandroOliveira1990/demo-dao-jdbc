/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo.dao.jdbc;

import java.util.Date;
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
    }
    
}
