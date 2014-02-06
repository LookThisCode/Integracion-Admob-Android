package com.nickbortolotti.efecto_admob;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Manejando la seleccion de menu
	    switch (item.getItemId()) {
	        case R.id.item1:
	        	lanzarSimpleBanner();
	            return true;
	        case R.id.item2:
	        	lanzarSimpleBannerXml();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	 /*
	  * MŽtodo que realiza el lanzamiento de otra activity BAnner
	  * */
	  public void lanzarSimpleBanner() {
	        Intent i = new Intent(this, Simple_Banner.class);
	        startActivity(i);
	  } 
	  
	  /*
		  * MŽtodo que realiza el lanzamiento de otra activity BannerXML 
		  * */
		  public void lanzarSimpleBannerXml() {
		        Intent i = new Intent(this, Simple_Banner_xml.class);
		        startActivity(i);
		  } 
    
}
