package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Kundan","kunadn@gmail.com","https://th.bing.com/th/id/OIP.Wb_e5476HXjAHUunzkWp4QHaGL?w=186&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Gaurav","decil@gmail.com","https://th.bing.com/th/id/OIP.Wb_e5476HXjAHUunzkWp4QHaGL?w=186&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Bhalu","lal@gmail.com","https://th.bing.com/th/id/OIP.IRUsCupQDVegtAFdg8r23QHaFg?w=186&h=138&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Mommy","kunadn@gmail.com","https://th.bing.com/th/id/OIP.Wb_e5476HXjAHUunzkWp4QHaGL?w=186&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Mohan","Pahuna@gmail.com","https://th.bing.com/th/id/OIP.Wb_e5476HXjAHUunzkWp4QHaGL?w=186&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Daui","kunadn@gmail.com","https://th.bing.com/th/id/OIP.U8-2R5TwTy7hXXXzPEmHfgHaHP?w=186&h=182&c=7&r=0&o=5&dpr=1.25&pid=1.7"));
        contacts.add(new Contact("Devi Lal","kunadn@gmail.com","https://th.bing.com/th/id/OIP.Wb_e5476HXjAHUunzkWp4QHaGL?w=186&h=155&c=7&r=0&o=5&dpr=1.25&pid=1.7"));

        ContactRecViewAdapter adapter = new ContactRecViewAdapter(this);
        adapter.setContacts(contacts);
      recyclerView.setAdapter(adapter);
     recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}