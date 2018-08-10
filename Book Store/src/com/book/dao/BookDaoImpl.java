package com.book.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.book.pojo.Book;
import com.book.pojo.Cart;

public class BookDaoImpl implements BookDao{

private static Map<Integer, Book> bookDB = new HashMap<>();
	
	private static Map<Integer, Cart> cart = new HashMap<>();

	private static Book bookOne = new Book(101,"Head First Java",800,"Jeans Kelly","Good Book. Great to read. Easy to understand.");
	private static Book bookTwo = new Book(102,"DataBase Management System",800,"Navathe","Clearly written concepts with a lucid flow.");
	private static Book bookThree = new Book(103,"Computer Netwroks",500,"Andrew S. Tanenbaum","Easy concept. Lucid Language. Imparts good concept.");
	private static Book bookFour = new Book(104,"Java-The Complete Reference",500,"Herbert Schildt","As an introductory book it is good to read. Easy concepts");
	
	static {
		bookDB.put(bookOne.getId(), bookOne);
		bookDB.put(bookTwo.getId(), bookTwo);
		bookDB.put(bookThree.getId(), bookThree);
		bookDB.put(bookFour.getId(), bookFour);
	}
	
	@Override
	public Collection<Book> viewAllBooks(){
		return bookDB.values();
	}
	
	@Override
	public void addBookCart(int id) {
		//System.out.println("sservice "+id);
		
		if(cart.get(id)==null)
		{
			for(Book book : viewAllBooks())
			{
				if(book.getId()==id)
				{
					Cart crt = new Cart(1,book);
					price=price+book.getPrice();
					book.setPrice(price);
					cart.put(id,crt);
				}
			}
		}
		else
		{
			Cart crt = cart.get(id);
			price=price+(crt.getBook().getPrice());
			crt.getBook().setPrice(price);
			crt.setQuantity(crt.getQuantity()+1);
		}
	}
	

	@Override
	public Collection<Cart> viewcart(){
		return cart.values();
	}
	
	
	@Override
	public void delFrmCart(int id) {
		for(Cart cartV : viewcart())
		{
			if(cartV.getBook().getId()==id)
			{
				if(cartV.getQuantity()>1)
				{	cartV.setQuantity(cartV.getQuantity()-1);
					break;
				}
				else
				{	
					cart.remove(id);
					break;
				}
			}
		}
	}
	
	public double TotalPrice(int id) {
		double price=0;

		if(cart.get(id)==null)
		{
			for(Book book : viewAllBooks())
			{
				if(book.getId()==id)
				{
				cart.get(book.getPrice());
					price=price+book.getPrice();
					book.setPrice(price);
					cart.put(id,);
				}
			}
		}
		else
		{
			Cart crt = cart.get(id);
			price=price+(crt.getBook().getPrice());
			crt.getBook().setPrice(price);
			crt.setQuantity(crt.getQuantity()+1);
		}
		
		
	}

}
