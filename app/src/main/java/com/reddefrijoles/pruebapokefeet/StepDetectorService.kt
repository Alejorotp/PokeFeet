package com.reddefrijoles.pruebapokefeet

import android.app.Service
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.IBinder
import android.widget.TextView
import android.widget.Toast
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class StepDetectorService : Service(), SensorEventListener {
    private var sensorManager: SensorManager? = null
    private var stepDetectorSensor: Sensor? = null
    private var steps = 0

    override fun onCreate() {
        super.onCreate()
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        stepDetectorSensor = sensorManager!!.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR)
        steps = prefs.getSteps()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        sensorManager!!.registerListener(
            this,
            stepDetectorSensor,
            SensorManager.SENSOR_DELAY_FASTEST
        )
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        sensorManager!!.unregisterListener(this)
        prefs.saveActivated(false)
    }

    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {
        // Do nothing
    }

    override fun onSensorChanged(event: SensorEvent) {
        steps = prefs.getSteps()
        steps++
        prefs.saveSteps(steps)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}