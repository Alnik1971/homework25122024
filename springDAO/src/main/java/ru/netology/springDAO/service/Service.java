package ru.netology.springDAO.service;

import ru.netology.springDAO.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {
    private Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public List<String> getProductName(String name){
        return repository.getProductName(name);
    }
}
