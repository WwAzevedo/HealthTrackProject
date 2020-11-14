package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.com.fiap.healthtrack.Exercicio;

public class ExercicioDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void gravar(Exercicio exercicio) {
	
	try {
		conexao = DataBaseConnection.obterConexao();
		pstmt = conexao.prepareStatement("INSERT INTO T_EXERCICIO " + "(EXERCICIO_ID, NOME_EXERCICIO, QTD_SERIE, QTD_REPETICOES, QTD_MASSA_GANHA, KCAL_PERDIDA, QTD_GORDURA_PERDIDA, DT_EXERCICIO, T_USUARIO_USUARIO_ID)" + "VALUES (EXERCICIOID.NEXTVAL,?,?,?,?,?,?,?,111)");
		
		pstmt.setString(1, exercicio.getNomeExercicio());
		pstmt.setInt(2, exercicio.getSerie());
		pstmt.setInt(3, exercicio.getRepeticao());
		pstmt.setInt(4, exercicio.getMassaExercicio());
		pstmt.setInt(5, exercicio.getCaloriaExercicio());
		pstmt.setInt(6, exercicio.getGorduraExercicio());
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
			pstmt = conexao.prepareStatement("SELECT * FROM T_EXERCICIO ORDER BY DT_EXERCICIO DESC");
			rs = pstmt.executeQuery();
			
			System.out.println("+==================================================================LISTA DE EXERCICIOS=======================================================================================================+");
			while (rs.next()) {
				
				System.out.println("\nVocê fez " +rs.getInt("QTD_SERIE")+" séries de " +
						   rs.getString("NOME_EXERCICIO")+" com "+
						   rs.getInt("QTD_REPETICOES")+" Repetições em cada série! "+
						   "        +"+rs.getInt("QTD_MASSA_GANHA")+" Gramas de massa magra, "+
						   rs.getInt("KCAL_PERDIDA")+" Calorias perdidas, "+
						   rs.getInt("QTD_GORDURA_PERDIDA")+" Gramas de gordura perdida "+ "       Data do exercicio: " +
						   rs.getDate("DT_EXERCICIO"));
				
			}
			System.out.println("+=========================================================================================================================================================================================+\n");
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


//public List<Exercicio> getAll(){
		//List<Exercicio> listaExercicio = new ArrayList<Exercicio>();
		
		//listaExercicio.add( new Exercicio(1, "Abdominais", 10, 5) );
		//listaExercicio.add( new Exercicio(2, "Flexão de Braço", 12, 5) );
		//listaExercicio.add( new Exercicio(3, "Agachamento", 10, 3) );
		//listaExercicio.add( new Exercicio(4, "Remada Alta", 8, 3) );
		//listaExercicio.add( new Exercicio(5, "Pull Back", 12, 3) );
		//listaExercicio.add( new Exercicio(6, "Supino", 8, 3) );
		
		//return listaExercicio;
	//}