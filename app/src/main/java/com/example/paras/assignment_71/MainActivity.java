package com.example.paras.assignment_71;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText searchbar;
    Button searchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchbar = (EditText)findViewById(R.id.searchbar);
        searchbtn = (Button)findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String data = searchbar.getText().toString();
        Intent in = new Intent(Intent.ACTION_WEB_SEARCH);
        in.putExtra(SearchManager.QUERY, data);
        startActivity(in);
    }
}
