/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.services.crud.Impl;

import com.cliveevertse.assignment_1.model.CreditCard;
import com.cliveevertse.assignment_1.repository.GenericDAO;
import com.cliveevertse.assignment_1.services.crud.CreditCardCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author boniface
 */
@Service("creditCardCrudService")
@Transactional
public class CreditCardCrudServiceImpl implements CreditCardCrudService {

    @Autowired
    private GenericDAO<CreditCard> dao;

    public final void setDao(final GenericDAO< CreditCard> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(CreditCard.class);
    }

    public CreditCardCrudServiceImpl() {
    }
    @Override
    public CreditCard findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<CreditCard> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(CreditCard entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(CreditCard entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(CreditCard entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        CreditCard v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<CreditCard> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public CreditCard getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<CreditCard> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
