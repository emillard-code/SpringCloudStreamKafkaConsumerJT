package com.project.listener;

import com.project.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class KafkaListener {

    private Logger logger = LoggerFactory.getLogger(KafkaListener.class);

    @StreamListener("input")
    public void consumeMessage(Book book) {

        logger.info("Consume payload : " + book);

    }

}