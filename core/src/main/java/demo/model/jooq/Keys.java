/*
 * This file is generated by jOOQ.
*/
package demo.model.jooq;


import demo.model.jooq.tables.Person;
import demo.model.jooq.tables.records.PersonRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PersonRecord, Long> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<PersonRecord, Long> IDENTITY_PERSON = createIdentity(Person.PERSON, Person.PERSON.ID);
    }
}
