package com.example.cleanarch.entrypoint.consumer.mapper;

import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = {
    Customer.class,
    CustomerMessage.class
})
public interface CustomerMessageMapper {

    Customer toCustomer(final CustomerMessage customerMessage);

}
