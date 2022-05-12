package andlima.hafizhfy.chapterenammvpstaff.network

import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("staf")
    fun getAllStaff(): Call<List<GetAllStaffResponseItem>>
}