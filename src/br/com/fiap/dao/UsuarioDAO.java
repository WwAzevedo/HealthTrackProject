package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.fiap.healthtrack.Usuario;

public class UsuarioDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void gravar(Usuario usuario) {
	
	try {
		conexao = DataBaseConnection.obterConexao();
		pstmt = conexao.prepareStatement("INSERT INTO T_USUARIO" + "(USUARIO_ID, NOME_USUARIO, VL_PESO, VL_ALTURA, VL_IMC, DT_REGISTRO)" + "VALUES (USUARIOID.NEXTVAL,?,?,?,?,?)");
		
		pstmt.setString(1, usuario.getNome());
		pstmt.setDouble(2, usuario.getPeso());
		pstmt.setDouble(3, usuario.getAltura());
		pstmt.setDouble(4, usuario.getImc());
		pstmt.setDate(5, new java.sql.Date(new java.util.Date().getTime()));
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


}
