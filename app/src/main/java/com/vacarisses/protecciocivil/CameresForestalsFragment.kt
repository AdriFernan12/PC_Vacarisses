package com.vacarisses.protecciocivil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import kotlinx.android.synthetic.main.fragment_cameres_forestals.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CameresForestalsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CameresForestalsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cameres_forestals, container, false)

       /* val webViewCameres: WebView = view.findViewById(R.id.webview1)
        webViewCameres.loadUrl("https://vigilant.cat/app?selected_cities[]=ccddbdbc-c881-4a72-bad5-4c67bac3e128&selected_dashboard=576ab78f-7c3e-4de0-accd-23d0125614d3") */

        return inflater.inflate(R.layout.fragment_cameres_forestals, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CameresForestalsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CameresForestalsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}