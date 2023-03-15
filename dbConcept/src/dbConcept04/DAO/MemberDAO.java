package dbConcept04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import dbConcept04.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{

	private Connection con;
	public MemberDAO() {
		String user = "douzone";
		String password = "oracle";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Collection<MemberDTO> selectAll() {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept4";
		ResultSet rs = null;
		Collection<MemberDTO> memberss = new ArrayList<MemberDTO>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("pw"));
				member.setRegisterDate(rs.getString("conpw"));
				memberss.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberss;
	}

	@Override
	public MemberDTO selectEmail(String email) {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept4 WHERE email=?";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmail(rs.getString("email"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(MemberDTO member) {
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO db_concept4 VALUES(?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getRegisterDate());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(MemberDTO member) {
		String sql = "UPDATE db_concept4 SET pw=? WHERE email = ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(2, member.getEmail());
			ps.setString(1, member.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String email) {
		String sql = "DELETE FROM db_concept4 WHERE email = ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void disconnection() {
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
