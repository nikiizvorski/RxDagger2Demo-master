package org.dalol.rxdaggerdemo.service;

import org.dalol.rxdaggerdemo.model.FlowerResponse;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface FlowerService {

    @GET("/feeds/flowers.json")
    Observable<List<FlowerResponse>> getFlowers();
}
