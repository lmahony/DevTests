package com.larrymahony.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.util.Log;

public class LarryStocks extends Activity {
	private static final String TAG = "Larry!";
	private static final String URL = "http://portal.pf.aol.com/jsonqpus/ws?service=symslist,futures&symbols=E:DJI:$INDU,E:NAI:$COMPX,E:CMI:$INX,E:BSS:%28TC10Y,E:ISE:UKX,E:FX1:N225,E:FX1:HSIX,E:FX1:EURUSD,E:FX1:USDJPY&t=1286278064528&iir=1&callback=jsonp1286887961397&_=1286887961532";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.Button01);
        button.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i(TAG, "Button01 Clicked");
				RestClient.connect("");
			}
        	
        });
    }
}