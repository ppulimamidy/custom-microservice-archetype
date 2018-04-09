#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.kafka.producer;

/**
 * Created 
 */
public interface UpdateDispositionProducer {

    void updateDataDispositionAndPublishToKafka(String id, String disposition);
}
