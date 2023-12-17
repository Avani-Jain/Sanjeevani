package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.PatientPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PatientDao {
    public static String getNewPatientId() throws SQLException{
        Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(patient_id) from patients");
   rs.next();
   int patId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       patId=Integer.parseInt(num)+1;
    }
   return "PAT"+ patId;
}
    
    public static boolean addPatient(PatientPojo pat)throws SQLException{
         Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     ps.setString(1,pat.getPatientId());
     ps.setString(2, pat.getFirstName());
     ps.setString(3,pat.getLastName());
     ps.setInt(4, pat.getAge());
     ps.setString(5, pat.getGender());
     ps.setString(6, pat.getMarriedStatus());
     ps.setString(7, pat.getAddress());
     ps.setString(8,pat.getCity());
     ps.setString(9, pat.getMno());
     ps.setDate(10, pat.getDate());
     ps.setInt(11, pat.getOtp());
     ps.setString(12,pat.getOpd());
     ps.setString(13, pat.getDoctorId());
     ps.setString(14, pat.getAptStatus());
     return ps.executeUpdate()==1;
    }
    
     public static List<PatientPojo> getAllPatientDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from patients order by patient_id");
    List<PatientPojo>patList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pat=new PatientPojo();
    pat.setPatientId(rs.getString("patient_id"));
    pat.setFirstName(rs.getString("first_name"));
    pat.setLastName(rs.getString("last_name"));
    pat.setAge(rs.getInt("age"));
    pat.setGender(rs.getString("gender"));
    pat.setMarriedStatus(rs.getString("m_status"));
    pat.setAddress(rs.getString("address"));
    pat.setCity(rs.getString("city"));
    pat.setMno(rs.getString("mobile_no"));
    pat.setDate(rs.getDate("p_date"));
    pat.setOpd(rs.getString("opd"));
    pat.setAptStatus(rs.getString("status"));
    pat.setDoctorId(rs.getString("doctor_id"));
    patList.add(pat);   
    
    }
    return patList;
     }
    
    public static List<PatientPojo> getAllPatientDetailsByDocId(String docId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from patients where doctor_id=? and status='REQUEST' order by patient_id");
    ps.setString(1,docId);
    ResultSet rs=ps.executeQuery();
    List<PatientPojo>patList=new ArrayList<>();
    while(rs.next()){
    PatientPojo pat=new PatientPojo();
    pat.setPatientId(rs.getString("patient_id"));
    pat.setFirstName(rs.getString("first_name")+" "+rs.getString("last_name"));
    pat.setDate(rs.getDate("p_date"));
    pat.setOpd(rs.getString("opd"));
    patList.add(pat);   
    }
    return patList;
    }
      public static boolean updateStatus(String patientId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update patients set status='CONFIRM' where patient_id=?" );
     ps.setString(1, patientId);
     return ps.executeUpdate()==1;
     
     
 }
      public static List<String> getAllPatientId() throws SQLException{
          Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select patient_id from patients order by  patient_id");
        List<String> patId = new ArrayList<>();
        while(rs.next()){
            patId.add(rs.getString(1));
        }
        return patId;
      }
      
      public static PatientPojo getAllPatientDetailsByPatientId(String patId) throws SQLException{
          Connection conn = DBConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement("select * from patients where patient_id=?");
          ps.setString(1, patId);
          ResultSet rs = ps.executeQuery();
          PatientPojo pat = new PatientPojo();
          pat.setPatientId(patId);
          while(rs.next()){
              pat.setFirstName(rs.getString(2));
              pat.setLastName(rs.getString(3));
              pat.setAge(rs.getInt(4));
              pat.setGender(rs.getString(5));
              pat.setMarriedStatus(rs.getString(6));
              pat.setAddress(rs.getString(7));
              pat.setCity(rs.getString(8));
              pat.setMno(rs.getString(9));
              pat.setDate(rs.getDate(10));
              pat.setOtp(rs.getInt(11));
              pat.setOpd(rs.getString(12));
              pat.setDoctorId(rs.getString(13));
              pat.setAptStatus(rs.getString(14));
          }
          return pat;
      }
      
      public static boolean updatePatient(PatientPojo patient) throws SQLException{
          Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update patients set first_name=?, last_name=?, age=?, gender=?, M_Status=?, address=?, city=?, mobile_no=?, otp=?, opd=?, doctor_id=? where patient_id=?");
        ps.setString(1, patient.getFirstName());
        ps.setString(2, patient.getLastName());
        ps.setInt(3, patient.getAge());
        ps.setString(4, patient.getGender());
        ps.setString(5, patient.getMarriedStatus());
        ps.setString(6, patient.getAddress());
        ps.setString(7, patient.getCity());
        ps.setString(8, patient.getMno());
        ps.setInt(9, patient.getOtp());
        ps.setString(10, patient.getOpd());
        ps.setString(11, patient.getDoctorId());
        ps.setString(12, patient.getPatientId());
        boolean ans = false;
        if(ps.executeUpdate()==1){
            ans = true;
        }
        return ans;
      }

    public static boolean removePatient(String patId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from patients where patient_id=?");
        ps.setString(1, patId);
        return ps.executeUpdate() ==1;
    }
}

