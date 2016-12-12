package com.example.android.choosewisely.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.choosewisely.data.ScoreContract.ScoreEntry;
/**
 * Created by ngbra on 12/12/2016.
 */

public class ScoreDBHelper extends SQLiteOpenHelper{

    //database name
    private static final String DATABASE_NAME = "scores.db";

    //database version
    private static final int DATABASE_VERSION = 1;

    public ScoreDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_SCORES_TABLE = "CREATE TABLE " + ScoreEntry.TABLE_NAME + "("
                + ScoreEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ScoreEntry.COLUMN_SCORE_VALUE + " INTEGER NOT NULL);";

        db.execSQL(SQL_CREATE_SCORES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
