package com.example.hemanth.s3assign1;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.hemanth.s3assign1.R.id.text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button search = (Button)findViewById(R.id.button);


    }

    public void launchWebBrowser(View v){
        EditText website = (EditText)findViewById(R.id.editText);
        String url = website.getText().toString();
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
      // intent.setData(Uri.parse("https://"+website));
        intent.putExtra(SearchManager.QUERY,url);
        startActivity(intent);



    }
}
