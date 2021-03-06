package edu.drake.raygun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
		actionBar.hide();
		
		ImageButton start= (ImageButton)findViewById(R.id.imageButton1);
		ImageButton leader = (ImageButton)findViewById(R.id.imageButton2);
		
		start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 	
				Intent intent = new Intent(MainActivity.this, Level.class);
				startActivity(intent);
			}
		});
		
		leader.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 	
				Intent intent = new Intent(MainActivity.this, Leaderboard.class);
				startActivity(intent);
			}
		});
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
