package test;

public class Book {
	String name;
	Author author;
	double price;
	int qty = 0;
	public Book(String name, Author author, double price) {
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name, Author author, double price, int qty) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int newQty) {
		qty = newQty;
	}
}
