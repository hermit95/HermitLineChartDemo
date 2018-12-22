package com.hermit.linechartdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demoLineData = ArrayList<DemoChartData>()
        demoLineData.add(DemoChartData(0f, 0f))
        demoLineData.add(DemoChartData(100f, 30f))
        demoLineData.add(DemoChartData(500f, 100f))
        demoLineData.add(DemoChartData(800f, 140f))
        demoLineData.add(DemoChartData(950f, 90f))
        demoLineData.add(DemoChartData(1200f, 115f))
        demoLineData.add(DemoChartData(1500f, 150f))

        hcvContent.addLineData(demoLineData, "Demo")

        val demoLineData2 = ArrayList<DemoChartData>()
        demoLineData2.add(DemoChartData(0f, 0f))
        demoLineData2.add(DemoChartData(150f, 120f))
        demoLineData2.add(DemoChartData(350f, 70f))
        demoLineData2.add(DemoChartData(700f, 23f))
        demoLineData2.add(DemoChartData(1050f, 133f))
        demoLineData2.add(DemoChartData(1400f, 90f))
        demoLineData2.add(DemoChartData(1500f, 130f))

        hcvContent.addLineData(demoLineData2, "Demo2")

        //TODO: 2018/12/7  測試
//        hcvContent.setGirdScaleVisible(false)
//        hcvContent.setAxisVisible(false)
//        hcvContent.setLabelVisible(false)
//        hcvContent.setPointVisible(false)
        hcvContent.setAxisLabelVisible(false)// 其實應該要對其做空間寬度的縮放
    }
}
