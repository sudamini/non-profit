package com.sportscontender.customerservice;

import com.sportscontender.model.Customer;
import com.sportscontender.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController{
    @Autowired
    CustomerRepository repository;

    @GetMapping("/bulkcreate")
    public String bulkcreate() {
        // save a single Customer
        repository.save(new Customer("adams", "Adam", "smith", "1 Runyon Ave", "CO", "adam.smith@gmail.com", "123"));
        // save a list of Customers
        repository.saveAll(Arrays.asList(new Customer("eves", "Eve", "smith", "1 Runyon Ave", "CO", "eve.smith@gmail.com", "123"),
                new Customer("samb", "Sam", "blake", "1 Runyon Ave", "CO", "sam.blake@gmail.com", "123"),
                new Customer("kateh", "Kate", "harrison", "1 Runyon Ave", "CO", "kate.harrison@gmail.com", "123"),
                new Customer("janed", "Jane", "doe", "1 Runyon Ave", "CO", "jane.doe@gmail.com", "123")));
        return "Customers are created";
    }

    @PostMapping("/create")
    public String createCustomer(@RequestBody Customer customer){
        // save a single Customer
        repository.save(customer);
        return "Customer is created";
    }
    @GetMapping("/findall")
    public List<Customer> findAll(){
        List<Customer> customers = repository.findAll();
        return customers;
    }

    @RequestMapping("/search/{id}")
    public String search(@PathVariable("id") String login){
        String customer = "";
        customer = repository.findById(login).toString();
        if( customer == null ){
            throw new UserNotFoundException("login id " + login );
        }
        return customer;
    }
}
