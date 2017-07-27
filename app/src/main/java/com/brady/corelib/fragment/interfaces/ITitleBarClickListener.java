package com.brady.corelib.fragment.interfaces;

import android.view.View;

/**
 * Created by Brady on 2016/5/30.
 * 用于项部栏的点击事件监听回调
 */
public interface ITitleBarClickListener {
    /**
     * 项部栏的点击事件监听回调
     * @param v
     */
    boolean onTitleBarClick(View v);

    /**
     * 标题栏   -  左边按钮触发事件
     * @param v
     */
    boolean onClickTitleLeft(View v);

    /**
     * 标题栏   -  右边按钮触发事件
     * @param v
     */
    boolean onClickTitleRight(View v) ;
}