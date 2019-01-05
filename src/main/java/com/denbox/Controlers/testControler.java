package com.denbox.Controlers;

import com.denbox.models.product;
import com.denbox.repositories.ProductRepository;
//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class testControler {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTest() {
        return "Hello tes is ok";
    }



}
