package app.buusk.sqllite_597;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	SQLiteDatabase db;
	private Button btninsert;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		controll597DB control597db = new controll597DB(this);
		control597db.getWritableDatabase();
		
		btninsert = (Button) findViewById(R.id.btn_insert);
		btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent k = new Intent(getApplicationContext(),AddActivity.class);
				startActivity(k);
				
			}
		});
		
	}

}
