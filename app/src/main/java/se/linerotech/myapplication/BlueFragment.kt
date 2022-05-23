package se.linerotech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class BlueFragment : Fragment() {

    private var button: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blue, container, false)

        button = view.findViewById(R.id.buttonBlue)
        button?.setOnClickListener {
            Toast.makeText(activity, "Blue is clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
