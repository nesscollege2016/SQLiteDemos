package ness.tomerbu.edu.sqlitedemos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 25/07/2016.
 */
public class TodosDBHelper extends SQLiteOpenHelper {

    public TodosDBHelper(Context context) {
        super(context, "TodosDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String c1 =
                "CREATE TABLE Todos(id INTEGER PRIMARY KEY" +
                        " AUTOINCREMENT," +
                " title TEXT NOT NULL," +
                " content TEXT)";
        db.execSQL(c1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //SaveToFireBase...
        String c1 = "DROP TABLE Todos";
        db.execSQL(c1);
        onCreate(db);
    }
}
