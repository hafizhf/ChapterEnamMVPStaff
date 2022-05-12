package andlima.hafizhfy.chapterenammvpstaff.presenter

import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem

interface StaffView {
    fun onSuccess(msg: String, staff: List<GetAllStaffResponseItem>)

    fun onError(msg: String)
}