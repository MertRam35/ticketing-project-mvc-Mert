package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;

public interface CrudService <T,ID>{

    T  save(T  role);
    T finById(ID id);
    List<T> findAll();
    void deleteById(ID id);
}
