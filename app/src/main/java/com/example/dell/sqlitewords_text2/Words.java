package com.example.dell.sqlitewords_text2;

import android.provider.BaseColumns;

/**
 * Created by DELL on 2016/9/6.
 */
public class Words {
    public Words() {
    }

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME="words";
        public static final String COLUMN_NAME_WORD="word";//列：单词
        public static final String COLUMN_NAME_MEANING="meaning";//列：单词含义
        public static final String COLUMN_NAME_SAMPLE="sample";//单词示例
    }
}
