package com.wxf.muchdownload;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class MainActivity extends Activity implements OnClickListener {

	private EditText et_url;
	private ProgressBar progressbar;
	private LinearLayout ll_progressbar;
	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.bt_download).setOnClickListener(this);
		et_url = (EditText) findViewById(R.id.et_url);
		progressbar = (ProgressBar) findViewById(R.id.progressbar);
		ll_progressbar = (LinearLayout) findViewById(R.id.ll_progressbar);
		
	}

	@Override
	public void onClick(View v) {
		String urlCount_str = et_url.getText().toString().trim();
		int urlCount = Integer.parseInt(urlCount_str);
		ll_progressbar.removeAllViews();
		for (int i = 0; i < urlCount; i++) {
			ProgressBar progressbar_layout = (ProgressBar) View.inflate(
					mContext, R.layout.progressbar_layout, null);
	 		ll_progressbar.addView(progressbar_layout);
		}
	}

}
