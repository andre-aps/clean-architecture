package com.example.cleanarch.dataprovider;

import com.example.cleanarch.core.dataprovider.FindCustomerById;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.dataprovider.repository.CustomerRepository;
import com.example.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(final String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }

}
