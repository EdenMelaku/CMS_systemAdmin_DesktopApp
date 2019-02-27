/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms_system_adminstration_application;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MEBA
 */
public class checkValidation {

    public static Boolean one(String sid) {
        try {
            String pp = read.getStudent(sid).getProgram();
            if (pp.matches("ur") || pp.matches("us")) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException ex) {

            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public static Boolean two(String sid) {
        try {
            String pp = read.getStudent(sid).getProgram();
            if (pp.matches("ue")) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static Boolean three(String sid) {
        try {
            String pp = read.getStudent(sid).getProgram();
            if (pp.matches("pr") || pp.matches("ps")) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
