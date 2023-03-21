package com.yangweiyao.reconsitution.produce;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 17:31
 * @Description 影片
 **/
public class Movie {

    /** 儿童片 */
    public static final int CHILDRENS = 2;
    /** 普通片 */
    public static final int REGULAR = 0;
    /** 新片 */
    public static final int NEW_RELEASE = 1;

    /**
     * 影片名称
     */
    private String title;
    /**
     * 影片价格
     */
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

}



