package com.spring.brtima.demo.controller;

import com.spring.brtima.demo.model.EntityBro;
import org.hibernate.Criteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@RestController
public class ControllerForBro extends Name implements NameInterface{
    @PersistenceContext
    private EntityManager entityManager;


    @RequestMapping("/")
    public List<Object> methodGetEntityBro() {
            NAMME
        CriteriaBuilder criteriaBuilder =  entityManager
                .getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder
                .createQuery();
        Root<EntityBro> from = criteriaQuery.from(EntityBro.class);
        criteriaQuery.select(from);

        criteriaQuery.where(criteriaBuilder.equal(from.get("name"), "BRO"),from.get("id"),);
        return entityManager.createQuery(criteriaQuery)
                .getResultList();
    }
}
/*
    @Autowired
    private HandlerDTO handlerDTO;

    @RequestMapping("/{id}")
    public List<EntityBroDTO> methodGetEntityBro(@PathVariable("id") int id) {
        return handlerDTO.entityBroDTOS(id);
    }
*/
