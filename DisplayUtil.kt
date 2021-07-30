package com.example.nothing.tool

import android.content.Context

/**
 *Created on 2021/7/30
 *@author Meaning Zhang
 */

class DisplayUtil() {

    companion object{

        fun dp2px(context: Context, dpValue: Float): Int {
            val scale = context.resources.displayMetrics.density;
            return (dpValue * scale + 0.5f).toInt();
        }

        fun px2dp(context: Context, pxValue: Float):Int {
            val scale = context.resources.displayMetrics.density;
            return (pxValue / scale + 0.5f).toInt();
        }

    }

}
