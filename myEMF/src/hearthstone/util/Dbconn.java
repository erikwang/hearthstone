package hearthstone.util;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;


public class Dbconn{
		Connection conn;
		String dbDriver = "com.mysql.jdbc.Driver";
		String CONNECTUSERNAME = "hearth";
		String CONNECTPASSWORD = "hearth";
		String STRURL = "jdbc:mysql://localhost:3306/hearthstone";
		
		public Dbconn() throws Exception{
			Class.forName(dbDriver);
			//String strUrl = "jdbc:oracle:thin:@210.42.24.100:1521:dbeleven";
			//conn = DriverManager.getConnection(strUrl, "nicwf", "nicwf");				
			
			conn = DriverManager.getConnection(STRURL,CONNECTUSERNAME,CONNECTPASSWORD);
		}
		
		/*public OracleCallableStatement prepareCall(String sql) throws Exception{
			return (OracleCallableStatement) conn.prepareCall(sql);
		}*/
				
	
		/*
		public Dbconn(String server,String name,String user,String password) throws Exception{
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(STRURL,user,password);
		}
			
		public Statement createStatement() throws Exception{
   			return conn.createStatement();
  		}
  		*/
		
		
		
	public Statement createStatement() throws Exception{
			return conn.createStatement();
		}
	
  		public String info(){
  			String information;
  			information = "Java connect to MYSQL for HearthStone testing";
  			return information;
  		}	
  		
  		public void close(){
  			try{
  				conn.close();	
  			}catch (Exception e){
  				System.out.println(e);
  			}
  		}

}