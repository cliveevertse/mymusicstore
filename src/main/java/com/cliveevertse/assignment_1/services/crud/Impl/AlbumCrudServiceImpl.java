/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.services.crud.Impl;

import com.cliveevertse.assignment_1.model.Album;
import com.cliveevertse.assignment_1.repository.GenericDAO;
import com.cliveevertse.assignment_1.services.crud.AlbumCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author boniface
 */
@Service("albumCrudService")
@Transactional
public class AlbumCrudServiceImpl implements AlbumCrudService {

    @Autowired
    private GenericDAO<Album> dao;

    public final void setDao(final GenericDAO< Album> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Album.class);
    }

    public AlbumCrudServiceImpl() {
    }
    @Override
    public Album findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Album> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Album entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Album entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Album entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Album v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Album> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Album getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Album> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
