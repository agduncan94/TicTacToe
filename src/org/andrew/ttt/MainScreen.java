package org.andrew.ttt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainScreen extends Activity implements OnClickListener{
	Button startGame, aboutGame;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		
		startGame = (Button)findViewById(R.id.bStart);
		aboutGame = (Button)findViewById(R.id.bAbout);
		
		startGame.setOnClickListener(this);
		aboutGame.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.bStart:
			Intent startGame = new Intent(MainScreen.this, Game.class);
			startActivity(startGame);
			break;
		case R.id.bAbout:
			Intent about = new Intent(MainScreen.this, About.class);
			startActivity(about);
			break;

		}

	}
}
