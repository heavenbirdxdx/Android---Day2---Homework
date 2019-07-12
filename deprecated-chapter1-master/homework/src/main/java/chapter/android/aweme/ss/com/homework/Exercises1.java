package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 进入Exercises1
 * onCreate() called
 * onStart() called
 * onResume() called
 * 旋转屏幕
 * onPause() called
 * onStop() called
 * onDestroy() called
 * onCreate() called
 * onStart() called
 * onResume() called
 * 转回来
 * onPause() called
 * onStop() called
 * onDestroy() called
 * onCreate() called
 * onStart() called
 * onResume() called
 * 退出Exercises1
 * onPause() called
 * onStop() called
 * onDestroy() called
 */
public class Exercises1 extends AppCompatActivity {

    private static String TAG="Exercises1";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() called");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}
