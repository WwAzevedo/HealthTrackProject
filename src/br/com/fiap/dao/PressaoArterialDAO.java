package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fiap.healthtrack.PressaoArterial;

public class PressaoArterialDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void gravar(PressaoArterial pressao) {
	
	try {
		conexao = DataBaseConnection.obterConexao();
		pstmt = conexao.prepareStatement("INSERT INTO T_PRESSAO" + "(PRESSAO_ID, VL_PRESSAO, DT_PRESSAO, T_USUARIO_USUARIO_ID)" + "VALUES (PRESSAOID.NEXTVAL,?,?,111)");
		
		pstmt.setString(1, pressao.getPressao());
		pstmt.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
		pstmt.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			pstmt.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
 }
	
	public void buscarTodos() {
		ResultSet rs = null;
		try {
			conexao = DataBaseConnection.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO ORDER BY DT_PRESSAO DESC");
			rs = pstmt.executeQuery();
			
			System.out.println("+===============HIST”RICO PRESS„O=========+");
			while (rs.next()) {
				
				System.out.println(
				   "| Press„o Aterial: "+rs.getString("VL_PRESSAO")+"   Data "+
				   rs.getDate("DT_PRESSAO")+" |"
				   );
				
			}
			System.out.println("+==================================+======+\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

}
