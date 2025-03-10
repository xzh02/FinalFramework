package com.define;

import com.define.enums.DBType;

public class AppConst {
	///数据库类型
	public final static DBType DbType = DBType.None;
	/** 是否使用REDIS做缓存*/
	public final static boolean USE_REDIS_CACHE = false;

    /** mysql url*/
	public final static String MYSQL_URL = "jdbc:mysql://localhost:3306/";
	/** mysql user*/
	public final static String MYSQL_USER = "root";
	/** mysql pass*/
	public final static String MYSQL_PASS = "111111";
	/** mysql database */
	public final static String MYSQL_DBNAME = "firdatabase";

	/** mongodb ip*/
	public final static String MONGO_IP = "localhost";
	/** mongodb port*/
	public final static int MONGO_PORT = 27017;
	/** mongodb datebase */
	public final static String MONGO_DBNAME = "firdatabase";

	/** redis ip*/
	public final static String REDIS_IP = "localhost";
	/** redis port*/
	public final static int REDIS_PORT = 6379;
    
    public final static String CONFIG_PATH = "";
	public final static String CITY_NAME = "city.xml";

	public final static String MsgTypeKey = "MsgType";
	public final static String ExtCmdName = "FirServer";
	public final static String ProtoNameKey = "ProtoName";
	public final static String ByteArrayKey = "ByteArray";
}
