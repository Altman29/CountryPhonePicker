package com.zeen.countrypickerdemo.tools;

/**
 * Created by Csy on 2/20/21.
 * e-mail:altman29@foxmail.com
 * Desc:
 */
public class CountrySortModel extends CountryModel {
    // 显示数据拼音的首字母
    public String sortLetters;

    public CountrySortToken sortToken = new CountrySortToken();

    public CountrySortModel(String name, String number, String countrySortKey) {
        super(name, number, countrySortKey);
    }

}
