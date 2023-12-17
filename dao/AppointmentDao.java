package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.AppointmentPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AppointmentDao {
 public static boolean addAppointment(AppointmentPojo appt)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into appointments values(?,?,?,?,?,?,?)");
     ps.setString(1,appt.getPatientId());
     ps.setString(2, appt.getPatientName());
     ps.setString(3,appt.getStatus());
     ps.setString(4, appt.getOpd());
     ps.setString(5, appt.getAppointmentDate());
     ps.setString(6,appt.getDoctorName());
     ps.setString(7,appt.getMobileNo());
     
     return ps.executeUpdate()==1;
}
 
 public static List<AppointmentPojo> getAllAppointmentsByDoctorName(String doctorName, String status) throws SQLException{
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps = conn.prepareStatement("Select * from appointments where doctor_name=? and status=? order by patient_id");
     ps.setString(1, doctorName);
     ps.setString(2, status);
     ResultSet rs= ps.executeQuery();
     List<AppointmentPojo> appList = new ArrayList<>();
     while(rs.next()){
         AppointmentPojo app = new AppointmentPojo();
         app.setPatientId(rs.getString("patient_id"));
         app.setPatientName(rs.getString("patient_name"));
        app.setOpd(rs.getString("opd"));
        app.setAppointmentDate(rs.getString("date_time"));
        app.setStatus(rs.getString("status"));
        app.setMobileNo(rs.getString("mobile_no"));
         
         
        appList.add(app);   
     }
     return appList;
 }
 
 public static boolean updateStatus(AppointmentPojo app)throws SQLException{
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps = conn.prepareStatement("Update appointments set status = ?, date_time =? where patient_id=?");
     ps.setString(1, app.getStatus());
     ps.setString(2, app.getAppointmentDate());
     ps.setString(3, app.getPatientId());
     return ps.executeUpdate()==1;
 }

    public static boolean updateAppointment(AppointmentPojo appt) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update appointments set patient_name=?, status=?, opd=?, date_time=?, doctor_name=?, mobile_no=? where patient_id=?");
        ps.setString(1, appt.getPatientName());
        ps.setString(2, appt.getStatus());
        ps.setString(3, appt.getOpd());
        ps.setString(4, appt.getAppointmentDate());
        ps.setString(5, appt.getDoctorName());
        ps.setString(6, appt.getMobileNo());
        ps.setString(7, appt.getPatientId());        
        boolean ans = false;
        if(ps.executeUpdate()==1){
            ans = true;
        }
        return ans;
      
    }
}
