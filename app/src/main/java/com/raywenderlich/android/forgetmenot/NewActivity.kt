package com.raywenderlich.android.forgetmenot

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    companion object {
        val EXTRA_TASK_DESCRIPTION = "task"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
    }

    fun doneClicked(view: View) {
        val taskDescription = description.text.toString()

        if(!taskDescription.isEmpty()) {
            val result = Intent()
            result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription)
            setResult(Activity.RESULT_OK, result)
        } else {
            setResult(Activity.RESULT_CANCELED)
        }
        finish()
    }
}
