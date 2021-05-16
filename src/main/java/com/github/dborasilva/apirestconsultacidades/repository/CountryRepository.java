package com.github.dborasilva.apirestconsultacidades.repository;

import com.github.dborasilva.apirestconsultacidades.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
