package com.s21484.project.controllers;

import com.s21484.project.models.CategoryModel;
import com.s21484.project.repositories.DatabaseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
public class CategoryController {

    @Resource(name = "dbRepo")
    private DatabaseRepository repository;

    @GetMapping("/categories")
    public ArrayList<CategoryModel> getCategories() {
        return repository.getCategories();
    }
}
