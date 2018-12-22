package com.hermit.linechartdemo

import tw.hermitlin.linechart.spec.ChartData

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2012-2018 by Hermit Lin. All rights reserved.
 * -----------------------------------------------------------------
 *
 * File: DemoChartData.kt
 * Author: Hermit Lin (hermitnull@gmail.com)
 * Version: V0.0.1 2018/12/7
 * Create: 2018/12/7 下午 04:03
 *
 * -----------------------------------------------------------------
 * Release note:
 * V0.0.1 2018/12/7 (Hermit Lin)
 * 1.Create DemoChartData.kt
 * -----------------------------------------------------------------
 * Description:
 *
 */
data class DemoChartData(val x: Float, val y: Float): ChartData {

    override fun getHorizontalAxisValue(): Float {
        return x
    }

    override fun getVerticalAxisValue(): Float {
        return y
    }

    override fun getLabel(): String {
        return "(${getHorizontalAxisValue()},${getVerticalAxisValue()})"
    }
}