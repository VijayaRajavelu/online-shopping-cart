package com.ecom.service;

import java.util.List;

import com.ecom.model.Cart;

public interface CartService {
	
	public Cart saveCart(Integer productId, Integer uerId);
	
	public List<Cart> getCartsByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void UpdateQuantity(String sy, Integer cid);

}
