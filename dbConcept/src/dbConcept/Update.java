package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String pw = "oracle";
		String sql = "Update test Set pw=? Where id=?";
		//Update test Set pw=3333 Where id='test3'
		String sql2 = "Select id, pw From test Where id =?";
		ResultSet rs = null;
		PreparedStatement ps =null, ps2 = null;
		System.out.println("### 암호 변경 ###");
		System.out.print("아이디 : "); String sid = sc.next();
		System.out.print("변경할 비밀번호 : "); String spw = sc.next();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps2 = con.prepareStatement(sql2);
			ps2.setString(1, sid);
			rs = ps2.executeQuery();
			if(rs.next()) {
				System.out.println();
				System.out.println("변경 전 pw");
				System.out.print("아이디 : " + rs.getString("id") + " 비밀번호 : " + rs.getString("pw"));
			}
			ps = con.prepareStatement(sql);
			ps.setString(2, sid);
			ps.setString(1, spw);
			ps.executeUpdate();
			rs = ps2.executeQuery();
			if(rs.next()) {
				System.out.println();
			System.out.println("변경 후 pw");
			System.out.print("아이디 : " + rs.getString("id") + " 비밀번호 : " + rs.getString("pw"));}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
			if(rs != null)
				rs.close();
			if(sc != null)
				sc.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
/*
//아이디를 입력 받아 비밀번호를 수정

		Connection con = null;
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
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("현재 비밀번호 : "); String currentPw = sc.next();
		System.out.print("변경 비밀번호 : "); String changePw = sc.next();
		String sql = "SELECT pw FROM test WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(currentPw)) {
					sql = "UPDATE test SET pw=? WHERE id=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, changePw);
					ps.setString(2, id);
					ps.executeUpdate();
					System.out.println("비밀번호가 수정되었습니다.");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("미등록 정보입니다.");
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