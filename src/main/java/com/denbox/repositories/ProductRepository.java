package com.denbox.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
//import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
//import DocumentDbRepository;

import com.denbox.models.*;
//import org.bson.types.ObjectId;
//import com.microsoft.azure.documentdb.Obje
import java.util.List;

public interface ProductRepository extends MongoRepository<product,String> {
//public interface ProductRepository extends DocumentDbRepository<product,String> {
//    product findBy_id(ObjectId _id);
product findBy_id(String _id);
    List<product> findByNameContaining(String Name);
    List<product> findByDescriptionLike(String Description);
    List<product>findByNameContainsOrDescriptionLikeIgnoreCase(String title,
                                                   String description);





}
