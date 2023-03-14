package dbConcept03.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbConcept03.dto.MemberDTO;

public class MemberDao implements IDao{
	private Connection con;
	public MemberDao() {
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
	public MemberDTO selectId(String id) {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept3 WHERE id=?";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("member_num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertMember(MemberDTO member) {
		PreparedStatement ps = null;
		String sql = "SELECT nvl(max(member_num), 0)+1 as max_num FROM db_concept3";
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				member.setNum(rs.getInt(1));//rs.getInt("max_num");
			}else {
				member.setNum(0);
			}
			sql = "INSERT INTO db_concept3 VALUES(?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, member.getNum());
			ps.setString(2, member.getId());
			ps.setString(3, member.getPw());
			ps.setString(4, member.getName());
			ps.setString(5, member.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		PreparedStatement ps = null;
		String sql = "SELECT * FROM db_concept3";
		ResultSet rs = null;
		ArrayList<MemberDTO> memberss = new ArrayList<MemberDTO>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("member_num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				memberss.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberss;
	}

	@Override
	public int updateMember(MemberDTO member) {
		String sql = "UPDATE db_concept3 SET name = ?, email = ? WHERE id = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(3, member.getId());
			ps.setString(1, member.getName());
			ps.setString(2, member.getEmail());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteMember(String id) {
		String sql = "DELETE FROM db_concept3 WHERE id = ?";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
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
