package com.example.carddogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentList.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentList : Fragment(),DogsListCallback {
    val dogs = arrayListOf<Dog>(Dog("Лайка","Цыбульник","Цыбульник описание" ),
        Dog("Чихуа","Домашняя","Чихуа описание"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvList.adapter = DogAdapter(context,dogs,this)
        rvList.layoutManager=LinearLayoutManager(context)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentList().apply { }
    }

    override fun onItemClickListener(index: Int) {

        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.frLayoutDetail,FragmentDetail.newInstance(dogs[index]))?.commit()



    }
}