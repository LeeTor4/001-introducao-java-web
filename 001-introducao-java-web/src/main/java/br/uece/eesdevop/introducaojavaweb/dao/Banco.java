package br.uece.eesdevop.introducaojavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.uece.eesdevop.introducaojavaweb.Book;

public class Banco {
	
	
	private static List<Book> lista = new ArrayList<>();
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public Banco() {
    	emf = Persistence.createEntityManagerFactory("persistenceUnitName");	
    	em = emf.createEntityManager();	
    }
	
    //Metodo para testes iniciais
	static {
		Book  book1 = new Book("Livro dos Espiritos ", "Alan Kardec", "1786");
		Book  book2 = new Book("Java Deitel ", "Alan Turing", "1970");
		Book  book3 = new Book("ICMS descomplicado ", "Paulo Almada", "2020");
		Banco.lista.add(book1);
		Banco.lista.add(book2);
		Banco.lista.add(book3);
	}
	
	
	public void adiciona(Book book) {
		
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		
		Banco.lista.add(book);
		System.out.println("Livro salvo com Sucesso!!!");
	}

	@SuppressWarnings("unchecked")
	public List<Book> getLista() {
	    
		return em.createQuery("from Book").getResultList();
	}

	
	
	
}
