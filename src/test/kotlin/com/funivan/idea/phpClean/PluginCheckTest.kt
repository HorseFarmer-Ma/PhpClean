package com.funivan.idea.phpClean

import com.funivan.idea.phpClean.spl.ci.AllInspections
import com.funivan.idea.phpClean.spl.ci.ShortDescription
import junit.framework.Assert


class PluginCheckTest : BaseInspectionTest() {

    fun testAllInReadme() {
        for (inspection in AllInspections().all()) {
            val value = ShortDescription(inspection).value()
            Assert.assertTrue(
                    "Inspection ${inspection.shortName} description should have main section",
                    value !== ""
            )
        }
    }
}