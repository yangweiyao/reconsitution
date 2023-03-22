package com.yangweiyao.reconsitution.produce.relevance;

import com.yangweiyao.reconsitution.produce.Movie;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 14:48
 * @Description
 **/
public class ChildrenPrice extends AbstractPrice {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

}
