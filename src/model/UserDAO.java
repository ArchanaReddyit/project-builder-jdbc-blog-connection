//package model;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import utility.ConnectionManager;
//
//public class UserDAO {
//	public void addUser(User user) throws ClassNotFoundException, SQLException {
//		String email=user.getEmail();
//	String password=user.getPassword();
//	String confirm=user.getConfirmpassword();
//	
//	ConnectionManager cm=new ConnectionManager();
//	
//	//insert all details into database
//	String sql = "insert into USERDETAILS(EMAIL , PASSWORD, CONFIRMPASSWORD)VALUES(?,?,?)";
//	//Create Statement Object
//	PreparedStatement st=cm.getConnection().prepareStatement(sql);
//	st.setString(1, email);
//	st.setString(2, password);
//	st.setString(3, confirm);
//	
//	
//	st.executeUpdate();
//	cm.getConnection().close();
//	
//	}
//}
