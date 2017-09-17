package com.mining.martynenko.data.network.model

data class ApplicationInfoResponse(val resultCount: String, val results: List<Result>) {
    data class Result(val description: String)
}