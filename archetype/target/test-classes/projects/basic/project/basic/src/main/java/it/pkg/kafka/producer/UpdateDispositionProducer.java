package it.pkg.kafka.producer;

/**
 * Created 
 */
public interface UpdateDispositionProducer {

    void updateDataDispositionAndPublishToKafka(String id, String disposition);
}
