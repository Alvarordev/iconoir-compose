package io.github.alvarordev.iconoir.compose

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorPath
import io.github.alvarordev.iconoir.compose.regular.NetworkLeft
import io.github.alvarordev.iconoir.compose.regular.StyleBorder
import io.github.alvarordev.iconoir.compose.regular.Wallet
import io.github.alvarordev.iconoir.compose.regular.Wristwatch
import io.github.alvarordev.iconoir.compose.solid.DotsGrid3x3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class VectorGeometryTest {
    @Test
    fun concurrentFirstAccessPublishesOneVector() {
        val output = arrayOfNulls<Any>(16)
        val threads = output.indices.map { index -> Thread { output[index] = Iconoir.Regular.Wallet } }
        threads.forEach(Thread::start)
        threads.forEach(Thread::join)
        output.forEach { assertSame(output[0], it) }
    }

    @Test
    fun sourceSpecialCasesRemainRepresented() {
        val dotPath = Iconoir.Solid.DotsGrid3x3.root[0] as VectorPath
        assertEquals(PathFillType.EvenOdd, dotPath.pathFillType)
        assertTrue(dotPath.pathData.size > 30) // 9 transparent holes plus base contour

        val transformedRect = Iconoir.Regular.NetworkLeft.root[0] as VectorGroup
        assertEquals(-90f, transformedRect.rotation)
        val dashPath = Iconoir.Regular.StyleBorder.root[0] as VectorPath
        assertTrue(dashPath.pathData.size > 20) // pre-segmented stroke, not a continuous outline
    }

    @Test
    fun reportColdAndCachedAccessCost() {
        // Diagnostics, not a timing assertion: CI machines vary widely.
        val coldStart = System.nanoTime()
        val vector = Iconoir.Regular.Wristwatch
        val coldNs = System.nanoTime() - coldStart
        val repeats = 100_000
        val warmStart = System.nanoTime()
        repeat(repeats) { assertSame(vector, Iconoir.Regular.Wristwatch) }
        val averageWarmNs = (System.nanoTime() - warmStart) / repeats
        println("Vector access: first=$coldNs ns, cached average=$averageWarmNs ns (JVM, $repeats calls)")
    }
}
