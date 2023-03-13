package dbConcept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDaoImpl{
	Connection con; //기본 값 null
	PreparedStatement ps = null;
	ResultSet rs = null;
	public MemberDaoImpl(){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "douzone";
		String password = "oracle";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url,id,password);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert(int num, String email, String name, String mobile) {
		String sql = "Insert Into db_concept Values(?, ?, ?, ?)";
		try {
//			ps = con.prepareStatement("Select email From db_concept Where email =?");
//			ps.setString(1, email);
//			rs = ps.executeQuery();
		//	if(rs.next()) {
				//if(rs.getString("email").equals(email)==false){
			ps = con.prepareStatement(sql);
			System.out.println(num +" "+ email +" "+ name +" "+ mobile);
			ps.setLong(1, num);
			ps.setNString(2, email);
			ps.setNString(3, name);
			ps.setString(4, mobile);
			ps.executeUpdate();
			System.out.println("등록 완료");
		//	}
		//		else System.out.println("등록된 이메일 입니다.");
			//}
			}catch (Exception e) {
				e.printStackTrace();
				}
		exit();
	}
	public void selectEmail(String email) {
		String sql = "Select * From db_concept Where email=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
			System.out.println("회원번호 : " + rs.getInt("member_num") );
			System.out.println("이메일 : " + rs.getString("email") );	
			System.out.println("이름 : " + rs.getString("name") );
			System.out.println("전화번호 : " + rs.getString("mobile") );
			}
			else System.out.println("미등록 이메일 입니다.");
			}catch (Exception e) {
				e.printStackTrace();
				}
		exit();
	}



	public void delete(String email) {
		String sql = "Delete From db_concept Where email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				ps.setString(1, email);
				ps.executeUpdate();
				System.out.println("삭제완료");
			}
			else System.out.println("미등록 이메일 입니다.");
			}catch (Exception e) {
				e.printStackTrace();
				}
		exit();
	}


	public void selectAll() {
		System.out.println("모든 데이터");
		String sql = "Select * From db_concept";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("MEMBER_NUM\tID\tNAME\tMOBILE");
			System.out.println("--------------------------------------");
				while(rs.next())
				{
					System.out.println(
							rs.getString("member_num") + "\t"+rs.getString("email")+"\t"
							+rs.getString("name") + "\t"+rs.getLong("mobile"));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		exit();
		return ;
	}
	public void update(String email, String name, String mobile) {
		String sql = "Update db_concept Set name=?, mobile=? Where email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, mobile);
			ps.setString(3, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println();
			System.out.println("변경 완료");
			}
			else System.out.println("미등록 이메일 입니다.");
			}catch (Exception e) {
				e.printStackTrace();
				}
		exit();
	}
	public void exit()
	{
		try {
	    	if(con !=null)
	    		con.close();
	    	if(ps !=null)
	    		ps.close();
	    	if(rs !=null)
	    		rs.close();
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	
}
