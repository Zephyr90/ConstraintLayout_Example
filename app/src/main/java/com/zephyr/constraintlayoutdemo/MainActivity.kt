package com.zephyr.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.constraintlayout.widget.ConstraintLayout
import com.zephyr.constraintlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        explain(binding)
    }

    private fun explain(binding: ActivityMainBinding) {
        binding.ibBaseline.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(BASELINE_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibAngleLocation.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(CIRCLE_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.cbGoneMarginSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.tvGoneState.text = "VISIBLE"
                binding.tvGoneView.visibility = View.VISIBLE
            } else {
                binding.tvGoneState.text = "GONE"
                binding.tvGoneView.visibility = View.GONE
            }
        }
        binding.ibGoneMargin.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(GONE_MARGIN_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibBias.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(CONSTRAINT_HORIZONTAL_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibMatchConstraint.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(CONSTRAINT_HORIZONTAL_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibRatio.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(DIMENSION_RATIO)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibChain.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(CHAIN_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibWeight.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(WEIGHT_CHAIN_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibBarrier.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(BARRIER_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.btnUpdateVisibility.setOnClickListener {
            val visibility = binding.group.visibility
            if (visibility == View.VISIBLE) {
                binding.group.visibility = View.GONE
                binding.btnUpdateVisibility.text = "GONE"
            } else {
                binding.group.visibility = View.VISIBLE
                binding.btnUpdateVisibility.text = "VISIBLE"
            }
        }
        binding.ibGroup.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(GROUP_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }

        binding.placeholder.setContentId(R.id.tv_placeholder)
        binding.btnPlaceholder.setOnClickListener {
            if (binding.placeholder.content == binding.tvPlaceholder)
                binding.placeholder.setContentId(R.id.iv_placeholder)
            else
                binding.placeholder.setContentId(R.id.tv_placeholder)
        }
        binding.ibPlaceholder.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(PLACEHOLDER_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }
        binding.ibGuideline.setOnClickListener {
            val dialogFragment = ExplainDialogFragment.newInstance(GUIDELINE_EXPLAIN)
            dialogFragment.show(supportFragmentManager, "dialog")
        }

    }
}