package com.drewsullivandma.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.drewsullivandma.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, int crimeIndex) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeIndex);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        int crimeIndex = getIntent().getIntExtra(EXTRA_CRIME_ID, 0);
        return CrimeFragment.newInstance(crimeIndex);
    }
}
