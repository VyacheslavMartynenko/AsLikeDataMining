package com.mining.martynenko.data.network

import com.mining.martynenko.data.network.model.ApplicationInfoResponse
import io.reactivex.Observable
import javax.inject.Inject

class AsLikeApiHelper @Inject constructor(val apiCall: ApiCall) : ApiHelper {

    override fun getApplicationInfo(id: Int): Observable<ApplicationInfoResponse> {
        return apiCall.getApplicationInfo(id)
    }
}