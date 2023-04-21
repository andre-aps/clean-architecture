package com.example.cleanarch.core.dataprovider;

import com.example.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
