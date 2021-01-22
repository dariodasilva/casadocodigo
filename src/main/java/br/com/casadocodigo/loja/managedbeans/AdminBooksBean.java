package br.com.casadocodigo.loja.managedbeans;

import javax.enterprise.inject.Model;

import br.com.casadocodigo.loja.models.Book;

@Model
public class AdminBooksBean {
	
	private Book product = new Book();
	
	@Inject
	private BookDAO bookDAO = new BookDAO();

	public void save(){
		bookDAO.save(product);
		}
	
//	public void save(){
//		System.out.println(product);
//		}
	
	public Book getProduct() {
		return product;
		}
	
//	public void save(){
//		System.out.println("Precisamos salvar o livro!!");
//	}

}
