package com.phone.dao;

import java.util.List;
import java.util.Map;

import com.phone.pojo.Product_b_order;

public interface Product_b_orderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    int insert(Product_b_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    int insertSelective(Product_b_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    Product_b_order selectByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    int updateByPrimaryKeySelective(Product_b_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_b_order
     *
     * @mbggenerated Sun May 13 16:11:17 CST 2018
     */
    int updateByPrimaryKey(Product_b_order record);

    List<Product_b_order> qryOrder(Integer uid);
}