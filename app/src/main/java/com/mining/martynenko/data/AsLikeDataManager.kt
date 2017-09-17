package com.mining.martynenko.data

import com.mining.martynenko.data.network.ApiHelper
import com.mining.martynenko.data.network.model.ApplicationInfoResponse
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AsLikeDataManager @Inject constructor(private val apiHelper: ApiHelper) : DataManager {

    override fun getApplicationInfo(id: Int): Observable<ApplicationInfoResponse> {
        return apiHelper.getApplicationInfo(id)
    }
}