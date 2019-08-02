package info.nightscout.androidaps.database.daos

import info.nightscout.androidaps.database.entities.BolusCalculatorResult

class BolusCalculatorResultDaoTest : AbstractDaoTest<BolusCalculatorResult>() {

    override fun copy(entry: BolusCalculatorResult) = entry.copy()

    override fun getDao() = database.bolusCalculatorResultDao

    override fun generateTestEntry() = BolusCalculatorResult(
            timestamp = 0,
            utcOffset = 0,
            targetBGLow = 100.0,
            targetBGHigh = 100.0,
            isf = 50.0,
            ic = 10.0,
            bolusIOB = 10.0,
            bolusIOBUsed = true,
            basalIOB = 5.0,
            basalIOBUsed = true,
            glucoseValue = 130.0,
            glucoseDifference = 30.0,
            glucoseUsed = true,
            glucoseInsulin = 0.6,
            glucoseTrend = 10.0,
            trendUsed = true,
            trendInsulin = 0.2,
            cob = 40.0,
            cobUsed = true,
            cobInsulin = 4.0,
            carbs = 50.0,
            carbsUsed = true,
            carbsInsulin = 50.0,
            otherCorrection = 5.0,
            superbolusInsulin = 2.5,
            superbolusUsed = true,
            tempTargetUsed = true,
            totalInsulin = 13.33
    )

}