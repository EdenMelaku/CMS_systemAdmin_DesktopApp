/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author MEBA
 */
public class maincontroler {
    public static void datamigration(String year){
       Connection con=connection.connectDB();
       String clear="alter table clear rename to clear"+year;
       String deactivatedlist="alter table deactivatedlist rename to deactivatedlist"+year;
       String advisor="alter table advisor rename to advisor"+year;
       String contED="alter table continuingeducation rename to continuingeducation"+year;
       String contEDba="alter table continuingeducationba rename to continuingeducationba"+year;
       String deanofrpg="alter table deanofrpg rename to deanofrpg"+year;
       String dephead="alter table  departmenthead  rename to departmenthead"+year;
       String facultystore="alter table facultystore rename to facultystore"+year;
       String housingoffice="alter table housingoffice rename to housingoffice"+year;
       String library="alter table library rename to library"+year;
       String registrar="alter table registrar rename to registrar"+year;
       String sportmaster="alter table sportmaster rename to sportmaster"+year;
       String studentscafe="alter table studentscafe rename to studentscafe"+year;








       String create1 ="create table clear("+
"SID varchar(10) primary key," +
"reason varchar(50)," +
"LibraryStatus int," +
"BookStoreStatus  int," +
"SportMasterStatus  int," +
"HousingOfficeStatus  int," +
"StudentCafeStatus  int," +
"FacultyStoreStatus  int," +
"RegistrarStatus  int," +
"AdvisorStatus  int," +
"DepartmentHeadStatus  int," +
"DeanOFRPGStatus  int," +
"ContinuingEducationBAStatus  int," +
"ContinuingEducationStatus  int," +
"finalStatus  int," +
"initiator varchar (30)," +

"foreign key (SID) references student(id)," +

"foreign key (initiator) references users(username)" +

")";





String create2="create table deactivatedList(" +
"studID varchar(30) primary key ," +
"username varchar(30)," +
"deactivationD date ," +
"activationD date," +
"status int," +

"foreign key(studID) references Student(id)," +
"foreign key (username) references users(username)" +
")";


String create3=
"create table ADVISOR(" +

"SID varchar(30) primary key," +
"status int," +
"approvedBy varchar(30)," +
"finalApprovalDate date," +
"foreign key (SID) references Student(id)," +
"foreign key (approvedBy) references users(username)" +
")";



       String create4="create table continuingEducation("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";

   String create5="create table continuingEducationBA("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";





String create6="create table deanOFRPG("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";


String create7=
"create table DEPARTMENTHEAD(" +

"SID varchar(30) primary key," +
"status int," +
"approvedBy varchar(30)," +
"finalApprovalDate date," +
"foreign key (SID) references Student(id)," +
"foreign key (approvedBy) references users(username)" +
")";


String create8="create table facultyStore("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";


String create9="create table housingOffice("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";


String create10="create table library("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";

String create11="create table registrar("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";

String create12="create table sportMaster("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";

String create13="create table studentsCafe("
        +"SID varchar(30) primary key,"
+"status int,"
+"approvedBy varchar(30),"
+"finalApprovalDate date,"
        +"CS int,"
+"foreign key (SID) references Student(id),"
+"foreign key (approvedBy) references users(username)"
+")";


















       Statement s;
       Statement ss;
        try {
            s = con.prepareStatement(clear);
             s.execute(clear);
            ss=con.prepareStatement(create1);
            ss.execute(create1);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request ----------- on clear");

        }
        Statement s1;
            Statement ss1;
        try {
            s1 = con.prepareStatement(deactivatedlist);
             s1.execute(deactivatedlist);
            ss1=con.prepareStatement(create2);
            ss1.execute(create2);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request ------------- deactivated list ");

        }
        Statement s2;
            Statement ss2;
        try {
            
            s2 = con.prepareStatement(advisor);
             s2.execute(advisor);
             ss2=con.prepareStatement(create3);
            ss2.execute(create3);
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request  ----------- on advisor  ");

        }

        Statement s3;
           Statement ss3;
        try {
            
             s3 = con.prepareStatement(contED);
             s3.execute(contED);
            ss3=con.prepareStatement(create4);
            ss3.execute(create4);
           
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request-------------------- on continuing education  ");

        }
        Statement s4;
        Statement ss4;
        try {
            s4= con.prepareStatement(contEDba);
             s4.execute(contEDba);
            ss4=con.prepareStatement(create5);
            ss4.execute(create5);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request----------- on continuing education business affair  ");

        }
        Statement s5;
            Statement ss5;
        try {
            s5= con.prepareStatement(deanofrpg);
             s5.execute(deanofrpg);
            ss5=con.prepareStatement(create6);
            ss5.execute(create6);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request -------------- on dean of rpg");

        }
        Statement s6;
           Statement ss6;
        try {
            s6 = con.prepareStatement(dephead);
             s6.execute(dephead);
            ss6=con.prepareStatement(create7);
            ss6.execute(create7);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request ------------------- on department head ");

        }
        Statement s7;
            Statement ss7;
        try {
            s7 = con.prepareStatement(facultystore);
             s7.execute(facultystore);
            ss7=con.prepareStatement(create8);
            ss7.execute(create8);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request--------------- on faculty store  ");

        }
        Statement s8;
           Statement ss8;
        try {
           
            s8 = con.prepareStatement(housingoffice);
             s8.execute(housingoffice);
              ss8=con.prepareStatement(create9);
            ss8.execute(create9);
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request-------------------- on housing office ");

        }
        Statement s9;
          Statement ss9;
        try {
             s9 = con.prepareStatement(library);
             s9.execute(library);
            ss9=con.prepareStatement(create10);
            ss9.execute(create10);
           
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request------------------ on library  ");

        }
        Statement s10;
            Statement ss10;
        try {
             s10 = con.prepareStatement(registrar);
             s10.execute(registrar);
            ss10=con.prepareStatement(create11);
            ss10.execute(create11);
           
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request---------------- on registrar ");

        }
        Statement s11;
          Statement ss11;
        try {
            s11 = con.prepareStatement(sportmaster);
             s11.execute(sportmaster);
            ss11=con.prepareStatement(create12);
            ss11.execute(create12);
            
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request-------------------- sportmaster ");

        }
        Statement s12;
            Statement ss12;
        try {
               s12 = con.prepareStatement(studentscafe);
             s12.execute(studentscafe);
            ss12=con.prepareStatement(create13);
            ss12.execute(create13);
         
        } catch (SQLException ex) {
             ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "error occured while processing your request------------------ on students cafe  ");

        }




    }
    
  public static void insertStudents(){
      int i=0;
      String studID[]=null;
      // 
         Connection con=connection.connectDB();
        try {
            String id []= new String [2000000];
            
           
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
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
           
            
               PreparedStatement ps;
                String query;
                DateFormat df = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        Date d=new Date();
        Instant instant = d.toInstant();
        ZoneId zoneID = ZoneId.systemDefault();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zoneID);
        LocalDate localDate = zdt.toLocalDate();

            for(int k=0;k<=i;k++){
                try{
                // INSERT IN TO ADVISOR
          query="insert into advisor values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();
            
   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
// INSERT INRO CONTINUING EDUCATION

  query="insert into continuingeducation values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();
   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
                
        // INSERT INTO CONTINUING EDUACTION BUSSINES AFFAIR   
                
              
         query="insert into continuingeducationBA values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute();         
               
                   } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
         //       INSERT INTO DEAN  OF RPG 
         
           query="insert into deanofrpg values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
         
           } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            // INSERT INTO DEPARTMENT HEAD 
         
         
          query="insert into DEPARTMENTHEAD values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
         
                
            
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            
            // INSERT INTO FACULTY STORE 
            
            
           query="insert into FACULTYSTORE values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            // INSERT INTO HOUSING OFFICE
            
          query="insert into HOUSINGOFFICE values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            
             } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{  
            
            // INSERT INTO LIBRARY 
            
                   query="insert into LIBRARY values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            
              } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{ 
            
            //  INSER INTO  REGISTRAR
          query="insert into REGISTRAR values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,1);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            
            
               } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            
            // INSERT INTO SPORT MASTER 
         query="insert into SPORTMASTER values(?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.execute(); 
            
            } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
            try{
            // INSERT INTO STUDENTS CAFE 
                   query="insert into STUDENTSCAFE values(?,?,?,?,?) ";
            
            ps=con.prepareStatement(query);  
                
            ps.setString(1, studID[k]);
            ps.setInt(2,0);
            ps.setString(3, "default");
            ps.setDate(4, (java.sql.Date.valueOf(localDate)));
            ps.setInt(5, 0);
            ps.execute(); 
            
            
            
        } catch (SQLException ex) {
           System.out.println(ex);
           ex.printStackTrace();
        }
        
    
    
    }
    }
            
    public static void main(String ... args ){
        maincontroler.datamigration("2009");
    }
}
