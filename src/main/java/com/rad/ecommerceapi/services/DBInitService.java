package com.rad.ecommerceapi.services;

public interface DBInitService {
    public void initUsers();
    public void initOrders();
    public void initOrderItems();
    public void initShoppingcarts();
    public void initProducts();
    public void initCategories();
    public void initFavorites();
}
