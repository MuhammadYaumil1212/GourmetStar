package yr.muhammadyaumil.gourmetstar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import yr.muhammadyaumil.gourmetstar.databinding.FragmentUserPersonalizationBinding

class UserPersonalizationFragment : Fragment() {
    private var _binding: FragmentUserPersonalizationBinding? = null
        private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserPersonalizationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}