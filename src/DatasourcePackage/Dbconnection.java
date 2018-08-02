package DatasourcePackage;

import java.sql.*;
import java.util.*;
public class Dbconnection {

	static Connection con;
	static String url;
	
	public static Connection getConnection()
	{
		try{
			url="jdbc:sqlserver://VM-SRV_CLRTY\\SQLEXPRESS;databaseName=niku";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try{
				
				con=DriverManager.getConnection(url,"clarityuser","assyst@321");
				
			}catch(SQLException E){
				E.printStackTrace();
				}
			}catch(ClassNotFoundException E){
				E.printStackTrace();
				
		}
	return con;	
	}
	
	}
