package cn.edu.gdmec.android.weatherdemo.mvp.model;

import cn.edu.gdmec.android.weatherdemo.mvp.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface ILoadListener {
    void onSuccess(WeatherBean weatherBean);
    void onFailure(Exception e);
}
