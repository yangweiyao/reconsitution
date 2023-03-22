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
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

}
