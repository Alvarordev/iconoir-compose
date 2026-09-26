package io.github.alvarordev.iconoir.compose

import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.solid.Heart
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class IconoirTest {
    @Test
    fun vectorIsCachedAndHasExpectedViewport() {
        val bell = Iconoir.Regular.Bell
        assertSame(bell, Iconoir.Regular.Bell)
        assertEquals(24f, bell.viewportWidth)
        assertEquals(24f, bell.viewportHeight)
        assertSame(Iconoir.Solid.Heart, Iconoir.Solid.Heart)
    }
}
