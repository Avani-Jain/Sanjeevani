package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.DoctorPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DoctorDao {
    public static void updateName(String currentName, String newName) throws SQLException {
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
        ps.setString(1, newName);
        ps.setString(2, currentName);
        ps.executeUpdate();
    }

    public static void removeEmp(String currentName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from doctors where doctor_name=?");
        ps.setString(1, currentName);
        ps.executeUpdate();
    }
    
    public static boolean addDoctor(DoctorPojo doc)throws SQLException{
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)"); 
        ps.setString(1, doc.getDocId());
        ps.setString(2, doc.getDocName());
        ps.setString(3, doc.getEmailId());
        ps.setString(4, doc.getContactNo());
        ps.setString(5, doc.getQualification());
        ps.setString(6, doc.getGender());
        ps.setString(7, doc.getSpecialist());
        return ps.executeUpdate()==1;
    }
    
    public static String getNewDocId() throws SQLException{
        Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(doctor_id) from doctors");
   rs.next();
   int docId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       docId=Integer.parseInt(num)+1;
    }
   return "DOC"+docId;
//        Connection conn = DBConnection.getConnection();
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("Select max(doctor_id) from doctors");
//        rs.next();
//        int docId = 101;
//        String id = rs.getString(1);
//        if(id!=null){
//            String num = id.substring(3);
//            docId = Integer.parseInt(num+1);
//        }
//        return "DOC"+docId;
    }
    
    public static List<String> getAllDocId() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select doctor_id from doctors order by doctor_id");
        List<String> docId = new ArrayList<>();
        while(rs.next()){
            docId.add(rs.getString(1));
        }
        return docId;
    }
    
    public static String getDocName(String docId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select doctor_name from doctors where doctor_id=?");
        ps.setString(1, docId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String doc_name =rs.getString(1);
        return doc_name;
    }
   
    
    //not removing from emp. this means the doctor is still an employee but maybe a different post. 
    public static boolean removeDoc(String docId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        UserDao.removeEmp(getDocName(docId));
        PreparedStatement p = conn.prepareStatement("delete from doctors where doctor_id=?");
        p.setString(1, docId);
        return p.executeUpdate()==1;
    }
    public static List<DoctorPojo> getAllDoctorDetails() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery("Select * from doctors");
        List<DoctorPojo> allDoc = new ArrayList<>();
        while(rs.next()){
            DoctorPojo doc = new DoctorPojo();
            doc.setDocId(rs.getString("doctor_id"));
            doc.setDocName(rs.getString("doctor_name"));
            doc.setQualification(rs.getString("qualification"));
            doc.setContactNo(rs.getString("contact_no"));
            doc.setEmailId(rs.getString("email_id"));
            doc.setGender(rs.getString("gender"));
            doc.setSpecialist(rs.getString("specialist"));
            allDoc.add(doc);
        }
        return allDoc;
    }
}
