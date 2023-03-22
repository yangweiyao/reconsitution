package com.yangweiyao.reconsitution.produce;

import com.yangweiyao.reconsitution.produce.relevance.AbstractPrice;
import com.yangweiyao.reconsitution.produce.relevance.ChildrenPrice;
import com.yangweiyao.reconsitution.produce.relevance.NewReleasePrice;
import com.yangweiyao.reconsitution.produce.relevance.RegularPrice;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 17:31
 * @Description 影片
 **/
public class Movie {

    /** 儿童片 */
    public static final int CHILDREN = 2;
    /** 普通片 */
    public static final int REGULAR = 0;
    /** 新片 */
    public static final int NEW_RELEASE = 1;

    /** 影片名称 */
    private final String title;

    /** 影片价格 */
    private AbstractPrice price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }


}



