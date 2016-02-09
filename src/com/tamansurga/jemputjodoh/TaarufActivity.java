package com.tamansurga.jemputjodoh;


import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class TaarufActivity extends Activity implements AnimationListener{

ImageView imgPoster;
Animation animZoomIn;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taaruf);
	
		 //imgPoster = (ImageView) findViewById(R.id.imageView2);
		//imgPoster.setOnClickListener(new View.OnClickListener() {
			
			//@Override
		//	public void onClick(View v) {
				// TODO Auto-generated method stub
				// load the animation
			//    animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);

			    // set animation listener
			   // animZoomIn.setAnimationListener(this);
			   // imgPoster.startAnimation(animZoomIn);
			    
			//}
		//});
		  

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.taaruf, menu);
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


	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
}
