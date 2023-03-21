package com.yangweiyao.reconsitution.consumer;


import com.yangweiyao.reconsitution.produce.Movie;
import com.yangweiyao.reconsitution.produce.relevance.Rental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-20 17:38
 * @Description 顾客
 **/
public class Customer {

    private final String name;
    private final Vector<Rental> vectors;

    public Customer (String name) {
        this.name = name;
        vectors = new Vector<>();
    }


    public void addRental(Rental rental) {
        vectors.addElement(rental);
    }

    /**
     * 计算顾客的消费金额（还要为常客计算积分）并打印详单
     * @return 详单内容
     */
    public String statement() {

        Enumeration<Rental> rentals = vectors.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasMoreElements()){
            Rental each = rentals.nextElement();
            // show figures for this rental
            result.append("\t").append(each.getMovie().getTitle())
                    .append("\t").append(each.getCharge()).append("\n");
        }

        // add footer lines
        result.append("Amount owed is ").append((getTotalCharge())).append("\n");
        result.append("You earned ").append((getTotalFrequentRenterPoints())).append(" frequent renter points");

        return result.toString();
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> rentals = vectors.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // add bonus for a two day new release rental
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = vectors.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public Vector<?> getVectors() {
        return vectors;
    }
}
