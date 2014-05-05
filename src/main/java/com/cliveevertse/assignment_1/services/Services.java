/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cliveevertse.assignment_1.services;

import java.util.List;

/**
 *
 * @author Clive
 */
public interface Services<T, ID> {

    public T findById(final ID id);

    public List< T> findAll();

    public void persist(final T entity);

    public void merge(final T entity);

    public void remove(final T entity);

    public void removeById(final Long entityId);

    public List<T> findInRange(int firstResult, int maxResults);

    public long count();

    public T getByPropertyName(String name, String value);

    public List<T> getEntitiesByProperName(String name, String value);
}
