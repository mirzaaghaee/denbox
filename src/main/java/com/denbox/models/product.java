package com.denbox.models;
//import com.microsoft.azure.spring.data.documentdb.core.mapping.Document;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
//@Document(collection = "product")
public class product {
    @Id
    @Field(value="Id")

    private ObjectId _id;


    @Field(value="Supplier")
    private String supplier;
    @Field(value="SKU")
    private String sKU;
    @Field(value="Name")
    private String name;
    @Field(value="Category")
    private String category;
    @Field(value="SubCategory")
    private String subCategory;
    @Field(value="Description")
    private String description;
    @Field(value="PageUrl")
    private String pageUrl;
    @Field(value="ImageUrl")
    private String imageUrl;
    @Field(value="Price")
    private String price;


    // Constructors
    public product() {}

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getsKU() {
        return sKU;
    }

    public void setsKU(String sKU) {
        this.sKU = sKU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

// ObjectId needs to be converted to string

}