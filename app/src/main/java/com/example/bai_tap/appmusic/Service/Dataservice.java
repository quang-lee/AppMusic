package com.example.bai_tap.appmusic.Service;

import com.example.bai_tap.appmusic.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {

    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBanner();
}
