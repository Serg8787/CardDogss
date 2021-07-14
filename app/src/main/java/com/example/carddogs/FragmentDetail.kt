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
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var lastName: String? = null
    private var avatar: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_PARAM1)
            lastName = it.getString(ARG_PARAM2)
            avatar = it.getString(ARG_PARAM3)
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
        tvLastNameDetail.text = lastName
        ivAvatarDetail.setImageResource(R.drawable.mini3)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentDetail.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(name: String, lastName: String) =
            FragmentDetail().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, name)
                    putString(ARG_PARAM2, lastName)
                    putString(ARG_PARAM3, avatar)

                }
            }
    }
}