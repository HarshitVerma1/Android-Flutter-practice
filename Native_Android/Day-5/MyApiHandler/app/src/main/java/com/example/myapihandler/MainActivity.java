package com.example.myapihandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        requestQueue= Volley.newRequestQueue(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendApiRequest();
            }
        });
    }

    private void sendApiRequest() {
        String url="https://cdn-api.co-vin.in/api/v2/admin/location/districts/34";
        JsonObjectRequest request= new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray=response.getJSONArray("districts");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject district=jsonArray.getJSONObject(i);
                        String districtName=district.getString("district_name");
                        int districtID=district.getInt("district_id");
                        textView.append("District Name : "+districtName+" ,  "+"District ID : "+districtID +"\n\n\n");
                    }
                } catch (JSONException e) {
                    textView.append("Errrorrr!!!");
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,"INTERNET Connection ERROR!!!",Toast.LENGTH_SHORT).show();
            }
            
        });
        requestQueue.add(request);
    }

}