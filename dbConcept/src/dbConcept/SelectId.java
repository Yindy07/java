package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectId {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("아이디 : "); String userId = sc.next();
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String password = "oracle";
		String sql = "Select * From test Where id=?";
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url,id,password);
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery(); // ResultSet을 사용해야 데이터를 갖고 올 수 있음
			if(rs.next()) { //rs에 데이터가 있는지 / 데이터 있다면 true
				System.out.println("아이디 : " + rs.getString("id") );	//get으로 데이터 갖고와야함
				System.out.println("비밀번호 : " + rs.getString("pw") );
				System.out.println("이름 : " + rs.getString("name") );
				System.out.println("회원번호 : " + rs.getInt("member_num") );
			}
			else System.out.println("미등록된 회원입니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
			if(sc != null)
				sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
