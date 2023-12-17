package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmpDao {
    public static String generateNextId() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(emp_id) from employees");
        rs.next();//-->?
        String str = rs.getString(1);
        int empId =101;
        
        if(str!=null){
            String id = str.substring(1);
            empId = Integer.parseInt(id);
            empId++;
        }
        String newId = "E"+empId;
        return newId;
    }
    
    public static boolean addEmp(EmpPojo emp) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into employees values(?,?,?,?)");
        ps.setString(1, emp.getEmpId());
        ps.setString(2, emp.getEmpName());
        ps.setString(3, emp.getEmpDepartment());
        ps.setString(4, String.valueOf(emp.getEmpSal()));
//        int ans = ps.executeUpdate();
//        return ans==1;
        return ps.executeUpdate()==1;
    }
    
    public static boolean updateEmp(EmpPojo emp) throws SQLException{
    
        //here EmpPojo object will contain the new values whereas the old values can be extracted from the table using query.
        updateName(emp);
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update employees set emp_name=?,emp_salary=? where emp_id=?");
        ps.setString(1, emp.getEmpName());
        ps.setDouble(2, emp.getEmpSal());
        ps.setString(3, emp.getEmpId());
        
//        int ans = ps.executeUpdate();
        return ps.executeUpdate()==1;
        }
    

    private static void updateName(EmpPojo emp) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select emp_name from employees where emp_id=?");
        ps.setString(1, emp.getEmpId());
        ResultSet rs = ps.executeQuery();
        
        rs.next();
        String currentName = rs.getString(1);
        String newName = emp.getEmpName();
        UserDao.updateName(currentName, newName);
        
        if(emp.getEmpDepartment().equalsIgnoreCase("Receptionist")){
            ReceptionistDao.updateName(currentName, newName);
        }
        else if(emp.getEmpDepartment().equalsIgnoreCase("doctor"))
            DoctorDao.updateName(currentName, newName);
    }

    public static List<String> getAllEmployeeId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select emp_id from employees");
        List <String> empIdList = new ArrayList<>();
        while(rs.next()){
            empIdList.add(rs.getString(1));
        }
        return empIdList;
    }

    public static EmpPojo getEmployeeDetails(String empId) throws SQLException {
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from employees where emp_id=?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        
        rs.next();
        //we dont have to check whether rs has a value or not because it will most definitely have one as this employee id is generated from the backend only. 
        EmpPojo emp = new EmpPojo();
        emp.setEmpId(empId);
        emp.setEmpName(rs.getString(2));
        emp.setEmpDepartment(rs.getString(3));
        emp.setEmpSal(rs.getDouble(4));
        
        return emp;
    }
    
    public static List<EmpPojo> getAllEmployeeDetails() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from employees");
        List<EmpPojo> empList = new ArrayList<>();
        while(rs.next()){
            EmpPojo emp = new EmpPojo();
            emp.setEmpId(rs.getString(1));
            emp.setEmpName(rs.getString(2));
            emp.setEmpDepartment(rs.getString(3));
            emp.setEmpSal(rs.getDouble(4));
            empList.add(emp);
        }
        return empList;
        
    }

    public static boolean removeEmp(EmpPojo emp) throws SQLException {
        removeEmpFromAll(emp);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("delete from employees where emp_id=?");
        ps.setString(1, emp.getEmpId());
        return ps.executeUpdate()==1;
    }
    private static void removeEmpFromAll(EmpPojo emp) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select emp_name from employees where emp_id=?");
        ps.setString(1, emp.getEmpId());
        ResultSet rs = ps.executeQuery();
        
        rs.next();
        String currentName = rs.getString(1);
        UserDao.removeEmp(currentName);
        
        if(emp.getEmpDepartment().equalsIgnoreCase("Receptionist")){
            ReceptionistDao.removeEmp(currentName);
        }
        if(emp.getEmpDepartment().equalsIgnoreCase("doctor"))
            DoctorDao.removeEmp(currentName);
    }
    
    public static Map<String, String> getUnregisteredDoctors() throws SQLException{
        
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select emp_id, emp_name from employees where emp_department='Doctor'  and emp_name not in (select user_name from users where user_type='DOCTOR') order by emp_id");
//        if(rs.next()){
////            System.out.println("has values");
////        }
//    rs.next();
//        //we are not using Array List 
//        //we dont need a sorted output, we need to perform searching. hence we are using HashMap instead of TreeMap.
        Map<String, String> unRegDoc = new HashMap<>();
        while(rs.next()){
            System.out.println(rs.getString(1));
            String id = rs.getString(1);
            String name = rs.getString(2); 
            unRegDoc.put(id, name);
        }System.out.println(unRegDoc);
        return unRegDoc;
        
//           Connection conn=DBConnection.getConnection();
//   Statement st=conn.createStatement();
//   ResultSet rs=st.executeQuery("Select emp_id,emp_name from employees where emp_department='Doctor' and emp_name not in (select user_name from users where user_type='Doctor')order by emp_id");
//   Map<String,String> unRegDocList=new HashMap<>();
//   while(rs.next()){
//       String id=rs.getString(1);
//       String name=rs.getString(2);
//       unRegDocList.put(id, name);
//   }
//   System.out.println(unRegDocList);
//   return unRegDocList;
//    }
    
    }
    
    public static Map<String, String> getUnregistered(String dept) throws SQLException{
         Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("Select emp_id, emp_name from employees where emp_department=?  and emp_name not in (select user_name from users where user_type=?) order by emp_id");
        ps.setString(1, dept);
        ps.setString(2, dept.toUpperCase());
        ResultSet rs = ps.executeQuery();
        Map<String, String> unReg = new HashMap<>();
        while(rs.next()){
            System.out.println(rs.getString(1));
            String id = rs.getString(1);
            String name = rs.getString(2); 
            unReg.put(id, name);
        }
        System.out.println(unReg);
        return unReg;
    }
    
}
