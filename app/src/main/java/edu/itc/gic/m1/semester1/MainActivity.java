package edu.itc.gic.m1.semester1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Db db = Db.getInstance(getBaseContext());
              contributorDao contributorDao = db.getcontributor();
              List<Contributor>list = contributorDao.listAll();
              if (list == null || list.isEmpty()){
                  //load data
              }
              recyclerView.setAdapter(new ContributorListAdapter());


            }
        };
        Executors.newSingleThreadExecutor().execute(runnable);
    }

}
