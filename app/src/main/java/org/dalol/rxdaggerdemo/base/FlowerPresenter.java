package org.dalol.rxdaggerdemo.base;

import org.dalol.rxdaggerdemo.model.FlowerResponse;
import org.dalol.rxdaggerdemo.service.FlowerViewInterface;

import java.util.List;

import rx.Observer;

public class FlowerPresenter extends BasePresenter implements Observer<List<FlowerResponse>> {

    private FlowerViewInterface mViewInterface;

    public FlowerPresenter(FlowerViewInterface viewInterface) {
        mViewInterface = viewInterface;
    }

    @Override
    public void onCompleted() {
        mViewInterface.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        mViewInterface.onError(e.getMessage());
    }

    @Override
    public void onNext(List<FlowerResponse> flowerResponses) {
        mViewInterface.onFlowers(flowerResponses);
    }

    public void fetchFlowers() {
        unSubscribeAll();
        subscribe(mViewInterface.getFlowers(), FlowerPresenter.this);
    }
}
