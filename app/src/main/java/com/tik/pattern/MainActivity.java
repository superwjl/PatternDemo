package com.tik.pattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tik.pattern.adapter.PatternAdapterAct;
import com.tik.pattern.command.PatternCommandAct;
import com.tik.pattern.decorator.PatternDecoratorAct;
import com.tik.pattern.factory.PatternFactoryAct;
import com.tik.pattern.observer.PatternObserverAct;
import com.tik.pattern.singleton.PatternSingletonAct;
import com.tik.pattern.state.PatternStateAct;
import com.tik.pattern.strategy.PatternStrategyAct;
import com.tik.pattern.template.PatternTemplateAct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void strategy(View view){
        startActivity(new Intent(this, PatternStrategyAct.class));
    }

    public void observer(View view){
        startActivity(new Intent(this, PatternObserverAct.class));
    }

    public void decorator(View view){
        startActivity(new Intent(this, PatternDecoratorAct.class));
    }

    public void factory(View view){
        startActivity(new Intent(this, PatternFactoryAct.class));
    }

    public void singleton(View view){
        startActivity(new Intent(this, PatternSingletonAct.class));
    }

    public void command(View view){
        startActivity(new Intent(this, PatternCommandAct.class));
    }

    public void adapter(View view){
        startActivity(new Intent(this, PatternAdapterAct.class));
    }

    public void facade(View view){
        startActivity(new Intent(this, PatternFactoryAct.class));
    }

    public void template(View view){
        startActivity(new Intent(this, PatternTemplateAct.class));
    }

    public void state(View view){
        startActivity(new Intent(this, PatternStateAct.class));
    }
}
