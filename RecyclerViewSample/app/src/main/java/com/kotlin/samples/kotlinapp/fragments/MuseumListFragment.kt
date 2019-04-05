package com.kotlin.samples.kotlinapp.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.samples.kotlinapp.MuseumDetailsActivity
import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.adapters.MuseumAdapter
import com.kotlin.samples.kotlinapp.data.MuseumData
import com.kotlin.samples.kotlinapp.listeners.AdapterCallback
import com.kotlin.samples.kotlinapp.listeners.OnFragmentInteractionListener
import com.kotlin.samples.kotlinapp.listeners.RecyclerClickListener
import com.kotlin.samples.kotlinapp.listeners.RecyclerTouchListener
import com.kotlin.samples.kotlinapp.model.Museum
import kotlinx.android.synthetic.main.fragment_museum_list.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MuseumListFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MuseumListFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class MuseumListFragment : Fragment() , AdapterCallback{
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    private lateinit var museumAdapter: MuseumAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var museums:List<Museum> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museum_list, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewManager = LinearLayoutManager(context)
        recyclerView.layoutManager=viewManager

        //load museums
        museums= MuseumData.museumList()
        museumAdapter= MuseumAdapter(museums,this)

        recyclerView.adapter=museumAdapter

        //events
        context?.let {
            recyclerView.addOnItemTouchListener(RecyclerTouchListener(
                    it,recyclerView,object: RecyclerClickListener {
                override fun onClick(view: View, position: Int) {
                    val museum= museums[position]
                    goToMuseum(museum)
                }

                override fun onLongClick(view: View, position: Int) {}
            }
            ))
        }
    }

    private fun goToMuseum(museum:Museum){
        val intent= Intent(activity, MuseumDetailsActivity::class.java)
        val bundle= Bundle()
        bundle.putSerializable("MUSEUM",museum)
        intent.putExtras(bundle)

        startActivity(intent)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MuseumListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                MuseumListFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    override fun onItemSelected(museum: Museum) {}
}
