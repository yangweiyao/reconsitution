package com.yangweiyao.reconsitution.produce.relevance;


import com.yangweiyao.reconsitution.produce.Movie;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 14:47
 * @Description
 **/
public abstract class AbstractPrice {

    public int getFrequentRenterPoints(int daysRented) {
        return (getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1 ? 2 : 1;
    }

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

}
