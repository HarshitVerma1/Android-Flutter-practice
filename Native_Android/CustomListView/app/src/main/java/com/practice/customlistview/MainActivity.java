package com.practice.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES = {R.drawable.friend1,
            R.drawable.friend2,
            R.drawable.friend3,
            R.drawable.friend4,
            R.drawable.friend5,
            R.drawable.friend6,
            R.drawable.friend7,
            R.drawable.friend8,
            R.drawable.friend9,
            R.drawable.friend10 };

    String[] NAMES = {"Lesa Bates",
            "Mabel Young",
            "Thomas Rice",
            "Alyssa James",
            "Tracy Hughes",
            "Jean Coleman",
            "Tyler Young",
            "Felix Washington",
            "Andre Green",
            "Brandie Jennings"};


    String[] PHONES = {"588-930-2178",
            "782-760-6801",
            "800-500-7103",
            "810-438-1930",
            "651-305-9242",
            "563-355-7671",
            "648-179-5711",
            "424-993-1478",
            "244-336-5495",
            "159-193-7791"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapterClass adapterClass =new MyAdapterClass(this,IMAGES,NAMES,PHONES);
        listView=findViewById(R.id.list);
        listView.setAdapter(adapterClass);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Mobile No. is:"+adapterClass.getItem(i) , Toast.LENGTH_SHORT).show();
            }
        });
    }
}