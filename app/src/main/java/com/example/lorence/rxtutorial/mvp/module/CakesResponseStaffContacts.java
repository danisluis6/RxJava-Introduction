
package com.example.lorence.rxtutorial.mvp.module;

import javax.annotation.Generated;

/**
 * Created by lorence on 25/12/2017.
 *
 * @version version7
 * @since 12/25/2017
 */

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CakesResponseStaffContacts {
    private String role;
    private String name;
    private CakesResponseStaffContactsPhones phones;
    private String dateOfBirth;
    private int id;
    private String[] email;

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CakesResponseStaffContactsPhones getPhones() {
        return this.phones;
    }

    public void setPhones(CakesResponseStaffContactsPhones phones) {
        this.phones = phones;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getEmail() {
        return this.email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }
}
