package com.vacarisses.protecciocivil

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_vehicles.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [VehiclesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VehiclesFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_vehicles, container, false)
        var isFABOpen = false
        // importamos datos desde el mainactivity


        //botones información
        view.infoA21Button.setOnClickListener {
            val intent = Intent(activity, PopUpInfo::class.java)
            intent.putExtra("popupVehicle", "A21")
            requireActivity().startActivity(intent)
        }

        view.infoA22Button.setOnClickListener {
            val intent = Intent(activity, PopUpInfo::class.java)
            intent.putExtra("popupVehicle", "A22")
            requireActivity().startActivity(intent)
        }

        view.infoA23Button.setOnClickListener {
            val intent = Intent(activity, PopUpInfo::class.java)
            intent.putExtra("popupVehicle", "A23")
            requireActivity().startActivity(intent)
        }

        view.infoA24Button.setOnClickListener {
            val intent = Intent(activity, PopUpInfo::class.java)
            intent.putExtra("popupVehicle", "A24")
            requireActivity().startActivity(intent)
        }

        //botones kilometraje
        view.kilometratgea21btn.setOnClickListener {
            val intent = Intent(activity, PopUpDataKilometratge::class.java)
            intent.putExtra("popupVehicle", "A21")
            requireActivity().startActivity(intent)
        }

        view.kilometratgea22btn.setOnClickListener {
            val intent = Intent(activity, PopUpDataKilometratge::class.java)
            intent.putExtra("popupVehicle", "A22")
            requireActivity().startActivity(intent)
        }

        view.kilometratgea23btn.setOnClickListener {
            val intent = Intent(activity, PopUpDataKilometratge::class.java)
            intent.putExtra("popupVehicle", "A23")
            requireActivity().startActivity(intent)
        }

        view.kilometratgea24btn.setOnClickListener {
            val intent = Intent(activity, PopUpDataKilometratge::class.java)
            intent.putExtra("popupVehicle", "A24")
            requireActivity().startActivity(intent)
        }

        //botones manteniment
        view.mantenimentA21btn.setOnClickListener {
           /* val intent = Intent(activity, PopUpDataManteniment::class.java)
            intent.putExtra("popupVehicle", "A21")
            requireActivity().startActivity(intent) */
            toastManteniment()
        }

        view.mantenimentA22btn.setOnClickListener {
           /* val intent = Intent(activity, PopUpDataManteniment::class.java)
            intent.putExtra("popupVehicle", "A22")
            requireActivity().startActivity(intent) */
            toastManteniment()
        }

        view.mantenimentA23btn.setOnClickListener {
            /* val intent = Intent(activity, PopUpDataManteniment::class.java)
            intent.putExtra("popupVehicle", "A23")
            requireActivity().startActivity(intent) */
            toastManteniment()
        }

        view.mantenimentA24btn.setOnClickListener {
           /* val intent = Intent(activity, PopUpDataManteniment::class.java)
            intent.putExtra("popupVehicle", "A24")
            requireActivity().startActivity(intent) */
            toastManteniment()
        }



        return view
    }

    private fun toastManteniment(){
        Toast.makeText(requireContext(), "Funció en desenvolupament", Toast.LENGTH_SHORT).show()
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment VehiclesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VehiclesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}