package shaunhossain.com.rcodegl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mehdi.sakout.fancybuttons.FancyButton;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {

    FancyButton gen,loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gen = (mehdi.sakout.fancybuttons.FancyButton) findViewById(R.id.gen);
        loc = (mehdi.sakout.fancybuttons.FancyButton) findViewById(R.id.loc);

        gen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (MainActivity.this, MainActivityGenerator.class);
                    startActivityForResult(intent, 0);
                    overridePendingTransition(android.R.anim.fade_in,
                            android.R.anim.fade_out);
                }
            });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivityLocator.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(android.R.anim.fade_in,
                        android.R.anim.fade_out);
            }
        });
    }
}
