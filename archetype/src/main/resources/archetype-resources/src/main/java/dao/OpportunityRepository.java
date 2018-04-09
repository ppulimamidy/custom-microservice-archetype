#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import ${package}.model.Opportunity;

import java.util.List;
import java.util.Optional;

/**
 * 
 * */
public interface OpportunityRepository extends MongoRepository<Opportunity, String>, OpportunityRepositoryCustom {

    public List<Opportunity> findAll();

    public Optional<Opportunity> findById(String id);
}
