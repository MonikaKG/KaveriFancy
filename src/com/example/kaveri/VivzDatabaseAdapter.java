package com.example.kaveri;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VivzDatabaseAdapter
{
	VivzHelper helper;
	public VivzDatabaseAdapter(Context context)
	{
		helper=new VivzHelper(context);
	}
	public long insertdata(String name,String email,String password,String phoneno,String address)
	{
		SQLiteDatabase db = helper.getWritableDatabase();
		ContentValues contentvalues=new ContentValues();
		contentvalues.put(VivzHelper.NAME,name);
		contentvalues.put(VivzHelper.EMAIL,email);
		contentvalues.put(VivzHelper.PASSWORD,password);
		contentvalues.put(VivzHelper.PHONENO,phoneno);
		contentvalues.put(VivzHelper.ADDRESS,address);
		long id=db.insert(VivzHelper.TABLE_NAME,null,contentvalues);
		return id;		
	}
	public String getData(String name,String password)
	{
		SQLiteDatabase db=helper.getWritableDatabase();
		String[] columns={VivzHelper.NAME,VivzHelper.EMAIL,VivzHelper.PHONENO,VivzHelper.ADDRESS};
		Cursor cursor= db.query(VivzHelper.TABLE_NAME,columns,VivzHelper.NAME+" = '"+name+"' AND "+VivzHelper.PASSWORD+" = '"+password+"'",null,null,null,null);
		StringBuffer buffer=new StringBuffer();
		while(cursor.moveToNext())
		{
			int index1=cursor.getColumnIndex(VivzHelper.NAME);
			int index2=cursor.getColumnIndex(VivzHelper.EMAIL);
			int index3=cursor.getColumnIndex(VivzHelper.PHONENO);
			int index4=cursor.getColumnIndex(VivzHelper.ADDRESS);
			String uname=cursor.getString(index1);
			String email=cursor.getString(index2);
			String phoneno=cursor.getString(index3);
			String address=cursor.getString(index4);
			buffer.append(uname+":"+email+":"+phoneno+":"+address+"\n");
		}		
		return buffer.toString();
	}
	public int updatequery(String email,String password)
	{
		SQLiteDatabase db=helper.getWritableDatabase();
		ContentValues contentvalues=new ContentValues();
		contentvalues.put(VivzHelper.PASSWORD,password);
		String whereClause = "email=?";
	    String[] whereArgs={email};
		int res=db.update(VivzHelper.TABLE_NAME,contentvalues,whereClause, whereArgs);
		return res;		
	}
	public int deletequery(String name,String password)
	{
		SQLiteDatabase db=helper.getWritableDatabase();
		String[] whereArgs={name,password};
		String whereClause="name=? AND password=?";
		int res=db.delete(VivzHelper.TABLE_NAME,whereClause, whereArgs);
		return res;		
	}
	static class VivzHelper extends SQLiteOpenHelper
	{
		public static final String DATABASE_NAME="cauveryfancy1";
		public static final String TABLE_NAME="signuptable1";
		public static final int DATABASE_VERSION=1;
		public static final String NAME="name";
		public static final String EMAIL="email";
		public static final String PASSWORD="password";
		public static final String PHONENO="phoneno";
		public static final String ADDRESS="address";
		public static final String CREATE_QUERY="CREATE TABLE "+TABLE_NAME+"(uid INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" varchar(30),"+EMAIL+" varchar(40),"+PASSWORD+" varchar(25),"+PHONENO+" varchar(10),"+ADDRESS+" varchar(255))";
		public static final String DROP_QUERY="DROP TABLE "+TABLE_NAME+" IF EXISTS";
		private Context context;
		public VivzHelper(Context context)
		{
			super(context,DATABASE_NAME,null,DATABASE_VERSION);
			this.context=context;
			//Message.message(context,"Constructor Called");
		}
		@Override
		public void onCreate(SQLiteDatabase db) 
		{
			try
			{
				db.execSQL(CREATE_QUERY);		
				//Message.message(context,"onCreate Called");
			}
			catch(Exception e)
			{
				//Message.message(context,""+e);
			}
		}
		@Override
		public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) 
		{
			try
			{
				//Message.message(context,"onUpgrade Called");
				db.execSQL(DROP_QUERY);
				onCreate(db);			
			}
			catch(Exception e)
			{
				//Message.message(context,""+e);
			}
		}
	}
}
