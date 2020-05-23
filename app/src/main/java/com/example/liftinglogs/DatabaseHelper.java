package com.example.liftinglogs;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "LiftingLogs.db";

    public static final String LOGS_TBL = "lifting_logs_table";//stores logs data
    public static final String PROFILES_TBL = "profiles_table";//stores profile data

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String SQLText;
        SQLText = "CREATE TABLE " + LOGS_TBL + " (PROFILENAME TEXT, LOGDATE TEXT, SPLITLABEL TEXT, EXERCISENAME TEXT, ROWNUMBER INTEGER," +
                " REPS1 INTEGER, WEIGHT1 INTEGER, REPS2 INTEGER, WEIGHT2 INTEGER, REPS3 INTEGER," +
                " WEIGHT3 INTEGER, REPS4 INTEGER, WEIGHT4 INTEGER, REPS5 INTEGER, WEIGHT5 INTEGER)";
        db.execSQL(SQLText);
    }

    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("DROP IF TABLE EXISTS " + LOGS_TBL);
        onCreate(db);
    }

    public boolean insertData_liftingLogs_table(String profileName, String logDate, String splitLbl, String exerciseName,
                                          int rowNumber, int reps1, int weight1, int reps2, int weight2,
                                                int reps3, int weight3, int reps4, int weight4,
                                                int reps5, int weight5)
    {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cvs = new ContentValues();
        cvs.put("PROFILENAME", profileName);
        cvs.put("LOGDATE",logDate);
        cvs.put("SPLITLABEL", splitLbl);
        cvs.put("EXERCISENAME",exerciseName);
        cvs.put("ROWNUMBER", rowNumber);
        cvs.put("REPS1", reps1);
        cvs.put("WEIGHT1", weight1);
        cvs.put("REPS2", reps1);
        cvs.put("WEIGHT2", weight1);
        cvs.put("REPS3", reps1);
        cvs.put("WEIGHT3", weight1);
        cvs.put("REPS4", reps1);
        cvs.put("WEIGHT4", weight1);
        cvs.put("REPS5", reps1);
        cvs.put("WEIGHT5", weight1);

        result = db.insert(LOGS_TBL,null,cvs);

        if (result == -1)
            return false;
        else
            return true;
    }

    public int updateData_liftingLogs_table(String profileName, String logDate, String splitLbl, String exerciseName,
                                      int rowNumber, int reps1, int weight1, int reps2, int weight2,
                                      int reps3, int weight3, int reps4, int weight4,
                                      int reps5, int weight5)
    {
        int count;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cvs = new ContentValues();
        cvs.put("PROFILENAME", profileName);
        cvs.put("LOGDATE",logDate);
        cvs.put("SPLITLABEL", splitLbl);
        cvs.put("EXERCISENAME",exerciseName);
        cvs.put("ROWNUMBER", rowNumber);
        cvs.put("REPS1", reps1);
        cvs.put("WEIGHT1", weight1);
        cvs.put("REPS2", reps2);
        cvs.put("WEIGHT2", weight2);
        cvs.put("REPS3", reps3);
        cvs.put("WEIGHT3", weight3);
        cvs.put("REPS4", reps4);
        cvs.put("WEIGHT4", weight4);
        cvs.put("REPS5", reps5);
        cvs.put("WEIGHT5", weight5);

        String rowN = String.valueOf(rowNumber);

        //THIS PART WILL NEED FIGURED OUT.  WILL NEED TO SELECT BY PROFILENAME, LOGDATE, AND ROWNUMBER
        //THEN UPDATE THE EXERCISENAME AND REPS AND WEIGHT FOR THAT RECORD IN SQLITE DB
        String whereStatement = "PROFILENAME = ? AND LOGDATE = ? AND SPLITLABEL = ? AND ROWNUMBER = ?";
        String[] selectionArgs = { profileName, logDate, splitLbl, rowN };//these should correspond to the ?'s in the above row
        count = db.update(LOGS_TBL, cvs, whereStatement, selectionArgs);
        return count;
    }

    public int deleteData_liftingLogs_table(String profileName, String logDate, String splitLbl,
                                      int rowNumber)
    {
        int count;
        String rowN = String.valueOf(rowNumber);
        SQLiteDatabase db = this.getWritableDatabase();
        String whereStatement = "PROFILENAME = ? AND LOGDATE = ? AND SPLITLABEL = ? AND ROWNUMBER = ?";
        String[] selectionArgs = { profileName, logDate, splitLbl, rowN };
        count = db.delete(LOGS_TBL,whereStatement,selectionArgs);
        return count;
    }

    public Cursor selectData_liftingLogs_table(String profileName, String logDate, String splitLbl,
                                               int rowNumber)
    {
        Cursor result;
        String rowN = String.valueOf(rowNumber);
        SQLiteDatabase db = this.getWritableDatabase();
        String[] columns = {"PROFILENAME", "LOGDATE", "SPLITLABEL", "EXERCISENAME", "ROWNUMBER",
                "REPS1", "WEIGHT1", "REPS2", "WEIGHT2", "REPS3", "WEIGHT3", "REPS4", "WEIGHT4",
                "REPS5", "WEIGHT5"};//columns to select and return
        String whereStatement = "PROFILENAME = ? AND LOGDATE = ? AND SPLITLABEL = ? AND ROWNUMBER = ?";
        String[] selectionArgs = { profileName, logDate, splitLbl, rowN };

        result = db.query(LOGS_TBL,columns,whereStatement,
                selectionArgs,null,null,null);

        result.moveToFirst();
        return result;
    }
}
//WILL MAKE OPTION FOR 3 SPLITS PER DAY A, B, AND C