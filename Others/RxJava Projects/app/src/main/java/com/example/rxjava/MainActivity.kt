package com.example.rxjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userObservable: Observable<String> = getUsersObservable()
        var userObserver: Observer<String> = getUsersObserver()

        userObservable
            .observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe(userObserver)
    }

    private fun getUsersObserver(): Observer<String> {
        return object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                Log.d("Subscribe", "onSubscribe")
            }

            override fun onNext(s: String) {
                Log.d("Data", "Name: $s")
            }

            override fun onError(e: Throwable) {
                Log.e("Error", "onError: " + e.message)
            }

            override fun onComplete() {
                Log.d("Complete", "All items are emitted!")
            }
        }
    }

    private fun getUsersObservable(): Observable<String> {
        return Observable.just("Tanay", "Rajesh", "Krunal", "Sunil")
    }
}