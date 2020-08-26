package com.emedinaa.samples.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.layout_vegetables.*
import kotlinx.android.synthetic.main.layout_vegetables.recyclerView

/**
 * @author : Eduardo Medina
 */
class BottomSBehaviorActivity : AppCompatActivity() {

    private lateinit var behavior: BottomSheetBehavior<*>
    private lateinit var vegetableAdapter: VegetableAdapter

    private fun setupUi() {
        behavior = BottomSheetBehavior.from(layout_bottom)
        vegetableAdapter =
            VegetableAdapter(
                VegetablesData.vegetableList()
            )
        recyclerView.adapter = vegetableAdapter

        behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {}

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        // "Collapsed".also(::toast)
                    }

                    BottomSheetBehavior.STATE_EXPANDED -> {
                        // "Expanded".also(::toast)
                    }
                }
            }

        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottoms_behavior)

        setupUi()
    }
}
