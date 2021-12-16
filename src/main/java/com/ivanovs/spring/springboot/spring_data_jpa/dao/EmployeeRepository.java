package com.ivanovs.spring.springboot.spring_data_jpa.dao;


import com.ivanovs.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {//наследуем и дженериком принимаем
    //primary key и с каким энтити работаем. Не нужно создавать класс, который данный энтерфейс имплементирует
    public List<Employee> findAllByName(String name);//можно составить метод средствами спринга
}
