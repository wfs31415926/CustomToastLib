package com.wufs.toastlib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wufs on 2018/12/17 0030.
 */
public class ToastUtils {

    private static Toast mToast;

    public static void showShortToast(Context context, String text) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void showShortCenterToast(Context context, String text) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

    public static void showLongCenterToast(Context context, String text) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

    public static void showShortToast(Context context, int resId) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void showLongToast(Context context, String text) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        mToast.show();
    }

    public static void showLongToast(Context context, int resId) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

    public static void showToastWithImg(Context context, String text, Drawable imgRes) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(14);
        textView.setTextColor(Color.WHITE);
        textView.setText(text);
        textView.setPadding(25, 74, 25, 86);
        imgRes.setBounds(0, 0, imgRes.getMinimumWidth(), imgRes.getMinimumHeight());
        textView.setCompoundDrawablePadding(40);
        textView.setCompoundDrawables(null, imgRes, null, null);
        textView.setBackground(context.getResources().getDrawable(R.drawable.shape_round_toast));
        mToast.setView(textView);
        mToast.show();
    }


}
