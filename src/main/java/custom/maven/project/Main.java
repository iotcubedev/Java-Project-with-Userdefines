package custom.maven.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class Main {
	Connection connection = null;
	HttpServletRequest request = null;

	public static void main(String[] args) {
	}

	public ResultSet requestQuery(String acctNo) throws SQLException { 
		  String query = "SELECT * FROM myacts WHERE acntNo = " + acctNo;
		  PreparedStatement pstmt = connection.prepareStatement(query);
		  pstmt.setString( 1, request.getParameter("acnumber"));
		  ResultSet results = pstmt.executeQuery( );
		  return results;
		}
	
	public void executeCommand(String input) throws IOException {
		  Runtime r = Runtime.getRuntime();
		  String command = "";
		  if(isWindows()){
		  	command = "cmd -c " + input;
		  } else {
		    command = "bash " + input;
		  }
		  r.exec("/bin/sh -c some_tool" + command);
	}

	private boolean isWindows() {
		
		return false;
	}
}
