package com.yeswecode.springbootecommerce.dao;

import com.yeswecode.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "producCategory" , path = "product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory , Long> {


}
