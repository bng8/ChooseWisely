package com.example.android.choosewisely.data;

import android.provider.BaseColumns;

/**
 * Created by ngbra on 12/12/2016.
 */

public final class ScoreContract {
    private ScoreContract() {}

    public static final class ScoreEntry implements BaseColumns{

        public final static String TABLE_NAME = "scores";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_SCORE_VALUE = "value";
    }
}
