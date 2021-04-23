package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import static com.parse.ParseObject.*;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("75D2ZTccBx51efJdSHoxwQP4CeKlNmNnnV7vMHOB")
                .clientKey("QRfgxIvdjmaEmU16h6VjjxtNn3I7a3yVxKuBMwa0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
