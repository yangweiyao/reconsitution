package com.yangweiyao.reconsitution.produce.relevance;

import com.yangweiyao.reconsitution.produce.Movie;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 14:57
 * @Description
 **/
public class NewReleasePrice extends AbstractPrice {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
