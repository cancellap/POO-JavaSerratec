package br.com.serratec.connction;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String url = "jdbc:postgresql://localhost:5432/curso";
	String usuario = "postgres";
	String senha = "1234";
	
	private Connection conexao;

	public Connection getConnection() {
		System.out.println("indo");
		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
			if (conexao != null) {
				System.out.println("fooi");
			}else {
				System.out.println("nao foi!");
			}
			
		} catch (SQLException e) {
			System.err.println("nem tentei");
		}
		return conexao;
	}
	
	
}
