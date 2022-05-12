package andlima.hafizhfy.chapterenammvpstaff.view

import andlima.hafizhfy.chapterenammvpstaff.R
import andlima.hafizhfy.chapterenammvpstaff.adapter.AdapterStaff
import andlima.hafizhfy.chapterenammvpstaff.model.GetAllStaffResponseItem
import andlima.hafizhfy.chapterenammvpstaff.presenter.StaffPresenter
import andlima.hafizhfy.chapterenammvpstaff.presenter.StaffView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), StaffView {

    private lateinit var presenter: StaffPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        presenter = StaffPresenter(this)
        presenter.getStaffData()
    }

    override fun onSuccess(msg: String, staff: List<GetAllStaffResponseItem>) {
        rv_staff.layoutManager = LinearLayoutManager(this)
        rv_staff.adapter = AdapterStaff(staff) {
            val pindahdata = Intent(this, DetailActivity::class.java)
            pindahdata.putExtra("STAFF_DETAIL", it)
            startActivity(pindahdata)
        }
    }

    override fun onError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}