package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JFrame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
		JFrame ticTacToe = new TicTacToe();
		ticTacToe.setTitle("Phantom TicTacToe Game!");
		ticTacToe.setSize(600, 600);
		ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ticTacToe.setLocationRelativeTo(null);
		ticTacToe.setVisible(true);
	}

}
