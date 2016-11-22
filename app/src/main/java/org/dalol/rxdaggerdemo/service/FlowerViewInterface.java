package org.dalol.rxdaggerdemo.service;

import org.dalol.rxdaggerdemo.model.FlowerResponse;

import java.util.List;

import rx.Observable;

public interface FlowerViewInterface {

    void onCompleted();

    void onError(String message);

    void onFlowers(List<FlowerResponse> flowerResponses);

    Observable<List<FlowerResponse>> getFlowers();
}
