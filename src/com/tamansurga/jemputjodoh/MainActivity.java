package com.tamansurga.jemputjodoh;


import uk.co.senab.photoview.PhotoViewAttacher;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
Button btnT,btnS,btnC,btnPen;

ImageView mImageView;
PhotoViewAttacher mAttacher;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	    
		btnT=(Button) findViewById(R.id.btnT);
		btnS=(Button) findViewById(R.id.btnS);
		btnC=(Button) findViewById(R.id.btnC);
		btnPen=(Button) findViewById(R.id.btnPen);
		
		
		btnT.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(MainActivity.this,TaarufActivity.class);
				startActivity(intent);
			}
		});
		btnPen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(MainActivity.this,PengelolaActivity.class);
				startActivity(intent);
			}
		});
		
		
		btnS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(MainActivity.this,SyaratActivity.class);
				startActivity(intent);
			}
		});
		
			btnC.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(MainActivity.this,CaraActivity.class);
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
