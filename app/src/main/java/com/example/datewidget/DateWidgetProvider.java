package com.example.datewidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

/**
 * 1x1 日期小工具。
 * 日期由版面中的 TextClock 顯示,系統會在跨日時自動更新,
 * 因此這裡只需要把版面設定給每一個小工具實例。
 */
public class DateWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        for (int id : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_date);
            manager.updateAppWidget(id, views);
        }
    }
}
