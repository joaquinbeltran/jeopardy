package com.hackathong.buzzer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button buzzer, team1, team2, team3, team4;
	String teamNumber = "1";
	TextView tvTeam;
	private WebView webView;

	private Vibrator myVib;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
		setContentView(R.layout.activity_main);
		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		tvTeam = (TextView) findViewById(R.id.tvTeam);
		buzzer = (Button) findViewById(R.id.bBuz);
		team1 = (Button) findViewById(R.id.bBuzz1);
		team2 = (Button) findViewById(R.id.bBuzz2);
		team3 = (Button) findViewById(R.id.bBuzz3);
		team4 = (Button) findViewById(R.id.bBuzz4);
		buzzer.setOnClickListener(this);
		team1.setOnClickListener(this);
		team2.setOnClickListener(this);
		team3.setOnClickListener(this);
		team4.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.bBuz:
			myVib.vibrate(250);
			webView.loadUrl("http://198.101.247.187/code/post_receive.php?id="
					+ teamNumber);
			break;
		case R.id.bBuzz1:
			teamNumber = "1";
			myVib.vibrate(50);
			tvTeam.setText("Team: " + teamNumber);
			break;
		case R.id.bBuzz2:
			teamNumber = "2";
			myVib.vibrate(50);
			tvTeam.setText("Team: " + teamNumber);
			break;
		case R.id.bBuzz3:
			teamNumber = "3";
			myVib.vibrate(50);
			tvTeam.setText("Team: " + teamNumber);
			break;
		case R.id.bBuzz4:
			teamNumber = "4";
			myVib.vibrate(50);
			tvTeam.setText("Team: " + teamNumber);
			break;
		}

	}

}
