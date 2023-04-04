package com.samar.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samar.produits.entities.Produit;


public interface ProduitRepository extends JpaRepository<Produit ,Long> {

}
