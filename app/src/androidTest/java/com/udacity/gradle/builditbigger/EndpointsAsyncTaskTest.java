package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void nonEmptyString() {
        String result = new EndpointsAsyncTask().doInBackground(InstrumentationRegistry.getContext());
        assertFalse(result.isEmpty());
    }

}
