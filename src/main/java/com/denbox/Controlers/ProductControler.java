package com.denbox.Controlers;
import com.denbox.Controlers.ProductControler;
import com.denbox.models.product;

import com.denbox.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
//import org.bson.types.ObjectId;


@RestController
@RequestMapping("/product")
public class ProductControler {
    @Autowired
    private ProductRepository productRepository;

    @CrossOrigin
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest() {
        return "Hello tes is ok";
    }

    @CrossOrigin
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<product> getAllProduct() {
        System.out.println("product method runs");
        return productRepository.findAll();

    }
    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public product getProductById(@PathVariable("id") String id) {
        return productRepository.findBy_id(id);
    }
    @CrossOrigin
    @RequestMapping(value = "/name/{Name}", method = RequestMethod.GET)
    public List<product> getProductByName(@PathVariable("Name") String name) {
        return productRepository.findByNameContaining(name);
    }
    @CrossOrigin
    @RequestMapping(value = "/description/{Description}", method = RequestMethod.GET)
    public List<product> getProductByDescription(@PathVariable("Description") String Description) {
        return productRepository.findByDescriptionLike(Description);
    }
    @CrossOrigin
    @RequestMapping(value = "/search/{searchphrase}", method = RequestMethod.GET)
    public List<product> searchProduct (@PathVariable("searchphrase") String searchphrase) {
        return productRepository.findByNameContainsOrDescriptionLikeIgnoreCase(searchphrase, searchphrase);

    }



}
