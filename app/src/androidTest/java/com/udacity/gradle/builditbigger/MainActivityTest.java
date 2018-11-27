package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void tellJoke() {
        /*MainActivity mainActivity = new MainActivity();
        AsyncTask asyncTask = mainActivity.getEndpointsAsyncTaskInstance();
        */
        String joke;
        try {
            //joke = (String)asyncTask.execute().get();
            joke = (String)MainActivity.getAsyncJoke().get();
            //Log.d("joke", "validateEndPointsAsyncTaskResponse: " + joke);
            assertThat(joke, not(isEmptyString()));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}