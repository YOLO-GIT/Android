package com.example.mini_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.databinding.ContactListItemBinding;

import java.util.ArrayList;

// Trademark Sufi
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {

    private ArrayList<MiniProject> contacts;

    public MyAdapter(ArrayList<MiniProject> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creating new View holders for items in recyclerView


        ContactListItemBinding contactListItemBinding =
                DataBindingUtil.inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.contact_list_item,
                        parent,
                        false
                );

        return new ContactViewHolder(contactListItemBinding);
    }

    // 1.
    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        // Called by recyclerView when it needs to display or update an item
        // at a specific position in the list or grid.

        MiniProject currentContact  = contacts.get(position);

        holder.contactListItemBinding.setContact(currentContact);

    }

    // 2.
    @Override
    public int getItemCount() {
        // Determines the total number of items in the dataset that will
        // be displayed in the recyclerview

        if (contacts != null){
            return contacts.size();
        }else {
            return 0;
        }
    }

    // 3.
    public void setContacts(ArrayList<MiniProject> contacts) {
        this.contacts = contacts;

        // Inform the associated RecyclerView that the underlying
        // dataset has changed, and the RecyclerView should refresh
        // its views to reflect these changes.
        notifyDataSetChanged();

    }

    // 4.
    class ContactViewHolder extends RecyclerView.ViewHolder{

        private ContactListItemBinding contactListItemBinding;

        public ContactViewHolder(@NonNull ContactListItemBinding contactListItemBinding) {
            super(contactListItemBinding.getRoot());
            this.contactListItemBinding = contactListItemBinding;
        }
    }
}
