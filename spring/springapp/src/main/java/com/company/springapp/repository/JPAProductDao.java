package com.company.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.company.springapp.domain.Product;

public class JPAProductDao implements ProductDao {
	private EntityManager em = null;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em = em;
	}

	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Product> getProductList() {
		return em.createQuery("select p from Product p order by p.id").getResultList();
	}

	@Transactional(readOnly=false)
	public void saveProduct(Product product) {
		em.merge(product);
	}

}
