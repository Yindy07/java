package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String pw = "oracle";
		String sql = "Delete From test Where id=?";
		//Update test Set pw=3333 Where id='test3'
		String sql2 = "Select id, pw From test Where id =?";
		ResultSet rs = null;
		PreparedStatement ps =null, ps2 = null;
		System.out.println("### 삭제 ###");
		System.out.print("아이디 : "); String sid = sc.next();
		System.out.print("비밀번호 : "); String spw = sc.next();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps2 = con.prepareStatement("Select * From test");
			rs = ps2.executeQuery();
			if(rs.next()) {
				System.out.println("삭제 전");
				System.out.println("아이디\t비밀번호\t이름\t번호");
				while(rs.next()) {
					System.out.println(
						rs.getString("id") + "\t"+rs.getString("pw")+"\t"
						+rs.getString("name") + "\t"+rs.getLong("member_num")
					);
			}
		}
			////////////////////////////////////////////////////////////////////////////
			ps2 = con.prepareStatement(sql2);
			ps2.setString(1, sid);
			rs = ps2.executeQuery();
			if(rs.next()) {
				if(rs.getString("id").equals(sid) && rs.getString("pw").equals(spw)) {
					ps = con.prepareStatement(sql);
					ps.setString(1, sid);
					ps.executeUpdate();
					System.out.println("삭제완료");
				}
				else System.out.println("아이디 / 비밀번호가 틀립니다.");}
			else System.out.println("미등록 정보 입니다.");
			ps2 = con.prepareStatement("Select * From test");
			rs = ps2.executeQuery();
			if(rs.next()) {
				System.out.println("삭제 후");
				System.out.println("아이디\t비밀번호\t이름\t번호");
				while(rs.next()) {
					System.out.println(
						rs.getString("id") + "\t"+rs.getString("pw")+"\t"
						+rs.getString("name") + "\t"+rs.getLong("member_num")
					);
			}
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(ps != null)
				ps.close();
			if(ps2 !=null)
				ps2.close();
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
 * // 아이디(와 비밀번호)를 입력받아 아이디에 맞는 데이터 삭제
		
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
		System.out.print("비밀번호 : "); String pw = sc.next();

		String sql = "SELECT pw FROM test WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(pw)) {
					sql = "DELETE FROM test WHERE id=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, id);
					ps.executeUpdate();
					System.out.println("정보가 삭제되었습니다.");
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