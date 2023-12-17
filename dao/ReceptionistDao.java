package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.ReceptionistPojo;
import Sanjeevani.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ReceptionistDao {
        static void updateName(String currentName, String newName) throws SQLException {
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update  receptionists set receptionist_name=? where receptionist_name=?");
        ps.setString(1, newName);
        ps.setString(2, currentName);
        ps.executeUpdate();
    }

    static void removeEmp(String currentName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from receptionists where receptionist_name=?");
        ps.setString(1, currentName);
        ps.executeUpdate();
    }
    
    public static boolean addReceptionist(ReceptionistPojo recep, UserPojo user) throws SQLException{
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into receptionists values(?,?,?)");
        ps.setString(1, recep.getRecId());
        ps.setString(2, recep.getRecName());
        ps.setString(3, recep.getGender());
        boolean recAns =false;
        if(ps.executeUpdate()==1){
            recAns = true;
        }
        boolean userAns = UserDao.addUser(user);
        System.out.println(recAns);
        return recAns && userAns;
    }
    public static String getNewRecId() throws SQLException{
        Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(receptionist_id) from receptionists");
   rs.next();
   int recId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       recId=Integer.parseInt(num)+1;
   }
   return "REC"+recId;
    }
    
    public static List<ReceptionistPojo> getRecDetailsofAll() throws SQLException{
         Connection conn = DBConnection.getConnection();
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery("Select * from receptionists");
        List<ReceptionistPojo> allRec = new ArrayList<>();
        while(rs.next()){
            ReceptionistPojo doc = new ReceptionistPojo();
            doc.setRecId(rs.getString("receptionist_id"));
            doc.setRecName(rs.getString("receptionist_name"));
            doc.setGender(rs.getString("gender"));
            allRec.add(doc);
        }
        return allRec;
    }
    public static boolean removeRec(String recId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        UserDao.removeEmp(getRecName(recId));
        PreparedStatement p = conn.prepareStatement("delete from receptionists where receptionist_id=?");
        p.setString(1, recId);
        return p.executeUpdate()==1;
    }

    public static String getRecName(String recId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select receptionist_name from receptionists where receptionist_id=?");
        ps.setString(1, recId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String rec_name =rs.getString(1);
        return rec_name;
    }

    public static List<String> getAllRecId() throws SQLException {
         Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select receptionist_id from receptionists order by receptionist_id");
        List<String> recId = new ArrayList<>();
        while(rs.next()){
            recId.add(rs.getString(1));
        }
        return recId;
    }
    
    public static boolean updateRec(ReceptionistPojo rec, String loginId) throws SQLException{
        System.out.println(rec.getRecId());
        String currentName = getRecName(rec.getRecId());
        boolean userAns = UserDao.updateUser(currentName, loginId, rec.getRecName());
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update receptionists set receptionist_name=?, gender=? where receptionist_id=?");
        ps.setString(1, rec.getRecName());
        ps.setString(2, rec.getGender());
        ps.setString(3, rec.getRecId());
        boolean recAns = false;
        if(ps.executeUpdate()==1){
            recAns = true;
        }
        return recAns && userAns;
    }
    public static ReceptionistPojo getAllRecDetails(String recId)throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from receptionists where receptionist_id=?");
        ps.setString(1,recId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        ReceptionistPojo rec = new ReceptionistPojo();
        rec.setRecId(recId);
        rec.setRecName(rs.getString("receptionist_name"));
        rec.setGender(rs.getString(3));
        return rec;
    }
}
