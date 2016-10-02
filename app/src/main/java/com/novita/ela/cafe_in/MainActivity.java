package com.novita.ela.cafe_in;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.novita.ela.cafe_in.Adapter.CafeAdapter;
import com.novita.ela.cafe_in.Model.CafeModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cafeRv)
    RecyclerView recyclerView;

    CafeAdapter adapter;
    List<CafeModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        initData();

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new CafeAdapter(getApplicationContext(), models, new OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position, boolean isLongClick) {
                Intent intent = new Intent(getApplicationContext(), DetailCafeActivity.class);
                intent.putExtra("nama", models.get(position).getName());
                intent.putExtra("cafe_img", models.get(position).getImgUrl());
                intent.putExtra("open", models.get(position).getOpenTime());
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        CafeModel cafe = new CafeModel(1, R.drawable.a, R.drawable.logo, "08:00 - 22.00", "Solaria", "Jl Ismail Marzuki", false);
        models.add(cafe);

        cafe = new CafeModel(2, R.drawable.b, R.drawable.logob, "08:00 - 22.00", "Barbara Kraft", "Jl Ismail Marzuki",  false);
        models.add(cafe);
        cafe = new CafeModel(3, R.drawable.c, R.drawable.logoc, "09:00 - 21.00", "Brighton", "Jl Ade Irma Suryani", false);
        models.add(cafe);
        cafe = new CafeModel(4, R.drawable.d, R.drawable.logod, "10:00 - 24.00", "Alila", "Jl Arya Banjar Getas",  false);
        models.add(cafe);
        cafe = new CafeModel(5, R.drawable.e, R.drawable.logoe, "08:00 - 22.00", "Fullcaff", "Jl Merpati", false);
        models.add(cafe);
        cafe = new CafeModel(6, R.drawable.f, R.drawable.logob, "08:00 - 22.00", "Ground & Control", "Jl Abdul Kadir Munsyi", false);
        models.add(cafe);
    }


}
