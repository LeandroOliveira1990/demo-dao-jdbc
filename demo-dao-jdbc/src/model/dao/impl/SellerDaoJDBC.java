/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.*;
import java.util.List;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Leandro
 */
public class SellerDaoJDBC implements SellerDao{
    
    private Connection conn;
    
    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {
        
    }

    @Override
    public void update(Seller obj) {
        
    }

    @Override
    public void deleteById(Integer id) {
        
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
         try {
            st = conn.prepareStatement(
            "SELECT seller.*,department.Name as DepName "
            + "FROM seller INNER JOIN department "
            + "ON seller.DepartmentId = department.Id "
            + "WHERE seller.Id = ?");
                    
                    st.setInt(1, id);
                    rs = st.executeQuery();
                    if(rs.next()){
                        Department dep = new Department();
                        dep.setId(rs.getInt("DepartmentId"));
                        dep.setName(rs.getString("DepName"));
                        Seller obj = new Seller();
                        obj.setId(rs.getInt("Id"));
                        obj.setName(rs.getString("Name"));
                        obj.setEmail(rs.getString("Email"));
                        obj.setBasaSalary(rs.getDouble("BaseSalary"));
                        obj.setBirthDate(rs.getDate("BirthDate"));
                        obj.setDepartment(dep);
                        return obj;
                    }
                    return null;
            
           } catch (SQLException e) {
              throw new DbException(e.getMessage());
        }
        finally{
             DB.closeStatement(st);
             DB.closeResultSet(rs);
         }
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
    
}
