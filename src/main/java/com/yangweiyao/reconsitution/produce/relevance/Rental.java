package com.yangweiyao.reconsitution.produce.relevance;

import com.yangweiyao.reconsitution.produce.Movie;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 17:36
 * @Description 租赁
 **/
public class Rental {

    /**
     * 电影
     */
    private final Movie movie;
    /**
     * 租期（天）
     */
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
