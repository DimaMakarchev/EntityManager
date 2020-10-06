package com.spring.brtima.demo.dto;

import com.spring.brtima.demo.model.EntityBro;
import com.spring.brtima.demo.repo.RepoBRO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class HandlerDTO {
    @Autowired
    private RepoBRO repoBRO;

    public List<EntityBroDTO> entityBroDTOS(int id) {
        List<EntityBroDTO> entityBroDTOS = new ArrayList<>();
        List<EntityBro> allById = repoBRO.findAllById(Collections.singleton(id));
        allById.stream().forEach(entityBro -> {
            entityBroDTOS.add(getMEthod(entityBro));
        });
        return entityBroDTOS;
    }

    private EntityBroDTO getMEthod(EntityBro entityBro) {
        EntityBroDTO entityBroDTO = new EntityBroDTO();
        entityBroDTO.setId(entityBro.getId());
        entityBroDTO.setName(entityBro.getName() + "Cool bro");
        return entityBroDTO;
    }
}
