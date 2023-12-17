package Sanjeevani.pojo;


public class UserProfile {
    //this will have the username and will return back the user name
    //whereas user will have the usertype, id and password.
    
    private static String userName;
    private static String userType;
    private static String userId;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserProfile.userType = userType;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UserProfile.userId = userId;
    }
    
    
}
