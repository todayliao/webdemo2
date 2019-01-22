package org.smart.chapter.service;

import org.slf4j.LoggerFactory;
import org.smart.chapter.helper.DatabaseHelper;
import org.smart.chapter.model.Customer;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * webdemo2
 *
 * @author todayliao
 * @date 2019/1/17
 **/
public class CustomerService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerList() {

        Connection conn = DatabaseHelper.getConnection();
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);

    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
