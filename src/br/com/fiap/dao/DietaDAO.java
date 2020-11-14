package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.com.fiap.healthtrack.Dieta;


public class DietaDAO {
	
		private Connection conexao;
		PreparedStatement pstmt = null;
		
		public void gravar(Dieta dieta) {
		try {
			conexao = DataBaseConnection.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_DIETA" + "(DIETA_ID, NOME_ALIMENTO, QTD_GRAMAS, QTD_PORCOES, KCAL_ALIMENTO, QTD_PROTEINA, QTD_GORDURA, DT_DIETA, T_USUARIO_USUARIO_ID)" + "VALUES (DIETAID.NEXTVAL,?,?,?,?,?,?,?,111)");
			
			pstmt.setString(1, dieta.getAlimento());
			pstmt.setInt(2, dieta.getQuantidade());
			pstmt.setInt(3, dieta.getPorcoes());
			pstmt.setInt(4, dieta.getCaloriaAlimento());
			pstmt.setInt(5, dieta.getProteinaAlimento());
			pstmt.setInt(6, dieta.getGorduraGanhaDieta());
			pstmt.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
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
				pstmt = conexao.prepareStatement("SELECT * FROM T_DIETA ORDER BY DT_DIETA DESC");
				rs = pstmt.executeQuery();
				
				System.out.println("+==================================================================LISTA DE ALIMENTOS CONSUMIDOS===================================================================+");
				while (rs.next()) {
					
//					System.out.println("" +rs.getString("NOME_ALIMENTO") + " " +
//									   rs.getInt("QTD_GRAMAS")+"g" + " " +
//									   rs.getInt("QTD_PORCOES")+" Porções"+ " " +
//									   rs.getInt("KCAL_ALIMENTO")+"kcal"+ " " +
//									   rs.getInt("QTD_PROTEINA")+"g de Proteina"+ " " +
//									   rs.getInt("QTD_GORDURA")+"g de Gordura"+ " " +
//									   rs.getDate("DT_DIETA"));
					
					System.out.println("\nVocê consumiu " +rs.getInt("QTD_PORCOES")+" Porções de"+ " " +
							   rs.getString("NOME_ALIMENTO") + " com  total de " +
							   rs.getInt("QTD_GRAMAS")+"g" + "     Tabela Nutricional: " +
							   rs.getInt("KCAL_ALIMENTO")+"kcal, "+
							   rs.getInt("QTD_PROTEINA")+"g de Proteina, "+
							   rs.getInt("QTD_GORDURA")+"g de Gordura"+ "    Data do consumo: " +
							   rs.getDate("DT_DIETA"));
				}
				System.out.println("+==================================================================================================================================================================+\n");
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
	
//	public List<Dieta> getAll(){
//		List<Dieta> listaDieta = new ArrayList<Dieta>();
//		
//		//listaDieta.add( new Dieta(1, "Macarrão", 350, 2) );
//		//listaDieta.add( new Dieta(2, "Nhoque", 250, 1) );
//		//listaDieta.add( new Dieta(3, "Arroz", 100, 1) );
//		//listaDieta.add( new Dieta(4, "Pudim", 100, 3) );
//		//listaDieta.add( new Dieta(5, "Feijão", 50, 2) );
//		//listaDieta.add( new Dieta(6, "Sorvete",150, 2) );
//		
//		return listaDieta;
//	}
	
	
	


