package se.linerotech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class RedFragment : Fragment() {

    private var button: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_red, container, false)

        val title = arguments?.getString(TITLE) ?: "Red is clicked"

        button = view.findViewById(R.id.buttonRed)
        button?.setOnClickListener {
            Toast.makeText(activity, title, Toast.LENGTH_SHORT).show()
        }

        return view
    }

    companion object {
        private const val TITLE = "title"

        fun instance(title: String): RedFragment {
            val arguments = Bundle()
            arguments.putString(TITLE, title)

            val fragment = RedFragment()
            fragment.arguments = arguments

            return fragment
        }
    }
}
