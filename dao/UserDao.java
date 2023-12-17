package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.User;
import Sanjeevani.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
    //validating whether values input by user are correct or not and input should be allowed or not.
    
    //we are returning username from here
//    public static String validateUser(User user) throws SQLException{
//       Connection conn = DBConnection.getConnection();
//       PreparedStatement ps = conn.prepareStatement("select user_name from users where login_id=? and password=? and user_type=?");
//       ps.setString(1, user.getLoginId());
//       ps.setString(2, user.getPassword());
//       ps.setString(3, user.getUserType());
////       String userName = ps.executeQuery(); //--> return type of executeQuery is resultSet
//        ResultSet rs = ps.executeQuery();
//        if(rs.next()){
//            return rs.getString("user_name");
//        }
//        else{
//            return null;
//        }
//        
//    }
         public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         if(rs.next()){
             String name=rs.getString(1);
             return name;
         }
         else{
             
            return null; 
         }
         
   }

    static void updateName(String currentName, String newName) throws SQLException {
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=? where user_name=?");
        ps.setString(1, newName);
        ps.setString(2, currentName);
        ps.executeUpdate();
    }

    static void removeEmp(String currentName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from users where user_name=?");
        ps.setString(1, currentName);
        ps.executeUpdate();
    }
    public static boolean addUser(UserPojo user) throws SQLException{
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into users values(?,?,?,?)");
        ps.setString(1, user.getLoginId());
        ps.setString(2,user.getUserName());
        ps.setString(3,user.getPassword());
        ps.setString(4, user.getUserType().toUpperCase());
        return ps.executeUpdate()==1;
    }
    
    static boolean updateUser(String oldName, String loginId, String newName) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set login_id=?, user_name=? where user_name=?");
        ps.setString(1, loginId);
        ps.setString(2, newName);
        ps.setString(3, oldName);
        return ps.executeUpdate()==1;
    }
}
