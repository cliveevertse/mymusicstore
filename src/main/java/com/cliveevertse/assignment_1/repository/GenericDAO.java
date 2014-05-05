/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.repository;

import java.io.Serializable;

/**
 *
 * @author Clive
 */
public interface GenericDAO < T extends Serializable > extends DAO< T, Long>{
	void setClazz( final Class< T > clazzToSet );
}

