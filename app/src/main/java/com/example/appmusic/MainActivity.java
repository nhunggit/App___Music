package com.example.appmusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView song_playing;
TextView namesong;

public static final String EXTRA_MESSAGE="com.example.android.appMusic.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xl_recycleview();
//        Intent intent=getIntent();
//        String name=intent.getStringExtra(baihat_Adapter.EXTRA_MESSAGE);
        namesong=(TextView)findViewById(R.id.txt_ten);
        song_playing=(TextView)findViewById(R.id.song_playing);
//        if(namesong.setOnClickListener((View.OnClickListener) this)){
//
//        }
       // String name=namesong.getText().toString();

//        song_playing.setText(name);

    }
    public void xl_recycleview(){
        RecyclerView recycleview=(RecyclerView)findViewById(R.id.recycleview);
        recycleview.setHasFixedSize(true);
       @SuppressLint("WrongConstant") LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recycleview.setLayoutManager(linearLayoutManager);
        ArrayList<baihat> arrayList=new ArrayList<>();
        arrayList.add(new baihat("1","Nam thang ruc ro",R.drawable.ic_tuychon));
        arrayList.add(new baihat("2","Que nha",R.drawable.ic_tuychon));
        arrayList.add(new baihat("3","Phia sau mot co gai",R.drawable.ic_tuychon));
        baihat_Adapter baihats=new baihat_Adapter(arrayList,this);
        recycleview.setAdapter(baihats);

    }

    public void tenbaihat(View view) {

    }


//    public void tenbaihat(View view) {
//        String mname=song_playing.getText().toString();
//        Intent intent1=new Intent(this, mysongActivity.class);
//        intent1.putExtra(EXTRA_MESSAGE,mname);
//        this.startActivity(intent1);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.tuychon_menu,menu);
//        MenuItem search=menu.findItem(R.id.timkiem);
//        SearchView searchView= (SearchView) search.getActionView();
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        return super.onContextItemSelected(item);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        return super.onOptionsItemSelected(item);
//    }
}
