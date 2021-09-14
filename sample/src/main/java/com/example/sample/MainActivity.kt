package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sample.databinding.ActivityMainBinding
import com.gomagustavo.logger.AndroidLogger
import com.gomagustavo.logger.isLoggerRegistered
import com.gomagustavo.logger.ktx.logd
import com.gomagustavo.logger.registerLogger
import com.gomagustavo.logger.unregisterLogger

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogDebug.setOnClickListener {
            logd("Testing debug log")
        }

        binding.buttonLogDebugLocally.setOnClickListener {
            logd("Testing debug log locally", locallyOnly = true)
        }

        with(AndroidLogger) {
            binding.switchAndroidLogger.isChecked = isLoggerRegistered(this)
            binding.switchAndroidLogger.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) registerLogger(this) else unregisterLogger(this)
            }
        }

        with(PrintLogger) {
            binding.switchPrintLogger.isChecked = isLoggerRegistered(this)
            binding.switchPrintLogger.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) registerLogger(this) else unregisterLogger(this)
            }
        }

        with(ToastLogger(this)) {
            binding.switchToastLogger.isChecked = isLoggerRegistered(this)
            binding.switchToastLogger.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) registerLogger(this) else unregisterLogger(this)
            }
        }

        with(RemoteLogger(this)) {
            binding.switchRemoteLogger.isChecked = isLoggerRegistered(this)
            binding.switchRemoteLogger.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) registerLogger(this) else unregisterLogger(this)
            }
        }
    }
}