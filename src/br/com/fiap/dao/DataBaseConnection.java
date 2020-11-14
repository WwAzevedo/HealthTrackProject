package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86357", "230997");
			
			System.out.println("Sucesso!");
			
//			conexao.close();
			
		} catch (SQLException e ) {
			System.out.println("Erro ao conectar ao banco de dados!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Oracle não encontrado!");
			e.printStackTrace();
		}
		return conexao;
	}

}
