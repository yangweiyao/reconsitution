package com.yangweiyao.reconsitution.test;

import com.yangweiyao.reconsitution.consumer.Customer;
import com.yangweiyao.reconsitution.produce.Movie;
import com.yangweiyao.reconsitution.produce.relevance.Rental;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-21 11:00
 * @Description
 **/
public class CreateOrder {

    public static void main(String[] args) {
        Customer customer = new Customer("张三");
        customer.addRental(new Rental(new Movie("猪猪侠", Movie.CHILDRENS), 7));
        System.out.println(customer.statement());
    }

}
