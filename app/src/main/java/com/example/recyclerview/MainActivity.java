package com.example.recyclerview;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }
    private RecyclerView rvCategory;
    private ArrayList<Hero> list = new ArrayList<>();
    private static final String TAG = "mainActivity";
    private String title = "Mode List";
    private void showSelectedHero(Hero Hero){
        Toast.makeText(this, "Kamu memilih "+Hero.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setActionBarTitle("Mode List");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(this);
        listHeroAdapter.setListHero(list);
        rvCategory.setAdapter(listHeroAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",HeroesData.getListData().get(position).getName());
                intent.putExtra("chardesc",HeroesData.getListData().get(position).getFrom());
                intent.putExtra("imgchar",HeroesData.getListData().get(position).getPhoto());
                startActivity(intent);
            }
        });
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(this);
        gridHeroAdapter.setListHero(list);
        rvCategory.setAdapter(gridHeroAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",HeroesData.getListData().get(position).getName());
                intent.putExtra("chardesc",HeroesData.getListData().get(position).getFrom());
                intent.putExtra("imgchar",HeroesData.getListData().get(position).getPhoto());
                startActivity(intent);
            }
        });
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(this);
        cardViewHeroAdapter.setListHero(list);
        rvCategory.setAdapter(cardViewHeroAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.d(TAG,"onClick: Clickedon.");

                showSelectedHero(list.get(position));
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);

                intent.putExtra("namechar",HeroesData.getListData().get(position).getName());
                intent.putExtra("chardesc",HeroesData.getListData().get(position).getFrom());
                intent.putExtra("imgchar",HeroesData.getListData().get(position).getPhoto());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyclerList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode CardView");
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

