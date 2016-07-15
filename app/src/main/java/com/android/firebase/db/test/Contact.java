package com.android.firebase.db.test;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anandhar on 7/15/16.
 */
@IgnoreExtraProperties
public class Contact {
    public String first_name;
    public String last_name;
    public String phone;

    public Contact() {

    }

    public Contact(String fName, String lName, String phone) {
        first_name = fName;
        last_name = lName;
        this.phone = phone;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("first_name", first_name);
        result.put("last_name", last_name);
        result.put("phone", phone);

        return result;
    }
}
