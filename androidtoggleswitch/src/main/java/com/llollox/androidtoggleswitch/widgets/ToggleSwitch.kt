package com.llollox.androidtoggleswitch.widgets

import android.content.Context
import android.util.AttributeSet

class ToggleSwitch(context: Context, attrs: AttributeSet?) : BaseToggleSwitch(context, attrs) {

    interface OnChangeListener {
        fun onToggleSwitchChanged(position: Int)
    }

    var checkedPosition: Int? = null
    var onChangeListener : OnChangeListener? = null


    override fun onRedrawn() {
        if (checkedPosition != null) {
            val currentToggleSwitch = buttons[checkedPosition!!]
            currentToggleSwitch.check()
            currentToggleSwitch.isClickable = false
        }
        manageSeparatorVisiblity()
    }

    override fun onToggleSwitchClicked(button: ToggleSwitchButton) {

        if (!button.isChecked && isEnabled) {
            if (checkedPosition != null) {
                buttons[checkedPosition!!].uncheck()
            }

            checkedPosition = buttons.indexOf(button)

            button.check()

            manageSeparatorVisiblity()

            onChangeListener?.onToggleSwitchChanged(checkedPosition!!)
        }
    }

    fun setCheckedPosition(checkedPosition: Int) {
        this.checkedPosition = checkedPosition
        for ((index, toggleSwitchButton) in buttons.withIndex()) {
            if (checkedPosition == index) {
                toggleSwitchButton.check()
            }
            else {
                toggleSwitchButton.uncheck()
            }
        }
        manageSeparatorVisiblity()
    }
}
