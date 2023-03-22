package com.yangweiyao.reconsitution.produce.relevance;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 14:59
 * @Description
 **/
public class RegularPrice extends AbstractPrice {

    @Override
    public int getPriceCode() {
        return 0;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }


}
