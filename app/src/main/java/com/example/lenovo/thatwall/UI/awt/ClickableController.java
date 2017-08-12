package com.example.lenovo.thatwall.UI.awt;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import cn.edu.nju.homemail.awt.awt.interfaces.Worker;

/**
 * Created by calabashboy on 2017/8/12.
 */

public class ClickableController extends View{
    private Worker worker;
    private boolean disabled;
    public ClickableController(Context context, Worker Tom){
        super(context);
        this.worker=Tom;
        disabled = false;
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!disabled){
                    worker.work();
                }
            }
        });
    }
    public Worker getWorker(){
        return worker;
    }
    public void disable(){
        disabled = true;
    }
    public void recover(){
        disabled = false;
    }

}
