#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

/**
 * Created by 
 */
public interface OpportunityRepositoryCustom {

    public long updateDispositionNoteOpportunity(String id, String dispositionNote);

    public long updateDispositionOpportunity(String id, String disposition);
}
