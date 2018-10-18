package com.funivan.idea.phpClean.inspections.architecture.methodVisibility

import com.funivan.idea.phpClean.BaseInspectionTest

class MethodVisibilityInspectionTest : BaseInspectionTest() {

    fun testProtectedMethod() {
        assert(
                MethodVisibilityInspection(),
                """<?php
                class User {
                  protected function <weak_warning descr="Do not write protected methods. Only public or private">name</weak_warning>() : string {}
                  public function id() : string {}
                  private function login() : string {}
                }
                """
        )
    }
}
