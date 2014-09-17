package app.buusk.sqllite_597;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class controll597DB extends SQLiteOpenHelper {
	
		private static final String DATABASE_NAME = "mydata316";
		private static final String TABLE_MEMBER = "members";
		private static final int DATABASE_VERSION = 1;
		

	public controll597DB(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + TABLE_MEMBER 
				+ "(MemberId INTEGER PRIMARY KEY AUTOINCREMENT," 
				+ "Name TEXT(100)," 
				+ "Age TEXT(100)," 
				+ "Blood TEXT(100),"
				+ "Country TEXT(100)," 
				+ "Birthday TEXT(100)," 
				+ "Nationality TEXT(100));");
		Log.d("CREATE TABLE", "Create Tables Successfully"); 
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
		onCreate(db);
		// TODO Auto-generated method stub
	}
		
	public long InsertData(String strName, String strAge, String strBlood, String strCountry, String strBirthday, String strNationality) {
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("Name", strName);
			values.put("Age", strAge);
			values.put("Blood", strBlood);
			values.put("Country", strCountry);
			values.put("Birthday", strBirthday);
			values.put("Nationality", strNationality);
			long l = db.insert(TABLE_MEMBER, null, values);
			db.close();
			return l;
		} catch (Exception c){
			return -1;
		}
		
		
	}

}
