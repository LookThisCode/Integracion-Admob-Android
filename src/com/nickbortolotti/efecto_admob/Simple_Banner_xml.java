package com.nickbortolotti.efecto_admob;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Simple_Banner_xml extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple__banner_xml);
		
		
	    AdView vista = (AdView)this.findViewById(R.id.adView);
	    AdRequest solicitud = new AdRequest.Builder().build();
	    vista.loadAd(solicitud);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.simple__banner_xml, menu);
		return true;
	}

}
