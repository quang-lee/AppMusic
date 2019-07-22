package com.example.bai_tap.appmusic.Service;

public class APIService {
    private static String base_url = "https://demomp3zing.000webhostapp.com/Server/";

    public static Dataservice getService (){
        return APIRetrofitClient.getRetrofit(base_url).create(Dataservice.class);
    }
}
