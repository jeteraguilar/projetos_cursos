package com.jeteraguilar.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeteraguilar.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
