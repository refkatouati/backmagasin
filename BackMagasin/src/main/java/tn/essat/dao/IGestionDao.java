package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.essat.model.Produit;

public interface IGestionDao extends JpaRepository<Produit, Integer> {

	
}
