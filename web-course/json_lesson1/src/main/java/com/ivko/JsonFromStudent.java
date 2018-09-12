package com.ivko;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JsonFromStudent implements Serializable {
    private static final long serialVersionUID = -2336186193238228717L;

    public List<String> getCustomerProps(Customer customer){
        List<String> customerProps = new ArrayList<>();
        customerProps.add(String.valueOf(customer.getAge()));
        customerProps.add(customer.getName());
        customerProps.add(customer.getSurname());
        return customerProps;
    }

    public String getJson(List<String> customerParams){
        Gson gson = new Gson();
        return gson.toJson(customerParams);
    }

    public static void main(String[] args) {
        JsonFromStudent jsonFromStudent = new JsonFromStudent();
        Customer customer = new Customer(24, "Ivan", "Ivanov");
        List<String> params = jsonFromStudent.getCustomerProps(customer);
        System.out.println(jsonFromStudent.getJson(params));
    }
}