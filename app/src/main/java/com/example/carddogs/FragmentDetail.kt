package com.example.carddogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDetail.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDetail : Fragment() {

    private var name: String? = null
    private var lastName: String? = null
    private var desc: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_PARAM1)
            lastName = it.getString(ARG_PARAM2)
            desc = it.getString(ARG_PARAM3)
//            avatar = it.getString(ARG_PARAM3)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvNameDetail.text = name
//        tvLastNameDetail.text = lastName
//        tvDesc.text = desc
    }

    companion object {
        @JvmStatic
        fun newInstance(dog: Dog): FragmentDetail =
            FragmentDetail().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, dog.name)
                    putString(ARG_PARAM2, dog.lastName)
                    putString(ARG_PARAM3, dog.desc)

                }
            }
    }
}



