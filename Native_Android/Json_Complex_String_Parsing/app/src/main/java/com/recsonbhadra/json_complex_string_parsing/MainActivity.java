package com.recsonbhadra.json_complex_string_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String json_string="{\n+" +
            "\"title:\":\"JSONParserTutorial\",\n"+
            "\"array\":[\n"+
            "{\n"+
            "\"Company\":\"Google\"\n"+
            "},\n"+
            "\"Company\":\"Facebook\"\n"+
            "},\n"+
            "{\n" +
            "\"Company\":\"LinkedIn\"\n"+
            "},\n"+
            "{\n" +
            "\"Company\":\"Microsoft\"\n"+
            "},\n"+
            "{\n" +
            "\"Company\":\"Apple\"\n"+
            "},\n"+
            "],\n"+
            "\"nested\":{\n"+
            "\"flag\":true,\n"+
            "\"random_number\":1\n"+
            "}\n"+
            "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Getting Json Object
        try{
            listView=findViewById(R.id.listy);
//        1-Storing Items in a list
            List<String> items=new ArrayList<>();
//        2-Creating a Json Object
            JSONObject root=new JSONObject(json_string);
//        3-Getting data from array
            JSONArray array= root.getJSONArray("array");
//        4- Setting the Title
            this.setTitle(root.getString("title"));
//        5- Loop to get all company details/objects
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject=array.getJSONObject(i);
                items.add(jsonObject.getString("company"));
            }
//        6- Creating adapter for the listview items
            ArrayAdapter<String> adapter=new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1,items);


            if(listView!=null){
                listView.setAdapter(adapter);
            }
            // Getting nested objects from the root
            JSONObject nested =root.getJSONObject("nested");
            Log.d("Tag","Flag Value"+nested.getBoolean("flag"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
} 