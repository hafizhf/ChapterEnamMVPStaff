package andlima.hafizhfy.chapterenammvpstaff.presenter

import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem
import andlima.hafizhfy.chapterenammvpstaff.network.ApiClient
import retrofit2.Call
import retrofit2.Response

class StaffPresenter(val staffView: StaffView) {
    fun getStaffData() {
        ApiClient.instance.getAllStaff()
            .enqueue(object : retrofit2.Callback<List<GetAllStaffResponseItem>>{
                override fun onResponse(
                    call: Call<List<GetAllStaffResponseItem>>,
                    response: Response<List<GetAllStaffResponseItem>>
                ) {
                    if (response.isSuccessful) {
                        staffView.onSuccess(response.message(), response.body()!!)
                    } else {
                        staffView.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetAllStaffResponseItem>>, t: Throwable) {
                    staffView.onError(t.message!!)
                }

            })
    }
}