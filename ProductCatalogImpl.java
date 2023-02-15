package com.edubridge.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Config.DBConfig;
import com.edubridge.Model.ProductCatalog;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class ProductCatalogImpl 
{
	public  void addProductCatalog(ProductCatalog p)
	{
		Session s=DBConfig.getSession();
		Transaction tx=s.beginTransaction();
		
		s.persist(p);
		tx.commit();

	}
	
	public static List<ProductCatalog> getAllProducts()
	{
		Session s=DBConfig.getSession();
		CriteriaBuilder cb=s.getCriteriaBuilder();
		CriteriaQuery<ProductCatalog> query=cb.createQuery(ProductCatalog.class);
		Root<ProductCatalog> root=query.from(ProductCatalog.class);
		query.select(root);
		List<ProductCatalog> result=s.createQuery(query).getResultList();
		
		return result;
	}
	public static List<ProductCatalog> getProductsByID(int prdid)
	{
		Session s=DBConfig.getSession();
		CriteriaBuilder cb=s.getCriteriaBuilder();
		CriteriaQuery<ProductCatalog> query=cb.createQuery(ProductCatalog.class);
		Root<ProductCatalog> root=query.from(ProductCatalog.class);
		query.select(root).where(cb.equal(root.get("productID"),prdid));
		List<ProductCatalog> result=s.createQuery(query).getResultList();
		
		return result;
	}
}
