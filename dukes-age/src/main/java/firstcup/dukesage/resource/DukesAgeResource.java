/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/firstcup-examples/LICENSE.txt
 */
package firstcup.dukesage.resource;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 */
@Path("dukesAge")
public class DukesAgeResource {

    /** Creates a new instance of DukesAgeResource */
    public DukesAgeResource() {
    }

    /**
     * Retrieves representation of an instance of DukesAgeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        // Create a new Calendar for Duke's birthday
        Calendar dukesBirthday = new GregorianCalendar(1995, Calendar.MAY, 23);
        // Create a new Calendar for today
        Calendar now = GregorianCalendar.getInstance();

        // Subtract today's year from Duke's birth year, 1995
        int dukesAge = now.get(Calendar.YEAR) - dukesBirthday.get(Calendar.YEAR);
        dukesBirthday.add(Calendar.YEAR, dukesAge);

        // If today's date is before May 23, subtract a year from Duke's age
        if (now.before(dukesBirthday)) {
            dukesAge--;
        }
        // Return a String representation of Duke's age
        return "" + dukesAge;
    }
}
