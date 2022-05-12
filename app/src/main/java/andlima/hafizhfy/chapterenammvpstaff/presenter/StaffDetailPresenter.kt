package andlima.hafizhfy.chapterenammvpstaff.presenter

import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem

class StaffDetailPresenter(val detailView: StaffDetailView, val detailStaff: GetAllStaffResponseItem) {
    fun getStaffDetail() {
        detailView.onProcessed(detailStaff)
    }
}