package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeBoardDAO {
	
	//목록조회
	public List<NoticeBoardDTO> selectNbList(){
		Connection con= JdbcUtil.getConnection();
		List<NoticeBoardDTO> nbList = new ArrayList<NoticeBoardDTO>();
		String query = "select nb_no, nb_title,nb_content, nb_writer, nb_createdate, nb_cnt, files "
						+"from noticeboard ";
		PreparedStatement stmt = null;
		ResultSet rs = null;
			
		try {
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("nb_no");
				String title = rs.getString("nb_title");
				String content = rs.getString("nb_content");
				String writer = rs.getString("nb_writer");
				Date createdate = rs.getDate("nb_createdate");
				int cnt = rs.getInt("nb_cnt");
				String files = rs.getString("files");
				nbList.add(new NoticeBoardDTO(no,title,content,writer,createdate,cnt,files));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				JdbcUtil.close(rs);
				JdbcUtil.close(stmt);
				JdbcUtil.close(con);
			}
			return nbList;
		}
	
	
	
	//상세조회
	public NoticeBoardDTO getNbDt(int no) {
		Connection con = JdbcUtil.getConnection();
		String query = "select * "
						+"from noticeboard "
						+"where nb_no = ?";
		PreparedStatement stmt = null;
		NoticeBoardDTO dto = null;
		ResultSet rs = null;
		
		try {
			dto = new NoticeBoardDTO(); 
			stmt = con.prepareStatement(query);
			stmt.setInt(1, no);
			rs= stmt.executeQuery();
			if(rs.next()) {
				dto.setNbNo(rs.getInt("nb_no"));;
				dto.setNbTitle(rs.getString("NB_TITLE"));
				dto.setNbContent(rs.getString("NB_CONTENT"));
				dto.setNbWriter(rs.getString("NB_WRITER"));
				dto.setNbCreateDate(rs.getDate("NB_CREATEDATE"));
				dto.setNbCnt(rs.getInt("NB_CNT"));
				dto.setFiles(rs.getString("FILES"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(stmt);
		}
		return dto;
	}
	
	
	
	
	//입력
	//
	//parameter no 글넘버, title 글제목 content 글내용,
	public int insertNb(int no, String title, String content, String writer, int cnt, String files) {
		Connection con = JdbcUtil.getConnection();
		String query = "insert into noticeboard(nb_no,nb_title,nb_content,nb_writer,nb_cnt,files) "
						+"values (?, ?, ?, ?, ?, ?)" ;
		PreparedStatement stmt = null;
		int resultCnt = 0;
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt(1, no);
			stmt.setString(2,title);
			stmt.setString(3,content);
			stmt.setString(4,writer);
			stmt.setInt(5,cnt);
			stmt.setString(6,files);
			resultCnt= stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return resultCnt;
	}
	
	
	
	//수정
	public int updateNb(int no, String title, String content, String writer, int cnt, String files) {
		Connection con = JdbcUtil.getConnection();
		String query = "update noticeboard "
						+"set nb_title = ?, nb_content = ?, nb_writer = ?, nb_cnt = ?, files = ?" 
						+"where nb_no = ?";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1,title);
			stmt.setString(2,content);
			stmt.setString(3,writer);
			stmt.setInt(4,cnt);
			stmt.setString(5,files);
			stmt.setInt(6, no);
			resultCnt= stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return resultCnt;
	}
	
	
	
	//삭제
	public int deleteNb(int no) {
		Connection con = JdbcUtil.getConnection();
		String query = "delete from noticeboard "
						+"where nb_no = ?";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt(1, no);
			resultCnt= stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return resultCnt;
	}
	
}
