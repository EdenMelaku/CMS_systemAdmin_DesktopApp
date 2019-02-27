/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms_system_adminstration_application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MEBA
 */
public class add extends Thread {
 
    @Override
    public void run(){
        
      int i=0;
      String studID[]=null;
      // 
      Calendar c = new GregorianCalendar();
        java.util.Date d = c.getTime();
      
              DateFormat df=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
            //Date d=new Date();
            Instant instant=d.toInstant();
            ZoneId zoneID=ZoneId.systemDefault();
            ZonedDateTime zdt=ZonedDateTime.ofInstant(instant, zoneID);
            LocalDate localDate=zdt.toLocalDate();
            
        try {
            String id []= new String [20000];
                     Connection con=model.connection.connectDB();

           
            String sql="select id from student";
            
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
              id[i]=rs.getString(1);
              i++;
            }
           studID =new String[i+1];
            
            for(int j=0;j<=i;j++){
                studID[j]=id[j];
            }
            con.close();
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
           
            
               PreparedStatement ps;
                String query;
            for(int k=0;k<=i;k++){
                boolean one=checkValidation.one(studID[k]);
                boolean two=checkValidation.two(studID[k]);
                boolean three=checkValidation.three(studID[k]);
                
                
                
                try{
                             Connection con=model.connection.connectDB();

                // INSERT IN TO ADVISOR
          query="insert into advisor values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();
            con.close();
            
   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
                if(two==true){
            try{
// INSERT INRO CONTINUING EDUCATION

  query="insert into continuingeducation values(?,?,?,?) ";
                     Connection con=model.connection.connectDB();

            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();
            con.close();
   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
                
        // INSERT INTO CONTINUING EDUACTION BUSSINES AFFAIR   
                
              
         query="insert into continuingeducationBA values(?,?,?,?) ";
                     Connection con=model.connection.connectDB();

            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();         
               con.close();
                   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
                }
                if(three==true){
            try{
         //       INSERT INTO DEAN  OF RPG 
         
           query="insert into deanofrpg values(?,?,?,?) ";
                     Connection con=model.connection.connectDB();

            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();
            con.close();
         
           } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            
                }
            try{
            // INSERT INTO DEPARTMENT HEAD 
         
         
          query="insert into DEPARTMENTHEAD values(?,?,?,?) ";
                     Connection con=model.connection.connectDB();

            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
         con.close();
                
            
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            
            if(one==true){
            try{
            
            // INSERT INTO FACULTY STORE 
            
            
           query="insert into FACULTYSTORE values(?,?,?,?) ";
                     Connection con=model.connection.connectDB();

            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            con.close();
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            // INSERT INTO HOUSING OFFICE
                     Connection con=model.connection.connectDB();

          query="insert into HOUSINGOFFICE values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            con.close();
            
             } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            
            
            
            try{
                     Connection con=model.connection.connectDB();

            // INSERT INTO SPORT MASTER 
         query="insert into SPORTMASTER values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            con.close();
            
            } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
                         Connection con=model.connection.connectDB();

            // INSERT INTO STUDENTS CAFE 
                   query="insert into STUDENTSCAFE values(?,?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,2);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.setInt(5, 1);
            ps.execute(); 
            con.close();
            
            
            
        } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
        
    
            }
            try{  
            
            // INSERT INTO LIBRARY 
                     Connection con=model.connection.connectDB();

                   query="insert into LIBRARY values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            con.close();
              } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{ 
                     Connection con=model.connection.connectDB();

            //  INSER INTO  REGISTRAR
          query="insert into REGISTRAR values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            
            con.close();
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            System.out.println("added   " +studID[k]);
          try {   
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
        System.out.println("sleep failed ");
        }
    
    }
                        System.out.println("ALL FINISHED ");


 
        
        
    }
    
    
    public static void main(String ... args){
        
        Thread t=new add();
      System.out.println("starting thread " );

        t.start();
        
    }
    
    
    
    
    
}
