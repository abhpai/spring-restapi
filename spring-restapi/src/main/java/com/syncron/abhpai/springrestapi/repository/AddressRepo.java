package com.syncron.abhpai.springrestapi.repository;

import com.syncron.abhpai.springrestapi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
