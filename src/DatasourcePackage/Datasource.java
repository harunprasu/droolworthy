
package DatasourcePackage;
import LoginPackage.*;
import java.util.*;
import java.sql.*;
import java.text.*;

public class Datasource {

	static Connection currentcon=null;
	static ResultSet rs;
	public static  UserBean login(UserBean b){
		Statement s=null;
		String username=b.getUsername();
		String password=b.getPassword();
		String query="select user_name,USER_UID,FIRST_NAME,LAST_NAME from cmn_sec_users";
		System.out.println("username is "+username);
		System.out.println("password is "+password);
		System.out.println("query is "+query);
		try{
			currentcon=Dbconnection.getConnection();
			s=currentcon.createStatement();
			rs=s.executeQuery(query);
			boolean ifrecods=rs.next();
			 	if(!ifrecods){
			 		System.out.println("not a registered user");
			 		b.setValid(false);
			 	}else if(ifrecods){
			 		String firstname=rs.getString("FIRST_NAME");
			 		String lastname=rs.getString("LAST_NAME");
			 		b.setValid(true);
			 	}
			
		}catch(Exception E){
			System.out.println("Login failed \n"+E);
						   }
		finally
		{
			if(rs!=null)
			try{
				rs.close();
			}catch(Exception e){}
			rs=null;
			
			if(s!=null){
				try{
					s.close();
				}catch(Exception e){}
			s=null;	
			}
			
			if(currentcon!=null){
				try{
					currentcon.close();
				}catch(Exception e){}
				currentcon=null;
			}
		}
		
		return b;
	}
	
	

}
