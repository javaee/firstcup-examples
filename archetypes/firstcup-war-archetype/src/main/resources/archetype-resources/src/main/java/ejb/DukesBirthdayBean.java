/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/firstcup-examples/LICENSE.txt
 */
#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ejb;

import ${package}.entity.FirstcupUser;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * DukesBirthdayBean is a stateless session bean that calculates the age
 * difference between a user and Duke, who was born on May 23, 1995.
 */
@Stateless
public class DukesBirthdayBean {

    private static final Logger logger =
            Logger.getLogger("${package}.ejb.DukesBirthdayBean");

    @PersistenceContext
    private EntityManager em;

    public Double getAverageAgeDifference() {
		// Insert code here
    }

    public int getAgeDifference(Date date) {
		// Insert code here
    }
}
