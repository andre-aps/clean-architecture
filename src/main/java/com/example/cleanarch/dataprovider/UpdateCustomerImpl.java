package com.example.cleanarch.dataprovider;

import com.example.cleanarch.core.dataprovider.UpdateCustomer;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.dataprovider.repository.CustomerRepository;
import com.example.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerImpl implements UpdateCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(final Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
