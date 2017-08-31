package com.batchmates.android.librarypoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.batchmates.android.adventurerclasses.Barbarian;
import com.batchmates.android.adventurerclasses.ClassManager;
import com.batchmates.android.adventurerclasses.Cleric;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Testing Library";
    Barbarian barbarian= new Barbarian();
    Cleric cleric= new Cleric();
    ClassManager classManager= new ClassManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void increaseLvl(View view) {

        classManager.increaseLevel(barbarian);
        classManager.increaseLevel(cleric);
        classManager.increaseLevel(cleric);
    }
}
