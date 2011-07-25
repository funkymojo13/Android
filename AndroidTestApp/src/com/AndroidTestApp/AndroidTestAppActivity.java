package com.AndroidTestApp;

import com.AndroidTestApp.views.MainGamePanel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class AndroidTestAppActivity extends Activity {
	
	private static final String TAG = AndroidTestAppActivity.class.getSimpleName();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //requesting to turn the title OFF
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        //make it full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        //set our MainGamePanel as the View
        setContentView(new MainGamePanel(this));
    }
    
     @Override
    protected void onDestroy() {
    	Log.d(TAG, "Destroying...");
    	super.onDestroy();
    }
     
     @Override
    protected void onStop() {
    	 Log.d(TAG, "Stopping...");
    	super.onStop();
    }
}