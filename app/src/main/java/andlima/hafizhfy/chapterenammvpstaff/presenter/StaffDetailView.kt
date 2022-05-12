package andlima.hafizhfy.chapterenammvpstaff.presenter

import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem

interface StaffDetailView {
    fun onProcessed(detail: GetAllStaffResponseItem)
}