/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DTOs.testDto;
import java.util.List;
import org.sql2o.Sql2o;
import org.sql2o.Connection;
/**
 *
 * @author seintecnicsa
 */
public class testDataAccess {
    
    public testDataAccess(){
    
    }  
    
    public List<testDto> queryTest(){
       
        Sql2o sql2o = new Sql2o(");

String sql =
    "SELECT Id, Name " +
    "FROM OpportunityStatus ";

try(Connection con = sql2o.open()) {
    List<testDto> tasks = con.createQuery(sql)
        .executeAndFetch(testDto.class);
    return tasks;  
}
        
    }
    }

