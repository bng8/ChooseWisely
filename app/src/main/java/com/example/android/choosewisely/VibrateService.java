package com.example.android.choosewisely;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;
import android.support.annotation.Nullable;

/**
 * Created by ngbra on 12/10/2016.
 */
//vibrate method definition
public class VibrateService extends Service
{
    @Override
    public int onStartCommand(Intent intent, int flags, int startID)
    {
        //create vibrator and call device to vibrate for 500 ms
        super.onStartCommand(intent,flags,startID);
        Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);
        return flags;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
