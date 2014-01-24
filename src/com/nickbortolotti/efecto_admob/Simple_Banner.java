package com.nickbortolotti.efecto_admob;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.example.banner_example_admob.R;
import com.google.android.gms.ads.AdRequest; //imports para el banner
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import android.widget.LinearLayout;

public class Simple_Banner extends Activity {
	
	private AdView vista;
	
	private static final String adId = "ad_unit_id";  //Se debe colocar el id del banner a visualizar.

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banner);
		
		/* 
		 * Se genera la vista para visualizar el banner
		 * */
		vista = new AdView(this);
		vista.setAdSize(AdSize.BANNER);
		vista.setAdUnitId(adId);
		
		/*
		 * Se incorpora un linear layout para agregar la vista y poder visualizar el banner
		 */
		LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout);
	    layout.addView(vista);
	    
	    /*
	     * Se configura la solicitud del material del banner
	     */
	    AdRequest adSolicitud = new AdRequest.Builder()
        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        .build();
	    
	    /*
	     * Se carga finalmente la vista
	     */
	    vista.loadAd(adSolicitud);

	}
	
	  @Override
	  public void onResume() {
	    super.onResume();
	    if (vista != null) {
	      vista.resume();
	    }
	  }
	  
	  
	  @Override
	  public void onPause() {
	    if (vista != null) {
	      vista.pause();
	    }
	    super.onPause();
	  }

	  @Override
	  public void onDestroy() {
	    if (vista != null) {
	      vista.destroy();
	    }
	    super.onDestroy();
	  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.banner, menu);
		return true;
		
		
	}

}
