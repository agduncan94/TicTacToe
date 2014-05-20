package org.andrew.ttt;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity implements OnClickListener{
	Button bt00,bt01,bt02,bt10,bt11,bt12,bt20,bt21,bt22,btReset; // Buttons for grid and reset
	TextView turnKeeper; // TextView which displays turn information and game information
	int[][] board = new int[3][3]; // 0 means neither, -1 = X, 1 = O
	int turn; // -1 = X, 1 = O
	int gameOver = 0; // 0 means game is not over, anything else means game over

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_screen);
		turn = -1; // Starts off as X's turn
		
		// Set all values of the board to 0 (neither X or O)
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < 3; k++){
				board[i][k] = 0;
			}
		}
		
		// Associate each button declared with a button in the game_screen.xml file
		bt00 = (Button)findViewById(R.id.bt00);
		bt01 = (Button)findViewById(R.id.bt01);
		bt02 = (Button)findViewById(R.id.bt02);

		bt10 = (Button)findViewById(R.id.bt10);
		bt11 = (Button)findViewById(R.id.bt11);
		bt12 = (Button)findViewById(R.id.bt12);

		bt20 = (Button)findViewById(R.id.bt20);
		bt21 = (Button)findViewById(R.id.bt21);
		bt22 = (Button)findViewById(R.id.bt22);
		
		btReset = (Button)findViewById(R.id.btReset);
		btReset.setOnClickListener(this);
		
		bt00.setOnClickListener(this);
		bt01.setOnClickListener(this);
		bt02.setOnClickListener(this);

		bt10.setOnClickListener(this);
		bt11.setOnClickListener(this);
		bt12.setOnClickListener(this);

		bt20.setOnClickListener(this);
		bt21.setOnClickListener(this);
		bt22.setOnClickListener(this);

		turnKeeper = (TextView)findViewById(R.id.tvTurn);
		turnKeeper.setText("Player X's Turn");
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.bt00:
			// If space clicked on grid is empty (0) and game is not over
			if (board[0][0] == 0 && gameOver == 0){
				board[0][0] = turn; // Set value of board to turn (either -1 or 1)
				if (turn == -1) { // X's turn?
					turnKeeper.setText("Player O's Turn");
					bt00.setText("X");
				} else { // O's turn?
					turnKeeper.setText("Player X's Turn");
					bt00.setText("O");
				}
				checkIfOver(); // Check if there is a winner (or draw)
				turn = turn * -1;

			}
			break;
		case R.id.bt01:
			if (board[0][1] == 0 && gameOver == 0){
				board[0][1] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt01.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt01.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt02:
			if (board[0][2] == 0 && gameOver == 0){
				board[0][2] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt02.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt02.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt10:
			if (board[1][0] == 0 && gameOver == 0){
				board[1][0] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt10.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt10.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt11:
			if (board[1][1] == 0 && gameOver == 0){
				board[1][1] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt11.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt11.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt12:
			if (board[1][2] == 0 && gameOver == 0){
				board[1][2] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt12.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt12.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt20:
			if (board[2][0] == 0 && gameOver == 0){
				board[2][0] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt20.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt20.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt21:
			if (board[2][1] == 0 && gameOver == 0){
				board[2][1] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt21.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt21.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.bt22:
			if (board[2][2] == 0 && gameOver == 0){
				board[2][2] = turn;
				if (turn == -1) {
					turnKeeper.setText("Player O's Turn");
					bt22.setText("X");
				} else {
					turnKeeper.setText("Player X's Turn");
					bt22.setText("O");
				}
				checkIfOver();
				turn = turn * -1;

			}
			break;
		case R.id.btReset:
			// Resets all values back to initial (same as onCreate)
			turnKeeper.setText("Player X's Turn");
			turn = -1;
			gameOver = 0;
			
			bt00.setText("");
			bt01.setText("");
			bt02.setText("");
			
			bt10.setText("");
			bt11.setText("");
			bt12.setText("");
			
			bt20.setText("");
			bt21.setText("");
			bt22.setText("");
			
			for(int i = 0; i < 3; i++){
				for(int k = 0; k < 3; k++){
					board[i][k] = 0;
				}
			}
			
		}

	}
	void checkIfOver(){
		// Checks to see if a winning move for X has been played
		if ((board[0][0] == -1 && board[1][0] == -1 && board[2][0] == -1) ||(board[0][2] == -1 && board[1][2] == -1 && board[2][2] == -1) ||
				(board[0][1] == -1 && board[1][1] == -1 && board[2][1] == -1) || (board[0][0] == -1 && board[0][1] == -1 && board[0][2] == -1) ||
				(board[1][0] == -1 && board[1][1] == -1 && board[1][2] == -1) || (board[2][0] == -1 && board[2][1] == -1 && board[2][2] == -1)
				|| (board[0][0] == -1 && board[1][1] == -1 && board[2][2] == -1) || (board[0][2] == -1 && board[1][1] == -1 && board[2][0] == -1)){
			turnKeeper.setText("Game Over! Player X Wins");
			gameOver = 1;
		}
		// Checks to see if a winning move for O has been played
		if ((board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) ||(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) ||
				(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) || (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) ||
				(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) || (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
				|| (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)){
			turnKeeper.setText("Game Over! Player O Wins");
			gameOver = 1;
		}
		// Checks to see if game is over and there is a draw
		if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 && 
				board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 &&
				board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0 && gameOver == 0) {
			turnKeeper.setText("Game Over! Draw");
			gameOver = 1;
		}
	}
}
