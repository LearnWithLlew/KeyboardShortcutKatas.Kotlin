package org.learnwithllew.keyboardshortcutskata

import java.util.function.Supplier




class Inline {
    var e = 2

    fun practice(): Int {
        val i = 2
        val a = 5
        val s = 2 - i
        val j = b() - a + i
        val m = f(3)
        var t = 0
        if (n()) {
            t += 56
        }
        val k = Supplier {
            val l = m + j
            l - c(e)
        }
        val q = 1 - O.create().p
        return 42 + k.get() + q + Extensions.h(7) + s + t
    }

    private fun n(): Boolean {
        return false
    }

    private fun f(g: Int): Int {
        return -3 + g
    }

    private fun c(d: Int): Int {
        return d
    }

    private fun b(): Int {
        return 5
    }

    object Extensions {
        fun h(that: Int): Int {
            return that - 7
        }
    }

    class O {
        var p = 1

        companion object {
            fun create(): O {
                return O()
            }
        }
    }
}
