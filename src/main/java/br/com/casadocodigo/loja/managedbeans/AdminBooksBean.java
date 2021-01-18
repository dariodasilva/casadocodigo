package br.com.casadocodigo.loja.managedbeans;

import javax.enterprise.inject.Model;

import br.com.casadocodigo.loja.models.Book;

@Model
public class AdminBooksBean {
	
	private Book product = new Book();
	
	public void save(){
		System.out.println(product);
		}
	
	public Book getProduct() {
		product.getDescription();	
		return product;
		}
	
//	public void save(){
//		System.out.println("Precisamos salvar o livro!!");
//	}

}
