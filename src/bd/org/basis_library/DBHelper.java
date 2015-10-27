package bd.org.basis_library;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME ="library";
    public static final int VERSION=1;
    
    public static final String TABLE_NAME="books";
    public static final String ID_FIELD="_id";
    public static final String TITLE="title";
    public static final String AUTHOR="author";
    public static final String CATEGORY="category";
    public static final String ISBN="isbn";
    public static final String PRICE="price";
    
    public static final String TABLE_SQL = " CREATE TABLE " + TABLE_NAME + " ("
    		+ ID_FIELD + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TITLE
    		+ " TEXT, " + AUTHOR + " TEXT, " + CATEGORY + " TEXT, " + ISBN 
    		+ " TEXT, " + PRICE + " NUMBER)";
        
	public DBHelper(Context context) {
		super(context, DB_NAME, null, VERSION);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
           Log.d("TABLE SQL", TABLE_SQL);
           db.execSQL(TABLE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


	}

}
