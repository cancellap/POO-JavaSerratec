package br.com.serratec.entity;

import java.sql.Connection;

import br.com.serratec.connction.ConnectionFactory;

public class MainConnect {

	public static void main(String[] args) {
		Connection c = new ConnectionFactory().getConnection();
	}
}
