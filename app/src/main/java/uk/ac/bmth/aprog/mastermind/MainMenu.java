package uk.ac.bmth.aprog.mastermind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainMenu extends Activity implements OnClickListener {


    Button btnAbout;
    Button btnHelp;
    Button btnExit;
    Button btnPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(this);
        btnHelp = (Button) findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(this);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private Void btnAboutClick() {
        startActivity(new Intent("Mastermind.About"));
        return null;
    }

    private Void btnHelpClick() {
        startActivity(new Intent("Mastermind.Help"));
        return null;
    }


    private Void btnPlayClick() {
        startActivity(new Intent("Mastermind.Main"));
        return null;
    }

    private Void btnExitClick() {
        System.exit(0);
        return null;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAbout:
                btnAboutClick();
                break;

            case R.id.btnHelp:
                btnHelpClick();
                break;

            case R.id.btnExit:
                btnExitClick();
                break;


            case R.id.btnPlay:
                btnPlayClick();
                break;

        }
    }

}
