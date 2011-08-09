package com.luminant;

import java.util.ArrayList;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class InfiniteScroll extends ScrollView {

	private ArrayList<String> dataItems = new ArrayList<String>();
	
	public InfiniteScroll(Context context) {
		super(context);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add(new String("Test1"));
		items.add(new String("Test2"));
		items.add(new String("Test3"));
		items.add(new String("Test4"));
		items.add(new String("Test5"));
		
		setDataItems(items);
	}

	public ArrayList<String> getDataItems() {
		return dataItems;
	}

	public void setDataItems(ArrayList<String> dataItems) {
		if(this.dataItems == null)
			this.dataItems = new ArrayList<String>();
		this.dataItems.addAll(dataItems);
		
		this.removeAllViews();
	
		LinearLayout mainLayout = new LinearLayout(this.getContext());
		mainLayout.setOrientation(LinearLayout.VERTICAL);
		if( this.dataItems != null ) {
			for( String s : dataItems ) {
				System.out.println(s);
				LinearLayout layout = createLinearLayout();
				mainLayout.addView(layout);
			}
		}
		
		this.addView(mainLayout);
	}

	private LinearLayout createLinearLayout() {
		LinearLayout layout = new LinearLayout(this.getContext());
		RelativeLayout dataPanel = createDataPanel();
		RelativeLayout graphPanel = createGraphPanel();
		
		layout.addView(dataPanel);
		layout.addView(graphPanel);
		
		return layout;
	}

	private RelativeLayout createDataPanel() {
		RelativeLayout dataPanel = new RelativeLayout(this.getContext());
		TextView textView = new TextView(this.getContext());
		textView.setLayoutParams(ViewGroup.LayoutParams.FILL_PARENT)
		textView.setText("Hello");
		
		dataPanel.addView(textView);
		
		return dataPanel;
	}
	
	private RelativeLayout createGraphPanel() {
		RelativeLayout graphPanel = new RelativeLayout(this.getContext());
		TextView textView = new TextView(this.getContext());
		textView.setText("World");
		
		graphPanel.addView(textView);
		
		return graphPanel;
	}
}