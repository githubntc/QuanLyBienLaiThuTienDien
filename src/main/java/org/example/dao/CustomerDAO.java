package org.example.dao;

import java.sql.SQLException;
import java.util.List;
import org.example.entities.Customer;

public interface CustomerDAO {
  public int create(Customer customer) throws SQLException;
  public List<Customer> retrieve();
  public int update(Customer customer) throws SQLException;
  public int delete(int customer_id) throws SQLException;
}
