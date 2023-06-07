package org.example.dao;

import java.sql.SQLException;
import java.util.List;
import org.example.entities.Receipt;

public interface ReceiptDAO {
  public int create(Receipt receipt) throws SQLException;
  public List<Receipt> retrieve();
  public int update(Receipt receipt) throws SQLException;
  public int delete(int receipt_id) throws SQLException;
}
