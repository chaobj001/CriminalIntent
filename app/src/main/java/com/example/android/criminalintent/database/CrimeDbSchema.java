package com.example.android.criminalintent.database;

/**
 * Created by wangchao on 2017/6/27.
 */

public class CrimeDbSchema {
    // 定义描述数据表的内部类
    public static final class CrimeTable {

        // 表名
        public static final String NAME = "crimes";

        // 字段
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
