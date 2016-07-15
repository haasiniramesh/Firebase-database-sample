package com.android.firebase.db.test;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyContactFragment extends ContactListFragment {

    public MyContactFragment() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("phone-book")
                .child("contacts");
    }
}
