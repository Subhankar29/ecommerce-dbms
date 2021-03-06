package com.neu.dbms.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.neu.dbms.model.Category;
import com.neu.dbms.model.Product;

@Component
public interface EcommerceAppDao {

  public String getUser(String emailAddress, String password);
  
  public void registerUser(String emailAddress, String password, String address, int contact, String state);

  public List<Category> getCategories();
  
  public void addCart(int cartId, int productId, int quantity, int accountId);
  
  public List<Product> getProductsByCategory(int categoryId);
  
  public void insertOrders(String shippingAddress, int userid, String status);

  public void insertPaymentInfo(int orderId, String paymentInfo);

  public int insertOrderDetails(int orderid);
}
