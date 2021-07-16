package com.example.carddogs

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.item_dog.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDetail.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDetail : Fragment() {
    private var name: String? = null
    private var specias: String? = null
    private var desc: String? = null
    private var allDesc: String? = null
    private var fact: String? = null
    private var avatarImage:Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        tvSpeciasDetail.text = specias
        tvAllDescDetail.text = allDesc
        tvDescDetail.text = desc
        ivAvatarDetail.setImageBitmap(avatarImage)
        tvFactDetail.text = fact
    }

    companion object {
        @JvmStatic
        fun newInstance(dog: Dog): FragmentDetail =
            FragmentDetail().apply {
                desc = dog.desc
                allDesc = dog.allDesc
                avatarImage = dog.avatar
                fact = dog.facts
                specias = dog.specias
            }
    }
}



