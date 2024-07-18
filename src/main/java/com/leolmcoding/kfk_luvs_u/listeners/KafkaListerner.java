package com.leolmcoding.kfk_luvs_u.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListerner {
    @KafkaListener(topics = "meuTopico",groupId = "meuIdDoGrupo")
    void listen(String data){
        System.out.println("Recived message:"+data);
    }
}
