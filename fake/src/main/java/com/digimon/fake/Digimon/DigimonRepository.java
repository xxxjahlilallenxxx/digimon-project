package com.digimon.fake.Digimon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigimonRepository extends CrudRepository<Digimon, Integer>{
    
}
