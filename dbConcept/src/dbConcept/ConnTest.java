package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnTest {

	public static void main(String[] args) {
		
		/*
		 * JDBC 자바 프로그램에서 데이터베이스 연결을 도와주는 기능의 집합
		 * 
		 * 1.JDBC Driver 실행
		 * 2.DataBase로 연결(Connection)
		 * 3.SQL 명령문을 담아 전달하기 위한 객체(PreparedStatement)생성
		 * 4.쿼리문을 담은 객체 내 메소드를 호출 DataBase로 전달.
		 * 5.Select 쿼리문 전달했으면 결과가 존재하기에 객체(ResultSet)로 받음.
		 * 6.위에서 열어둔 객체 해제.
		 */
		try{
			Class.forName("oracle.jdbc.OracleDriver");	//ojdbc driver실행 //오타 주의
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		/*
		 *  컴퓨터 주소 : ip
		 *  비유 : 서울특별시 동작구 노량진동 아이비빌딩
		 *  192.168.10.1 127.0.0.1
		 *  127.0.0.1 == 자기자신(내컴퓨터) == localhost			this랑 비슷한 느낌
		 *  Port Address or Port Number(컴퓨터에서 동작 중인 프로그램 식별 번호)
		 *  비유 : 302호
		 *  Oracle Database : 1521
		 */
		//driver명령어
		Connection con = null; //식별자로 항상 필요한 자료형
		String id = "douzone";
		String password = "oracle";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // thin : 경량화  | 경량화 방식으로 oracle에 연결한다는 뜻 |jdbc:oracle:thin: << 항상 동일 | xe:서비스 이름 문자열로 식별 , 디폴트로 많이 사용 |포트번호는 사용중이라면 1씩 증가해가며 찾아서 사용한다
		//jdbc:oracle:thin:@(db가 있는 pc의 ip주소):(포트번호):(서비스문자열) //자기자신의 ip주소 : localhost
		try { 
			con = DriverManager.getConnection(url, id, password); //(url, id, password)
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("### 회원 등록 ###");
		System.out.print("아이디 : "); String userId = sc.next();
		System.out.print("비밀번호 : "); String userPw = sc.next();
		System.out.print("이름: "); String userName = sc.next();
		String sql = "Insert Into test Values(?, ?, ?, test_seq.nextval)"; //setString 으로 물음표에 값 입력
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			//ps = con.prepareStatement("Insert Into Values(?, ?, ?, test_seq.nextval)"); //명령어를 받아
			ps.setString(1, userId);
			ps.setString(2, userPw);
			ps.setString(3, userName);
			
			ps.executeUpdate(); //db에 전달 //executeUpdate명령어는 :insert delete update에 씀 uid
			//select -> ps.executeQuery();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			sc.close();
	}

}
