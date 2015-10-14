/**
 * @(#) SpUtils 2015/7/8
 * <p>
 * Copyright (c), 2009 深圳孔方兄金融信息服务有限公司（Shenzhen kfxiong
 * Financial Information Service Co. Ltd.）
 * <p>
 * 著作权人保留一切权利，任何使用需经授权。
 */
package com.sye.gesturelockview;

import android.content.Context;
import android.content.SharedPreferences;

public class SpUtils {

    private static String SpBanner = "banner.sp";
    private static SharedPreferences mSharedPreferences;

    public static void clear(Context context) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().clear();
        mSharedPreferences.edit().commit();

    }

    public static boolean getBoolean(Context context, String key, boolean defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getBoolean(key, defValue);
    }

    public static void putBoolean(Context context, String key, boolean value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putBoolean(key, value).commit();
    }

    public static void putString(Context context, String key, String value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putString(key, value).commit();
    }

    public static String getString(Context context, String key, String defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getString(key, defValue);
    }

    public static void putInt(Context context, String key, int value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putInt(key, value).commit();
    }

    public static int getInt(Context context, String key, int defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getInt(key, defValue);
    }

    public static void putFloat(Context context, String key, float value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putFloat(key, value).commit();
    }

    public static float getFloat(Context context, String key, float defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SpBanner, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getFloat(key, defValue);
    }


}
