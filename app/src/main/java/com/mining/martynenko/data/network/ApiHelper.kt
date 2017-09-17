package com.mining.martynenko.data.network

import com.mining.martynenko.data.network.model.ApplicationInfoResponse
import io.reactivex.Observable

interface ApiHelper {
    fun getApplicationInfo(id: Int): Observable<ApplicationInfoResponse>
}