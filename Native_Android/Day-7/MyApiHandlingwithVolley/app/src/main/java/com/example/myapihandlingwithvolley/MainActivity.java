package com.example.myapihandlingwithvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText editText;
    private RequestQueue requestQueue;
    private static String Mydate;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview1);
        button=findViewById(R.id.button1);
        editText=findViewById(R.id.editTextDate1);
        requestQueue=VolleySingletonCustomClass.getInstance(this).getRequestQueue();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mydate=editText.getText().toString();
                getApiData();
            }
        });
    }
    private void getApiData()
    {
        Mydate=editText.getText().toString();
        String url="https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=670&date="+Mydate;
        JsonObjectRequest request =new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray=response.getJSONArray("sessions");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject=jsonArray.getJSONObject(i);
                        int capacity=jsonObject.getInt("available_capacity");
                        int capacityDose1=jsonObject.getInt("available_capacity_dose1");
                        int capacityDose2=jsonObject.getInt("available_capacity_dose2");
                        int minAgeLimit=jsonObject.getInt("min_age_limit");

                        String feeType=jsonObject.getString("fee_type").toString();
                        String centerName=jsonObject.getString("name").toString();
                        String districtName=jsonObject.getString("district_name").toString();
                        String addr=jsonObject.getString("address").toString();
                        String slotTiming=jsonObject.getString("from").toString()+" - "+jsonObject.getString("to").toString();
                        String vaccineType=jsonObject.getString("vaccine").toString();
                        String blockName=jsonObject.getString("block_name").toString();
                        String pincode=jsonObject.getString("pincode").toString();

                        textView.append("District Name:"+districtName+"\n"+"BlockName : "+blockName+"\n"+"Pincode:"+pincode+"\n"+"Centre Name: "+centerName+"\n"+"Address: "+addr+"\n"+"Vaccine Type : "+vaccineType+"\n"+"SlotTiming"+slotTiming+"\n"+"Availabity Of Vaccine : "+capacity+"\n"+"Avalability_Capacity_Dose1: "+capacityDose1+"\n"+"Avalability_Capacity_Dose2: "+capacityDose2+"\n\n\n\n");
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,"Check Your Connectivity!!!",Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(request);
    }
}