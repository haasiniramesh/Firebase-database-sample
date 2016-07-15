package com.android.firebase.db.test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;

    public ContactViewHolder(View itemView) {
        super(itemView);

        titleView = (TextView) itemView.findViewById(R.id.tv_fname);
    }

    public void bindToPost(Contact contact) {
        titleView.setText(contact.first_name);
    }
}
