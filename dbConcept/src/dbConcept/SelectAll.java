package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAll {

	public static void main(String[] args) {
		
		System.out.println("모든 데이터");
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String pw = "oracle";
		
		String sql = "Select * From test";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i=0; i<ps.getFetchSize(); i++) {
				if(rs.next())
				{
					System.out.println((i+1) + "번 회원정보");
					System.out.println("아이디 : " +rs.getString("id"));
					System.out.println("비밀번호 : " +rs.getString("pw"));
					System.out.println("이름 : " +rs.getString("name"));
					System.out.println("회원번호 : " +rs.getString("member_num"));
					System.out.println();
					
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	    try {
	    	if(rs !=null)
	    		rs.close();
	    	if(ps !=null)
	    		ps.close();
	    	if(con !=null)
	    		con.close();
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}
/*
 * Connection con = null;
		String user = "douzone";
		String password = "oracle";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("SELECT * FROM test");
			rs = ps.executeQuery();
			System.out.println("ID\tPW\tNAME\tMEMBER_NUM");
			System.out.println("--------------------------------------");
			while(rs.next()) {
				System.out.println(
					rs.getString("id") + "\t"+rs.getString("pw")+"\t"
					+rs.getString("name") + "\t"+rs.getLong("member_num")
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
 */