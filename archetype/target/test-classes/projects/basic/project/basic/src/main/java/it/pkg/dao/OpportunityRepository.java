package it.pkg.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.pkg.model.Opportunity;

import java.util.List;
import java.util.Optional;

/**
 * 
 * */
public interface OpportunityRepository extends MongoRepository<Opportunity, String>, OpportunityRepositoryCustom {

    public List<Opportunity> findAll();

    public Optional<Opportunity> findById(String id);
}
