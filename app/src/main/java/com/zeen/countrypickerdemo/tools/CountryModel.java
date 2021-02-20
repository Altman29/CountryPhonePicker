package com.zeen.countrypickerdemo.tools;

import android.graphics.drawable.Drawable;

/**
 * Created by Csy on 2/20/21.
 * e-mail:altman29@foxmail.com
 * Desc:
 */
public class CountryModel {
    // 国家名称
    public String countryName;

    // 国家代码
    public String countryNumber;

    public String simpleCountryNumber;

    // 国家名称缩写
    public String countrySortKey;

    // 国家图标
    public Drawable contactPhoto;

    public CountryModel(String countryName, String countryNumber, String countrySortKey) {
        super();
        this.countryName = countryName;
        this.countryNumber = countryNumber;
        this.countrySortKey = countrySortKey;
        if (countryNumber != null) {
            this.simpleCountryNumber = countryNumber.replaceAll("\\-|\\s", "");
        }
    }

}

