package com.example.android.criminalintent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.criminalintent.database.CrimeDbSchema.CrimeTable;

/**
 * Created by wangchao on 2017/6/27.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    //数据库不存在时调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeTable.NAME + "(" +
                    " _id integer primary key autoincrement, " +
                    CrimeTable.Cols.UUID + ", " +
                    CrimeTable.Cols.TITLE + ", " +
                    CrimeTable.Cols.DATE + ", " +
                    CrimeTable.Cols.SOLVED + ")"
        );
    }

    //数据库版本号不一致时调用
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
