package com.zeen.countrypickerdemo.tools;

import java.util.Comparator;

/**
 * Created by Csy on 2/20/21.
 * e-mail:altman29@foxmail.com
 * Desc:
 */

public class CountryComparator implements Comparator<CountrySortModel> {

    @Override
    public int compare(CountrySortModel o1, CountrySortModel o2) {

        if (o1.sortLetters.equals("@") || o2.sortLetters.equals("#")) {
            return -1;
        } else if (o1.sortLetters.equals("#") || o2.sortLetters.equals("@")) {
            return 1;
        } else {
            return o1.sortLetters.compareTo(o2.sortLetters);
        }
    }

}
