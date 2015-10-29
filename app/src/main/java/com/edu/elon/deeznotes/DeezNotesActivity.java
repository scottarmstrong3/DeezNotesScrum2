package com.edu.elon.deeznotes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DeezNotesActivity extends Activity {
    //http://www.sitepoint.com/creating-cloud-backend-android-app-using-parse/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deez_notes);
    }
}
