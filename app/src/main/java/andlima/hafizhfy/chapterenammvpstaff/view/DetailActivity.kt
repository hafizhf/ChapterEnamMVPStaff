package andlima.hafizhfy.chapterenammvpstaff.view

import andlima.hafizhfy.chapterenammvpstaff.R
import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem
import andlima.hafizhfy.chapterenammvpstaff.presenter.StaffDetailPresenter
import andlima.hafizhfy.chapterenammvpstaff.presenter.StaffDetailView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(), StaffDetailView {

    lateinit var presenter: StaffDetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val selectedData = intent.getParcelableExtra<GetAllStaffResponseItem>("STAFF_DETAIL") as GetAllStaffResponseItem

        presenter = StaffDetailPresenter(this, selectedData)
        presenter.getStaffDetail()
    }

    override fun onProcessed(detail: GetAllStaffResponseItem) {
        tv_nama_detail.text = detail.name
        tv_email_detail.text = detail.email
        tv_id_detail.append(detail.id)
    }
}