# RxDagger2Demo-master

#####Introduction
RxDagger showcases the use of Square's [Retrofit](http://square.github.io/retrofit/) and [RxJava](https://github.com/ReactiveX/RxJava/wiki), [Dagger](http://square.github.io/dagger/) and the MVP Architecture to make asynchronous HTTP Requests in Android Application.

#####The Setup
Let's take care of the depency injection for retrofit and RxJava/RxAndroid:
```java
dependencies {
 compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.2.1'
    compile 'com.squareup.retrofit2:retrofit:2.+'
    compile 'com.squareup.retrofit2:converter-gson:2.+'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.+'

    compile 'io.reactivex:rxjava:1.0.4'
    compile 'io.reactivex:rxandroid:0.24.0'

    apt 'com.google.dagger:dagger-compiler:2.1'
    compile 'com.google.dagger:dagger:2.1'
    provided 'org.glassfish:javax.annotation:10.0-b28'

    compile 'com.android.support:recyclerview-v7:23.1.1'
    compile 'com.jakewharton:butterknife:7.0.1'

    compile 'com.github.bumptech.glide:glide:3.7.0'
}
```

#### Author

- Niki Izvorski (nikiizvorski@gmail.com)

- Filipo for the MVP Rx Architecture

#####Reference:
Square Retrofit Doc: [http://goo.gl/UwksBu] <br>
RxJava Doc: [https://goo.gl/5AqMNi] <br>
CardView/RecycleView UI Reference: [http://goo.gl/stNj2J] <br>
Dagger2 Doc: [http://google.github.io/dagger/] 
