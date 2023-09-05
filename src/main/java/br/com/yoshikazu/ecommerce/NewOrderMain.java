package br.com.yoshikazu.ecommerce;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        try(var dispatcher = new KafkaDispatcher()){
            for(var i =0; i < 10; i++){
                var key = UUID.randomUUID().toString();
                var value = key + "1223112,888123,1289999";
                var email = "Thank you for your order! We are processing your order.";
                dispatcher.send("ECOMMERCE_SEND_EMAIL",key,value);
            }
        }

    }
}
