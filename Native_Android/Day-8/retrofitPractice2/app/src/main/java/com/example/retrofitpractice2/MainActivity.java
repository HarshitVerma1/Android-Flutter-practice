package com.example.retrofitpractice2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
//    TextView text1,text2,text3;
//    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = findViewById(R.id.rcv);
        LinearLayoutManager llm=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recycle.setLayoutManager(llm);
//        text1=findViewById(R.id.txt1);
//        text2=findViewById(R.id.txt2);
//        text3=findViewById(R.id.txt3);
//        imageView=findViewById(R.id.img1);

        listingData();

    }

    private void listingData() {
        ApiInterface apiInterface= RetrofitClass.getRetrofit().create(ApiInterface.class);
        Call<Pojo>  listingData=apiInterface.getData();
        listingData.enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                if(response.isSuccessful())
                {
                    recycleadapter recycleAdapter=new recycleadapter(response.body().getData());
                    recycle.setAdapter(recycleAdapter);
                }
            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failure!!! Check Your INTERNET_CONNECTIVITY.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    class recycleadapter extends RecyclerView.Adapter<recycleadapter.MyViewHolder> {
        List<Pojo.Datum> list;

        public recycleadapter(List<Pojo.Datum> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(getApplicationContext()).inflate(R.layout.one_item,null);
            recycleadapter.MyViewHolder viewHolder=new recycleadapter.MyViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.text1.setText(list.get(position).getFirstName().toString());
            holder.text2.setText(list.get(position).getId().toString());
            holder.text3.setText(list.get(position).getEmail().toString());
            Picasso.get()
                    .load(list.get(position).getAvatar())
                    .resize(100,100)
                    .noFade()
                    .into(holder.imge);

        }


        @Override
        public int getItemCount() {
            return list.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView text1,text2,text3;
            ImageView imge;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                text1=itemView.findViewById(R.id.txt1);
                text2=itemView.findViewById(R.id.txt2);
                text3=itemView.findViewById(R.id.txt3);
                imge=itemView.findViewById(R.id.img1);
            }
        }
    }
}
