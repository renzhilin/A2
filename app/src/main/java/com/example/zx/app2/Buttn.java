package com.example.zx.app2;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;

public class Buttn extends AppCompatButton {
    public Buttn(Context context , AttributeSet set){
        super(context , set);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.v("-crazyit.org-" , "the onKeyDown in MyButton");
        //返回true，表明该事件不会向外扩散
        return true;
    }
}
