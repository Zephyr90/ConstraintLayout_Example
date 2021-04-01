package com.zephyr.constraintlayoutdemo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.zephyr.constraintlayoutdemo.databinding.FragmentExplainBinding


/**
 * created by zephyr on 3/31/21 10 : 32
 *
 */
class ExplainDialogFragment private constructor() : DialogFragment() {
    companion object {
        private const val CONTENT = "explain_content"

        fun newInstance(content: String): ExplainDialogFragment {
            val fragment = ExplainDialogFragment()
            val bundle = Bundle()
            bundle.putString(CONTENT, content)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.setCanceledOnTouchOutside(true)
        val binding = FragmentExplainBinding.inflate(layoutInflater, container, false)
        initView(binding)
        return binding.root
    }

    private fun initView(binding: FragmentExplainBinding) {
        binding.tvContent.text = arguments?.getString(CONTENT)
    }

    override fun onResume() {
        val size = getDisplaySize()
        val width = size[0]
        val height = size[1]
        dialog!!.window!!.apply {
//            setLayout((width * 0.75).toInt(), (height * 0.6).toInt())
            setLayout((width * 0.75).toInt(), ViewGroup.LayoutParams.WRAP_CONTENT)
            setDimAmount(0.0f)
        }

        super.onResume()
    }


    fun getDisplaySize(): IntArray {
        val size = IntArray(2)
        val dm = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(dm)
        size[0] = dm.widthPixels
        size[1] = dm.heightPixels
        return size
    }

}