package com.example.utsakb_dezan.daily

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsakb_dezan.R

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class DailyFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Programing", R.drawable.java))
        childItems1.add(ChildItem("Gaming", R.drawable.console))
        childItems1.add(ChildItem("Badminton", R.drawable.badminton))
        parentList.add(
            ParentItem(
                "Daily",
                R.drawable.baseline_daily,
                childItems1
            )
        )

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Wahyu", R.drawable.ppfriend1))
        childItem2.add(ChildItem("Herman", R.drawable.ppfriend2))
        childItem2.add(ChildItem("Saepul", R.drawable.ppfriend3))
        parentList.add(
            ParentItem(
                "Friends List",
                R.drawable.baseline_people_alt_24,
                childItem2
            )
        )
    }

}