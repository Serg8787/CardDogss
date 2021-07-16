package com.example.carddogs

import android.graphics.BitmapFactory
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
val dogs = ArrayList<Dog>()


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentList.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentList : Fragment(),DogsListCallback {



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
        dogs.add(
            Dog(getString(R.string.n1),getString(R.string.a1),getString(R.string.s1),getString(R.string.d1),getString(
                            R.string.ad1),getString(R.string.f1),BitmapFactory.decodeResource(resources,R.drawable.mini1)))

        dogs.add(Dog(getString(R.string.n2),getString(R.string.a2),getString(R.string.s2),getString(
                    R.string.d2),getString(R.string.ad2),getString(R.string.f2),BitmapFactory.decodeResource(resources,R.drawable.mini2)))

        dogs.add(
            Dog(getString(R.string.n3),getString(R.string.a3),getString(R.string.s3),getString(R.string.d3),getString(
                            R.string.ad3),getString(R.string.f3),BitmapFactory.decodeResource(resources,R.drawable.mini3))
        )
        dogs.add(
            Dog(getString(R.string.n4),getString(R.string.a4),getString(R.string.s4),getString(R.string.d4),getString(
                            R.string.ad4),getString(R.string.f4),BitmapFactory.decodeResource(resources,R.drawable.mini4))
        )
        dogs.add(
            Dog(getString(R.string.n5),getString(R.string.a5),getString(R.string.s5),null,null,null,null)
        )
        dogs.add(
            Dog(getString(R.string.n6),getString(R.string.a6),getString(R.string.s6),getString(R.string.d6),getString(
                            R.string.ad6),getString(R.string.f6),BitmapFactory.decodeResource(resources,R.drawable.mini5))
        )
        dogs.add(
            Dog(getString(R.string.n1),getString(R.string.a1),getString(R.string.s1),getString(R.string.d1),getString(
                R.string.ad1),getString(R.string.f1),BitmapFactory.decodeResource(resources,R.drawable.mini1)))

        dogs.add(Dog(getString(R.string.n2),getString(R.string.a2),getString(R.string.s2),getString(
            R.string.d2),getString(R.string.ad2),getString(R.string.f2),BitmapFactory.decodeResource(resources,R.drawable.mini2)))

        dogs.add(
            Dog(getString(R.string.n3),getString(R.string.a3),getString(R.string.s3),getString(R.string.d3),getString(
                R.string.ad3),getString(R.string.f3),BitmapFactory.decodeResource(resources,R.drawable.mini3))
        )
        dogs.add(
            Dog(getString(R.string.n4),getString(R.string.a4),getString(R.string.s4),getString(R.string.d4),getString(
                R.string.ad4),getString(R.string.f4),BitmapFactory.decodeResource(resources,R.drawable.mini4))
        )
        dogs.add(
            Dog(getString(R.string.n5),getString(R.string.a5),getString(R.string.s5),null,null,null,null)
        )
        dogs.add(
            Dog(getString(R.string.n6),getString(R.string.a6),getString(R.string.s6),getString(R.string.d6),getString(
                R.string.ad6),getString(R.string.f6),BitmapFactory.decodeResource(resources,R.drawable.mini5))
        )
        dogs.add(
            Dog(getString(R.string.n1),getString(R.string.a1),getString(R.string.s1),getString(R.string.d1),getString(
                R.string.ad1),getString(R.string.f1),BitmapFactory.decodeResource(resources,R.drawable.mini1)))

        dogs.add(Dog(getString(R.string.n2),getString(R.string.a2),getString(R.string.s2),getString(
            R.string.d2),getString(R.string.ad2),getString(R.string.f2),BitmapFactory.decodeResource(resources,R.drawable.mini2)))

        dogs.add(
            Dog(getString(R.string.n3),getString(R.string.a3),getString(R.string.s3),getString(R.string.d3),getString(
                R.string.ad3),getString(R.string.f3),BitmapFactory.decodeResource(resources,R.drawable.mini3))
        )
        dogs.add(
            Dog(getString(R.string.n4),getString(R.string.a4),getString(R.string.s4),getString(R.string.d4),getString(
                R.string.ad4),getString(R.string.f4),BitmapFactory.decodeResource(resources,R.drawable.mini4))
        )
        dogs.add(
            Dog(getString(R.string.n5),getString(R.string.a5),getString(R.string.s5),null,null,null,null)
        )
        dogs.add(
            Dog(getString(R.string.n6),getString(R.string.a6),getString(R.string.s6),getString(R.string.d6),getString(
                R.string.ad6),getString(R.string.f6),BitmapFactory.decodeResource(resources,R.drawable.mini5))
        )
        dogs.add(
            Dog(getString(R.string.n1),getString(R.string.a1),getString(R.string.s1),getString(R.string.d1),getString(
                R.string.ad1),getString(R.string.f1),BitmapFactory.decodeResource(resources,R.drawable.mini1)))

        dogs.add(Dog(getString(R.string.n2),getString(R.string.a2),getString(R.string.s2),getString(
            R.string.d2),getString(R.string.ad2),getString(R.string.f2),BitmapFactory.decodeResource(resources,R.drawable.mini2)))

        dogs.add(
            Dog(getString(R.string.n3),getString(R.string.a3),getString(R.string.s3),getString(R.string.d3),getString(
                R.string.ad3),getString(R.string.f3),BitmapFactory.decodeResource(resources,R.drawable.mini3))
        )
        dogs.add(
            Dog(getString(R.string.n4),getString(R.string.a4),getString(R.string.s4),getString(R.string.d4),getString(
                R.string.ad4),getString(R.string.f4),BitmapFactory.decodeResource(resources,R.drawable.mini4))
        )
        dogs.add(
            Dog(getString(R.string.n5),getString(R.string.a5),getString(R.string.s5),null,null,null,null)
        )
        dogs.add(
            Dog(getString(R.string.n6),getString(R.string.a6),getString(R.string.s6),getString(R.string.d6),getString(
                R.string.ad6),getString(R.string.f6),BitmapFactory.decodeResource(resources,R.drawable.mini5))
        )



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
            ?.addToBackStack(null)
            ?.replace(R.id.frLayoutDetail,FragmentDetail.newInstance(dogs[index]))?.commit()



    }
}