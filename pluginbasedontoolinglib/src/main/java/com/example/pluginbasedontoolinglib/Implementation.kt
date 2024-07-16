package com.example.pluginbasedontoolinglib

import com.example.reusableandroidlib.AbstractionFromToolingLib1
import com.example.reusableandroidlib.AbstractionFromToolingLib2
import com.example.reusableandroidlib.NetworkManager
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class Implementation1 : AbstractionFromToolingLib1 {
    override fun function1() {
        println("function1 from Implementation1")
    }

    override fun function2() {
        println("function2 from Implementation2")
    }
}

class Implementation2 : AbstractionFromToolingLib2 {
    override fun function1() {
        println("function1 from Implementation2")
    }

    override fun function2() {
        println("function2 from Implementation2")

        GlobalScope.launch {
            NetworkManager().sendRequest()
        }
    }
}