package cms_system_adminstration_application;




import cms_system_adminstration_application.StudentBean;
import controler.connection;
import java.sql.*;

/**
 *
 * @author Bit
 */
public class read {

    
    public static StudentBean getStudent(String sid) throws NullPointerException, ClassNotFoundException, SQLException {
        StudentBean stud = null;
        Connection con = connection.connectDB();
        //     System.out.println(" about to reading ");
        CallableStatement cst = null;

        String sql = "{CALL getStudent(?,?,?,?,?,?,?,?)}";
        cst = con.prepareCall(sql);
        cst.setString(1, sid);
        cst.registerOutParameter(2, java.sql.Types.VARCHAR);
        cst.registerOutParameter(3, java.sql.Types.VARCHAR);

        cst.registerOutParameter(4, java.sql.Types.VARCHAR);
        cst.registerOutParameter(5, java.sql.Types.VARCHAR);
        cst.registerOutParameter(6, java.sql.Types.VARCHAR);
        cst.registerOutParameter(7, java.sql.Types.NUMERIC);
        cst.registerOutParameter(8, java.sql.Types.VARCHAR);

        cst.executeQuery();

        stud = new StudentBean(cst.getString(2), cst.getString(3), cst.getString(4), cst.getString(5),
                cst.getString(6), cst.getInt(7), cst.getString(8));
        con.close();
        return stud;
    }

   

}
