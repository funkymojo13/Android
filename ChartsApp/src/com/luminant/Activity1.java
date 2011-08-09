package com.luminant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		InfiniteScroll scroller = new InfiniteScroll(this);
		setContentView(scroller);
	}
}
