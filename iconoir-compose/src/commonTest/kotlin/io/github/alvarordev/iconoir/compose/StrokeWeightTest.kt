package io.github.alvarordev.iconoir.compose

import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorPath
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.regular.Frame
import io.github.alvarordev.iconoir.compose.regular.GasTank
import io.github.alvarordev.iconoir.compose.regular.NetworkLeft
import io.github.alvarordev.iconoir.compose.regular.StyleBorder
import io.github.alvarordev.iconoir.compose.solid.Heart
import io.github.alvarordev.iconoir.compose.solid.NetworkRight
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame
import kotlin.test.assertSame
import kotlin.test.assertTrue

class StrokeWeightTest {
    @Test
    fun defaultWeightReusesOriginalAndCustomWeightDoesNotModifyIt() {
        val bell = Iconoir.Regular.Bell
        assertSame(bell, bell.withStrokeWeight(1.5f))

        val thick = bell.withStrokeWeight(2f)
        assertNotSame(bell, thick)
        assertEquals(1.5f, (bell.root[0] as VectorPath).strokeLineWidth)
        assertEquals(2f, (thick.root[0] as VectorPath).strokeLineWidth)
        assertEquals(bell.name, thick.name)
        assertEquals(bell.defaultWidth, thick.defaultWidth)
        assertEquals(bell.viewportWidth, thick.viewportWidth)
        assertEquals(bell.autoMirror, thick.autoMirror)
        assertEquals((bell.root[0] as VectorPath).pathData, (thick.root[0] as VectorPath).pathData)
    }

    @Test
    fun scalesNonstandardStrokeWidthsAndPreservesDashGeometry() {
        val frame = Iconoir.Regular.Frame
        val original = frame.root.filterIsInstance<VectorPath>().first { it.strokeLineWidth == 1.2195f }
        val adjusted = frame.withStrokeWeight(3f).root.filterIsInstance<VectorPath>()
            .first { it.pathData == original.pathData }
        assertEquals(1.2195f * 2f, adjusted.strokeLineWidth)

        val dashed = Iconoir.Regular.StyleBorder.root[0] as VectorPath
        val adjustedDash = Iconoir.Regular.StyleBorder.withStrokeWeight(1f).root[0] as VectorPath
        assertEquals(dashed.pathData, adjustedDash.pathData)
        assertEquals(dashed.strokeLineCap, adjustedDash.strokeLineCap)
        assertEquals(dashed.strokeLineJoin, adjustedDash.strokeLineJoin)
        assertEquals(dashed.strokeLineWidth / 1.5f, adjustedDash.strokeLineWidth)
    }

    @Test
    fun preservesGroupTransformsAndFillsWhileChangingActualStrokes() {
        val originalGroup = Iconoir.Regular.NetworkLeft.root[0] as VectorGroup
        val adjustedGroup = Iconoir.Regular.NetworkLeft.withStrokeWeight(2f).root[0] as VectorGroup
        assertEquals(originalGroup.rotation, adjustedGroup.rotation)
        assertEquals(originalGroup.pivotX, adjustedGroup.pivotX)
        assertEquals(originalGroup.clipPathData, adjustedGroup.clipPathData)
        assertEquals(2f, (adjustedGroup[0] as VectorPath).strokeLineWidth)

        val solid = Iconoir.Solid.Heart
        assertSame(solid, solid.withStrokeWeight(2f)) // No stroke to adjust

        val mixed = Iconoir.Solid.NetworkRight
        val mixedAdjusted = mixed.withStrokeWeight(2f)
        val sourcePath = (mixed.root[0] as VectorGroup)[0] as VectorPath
        val changedPath = (mixedAdjusted.root[0] as VectorGroup)[0] as VectorPath
        assertEquals(sourcePath.fill, changedPath.fill)
        assertEquals(sourcePath.pathFillType, changedPath.pathFillType)
        assertEquals(2f, changedPath.strokeLineWidth)
    }

    @Test
    fun preservesVectorAndPathMetadata() {
        val clip = listOf(PathNode.MoveTo(0f, 0f), PathNode.LineTo(24f, 24f), PathNode.Close)
        val original = ImageVector.Builder(
            name = "test/icon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            tintColor = Color.Red,
            tintBlendMode = BlendMode.SrcOver,
            autoMirror = true,
        ).apply {
            addGroup(name = "shifted", translationX = 2f, scaleY = -1f, clipPathData = clip)
            addPath(
                name = "detail",
                pathData = listOf(PathNode.MoveTo(1f, 2f), PathNode.LineTo(3f, 4f)),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color.Blue),
                fillAlpha = 0.8f,
                stroke = SolidColor(Color.Red),
                strokeAlpha = 0.7f,
                strokeLineWidth = 1.5f,
                trimPathStart = 0.2f,
                trimPathEnd = 0.9f,
                trimPathOffset = 0.1f,
            )
            clearGroup()
        }.build()

        val adjusted = original.withStrokeWeight(2f)
        assertEquals(original.name, adjusted.name)
        assertEquals(original.tintColor, adjusted.tintColor)
        assertEquals(original.tintBlendMode, adjusted.tintBlendMode)
        assertEquals(original.autoMirror, adjusted.autoMirror)
        val group = adjusted.root[0] as VectorGroup
        assertEquals(clip, group.clipPathData)
        assertEquals(-1f, group.scaleY)
        assertEquals(2f, group.translationX)
        val path = group[0] as VectorPath
        assertEquals("detail", path.name)
        assertEquals(PathFillType.EvenOdd, path.pathFillType)
        assertEquals(SolidColor(Color.Blue), path.fill)
        assertEquals(0.8f, path.fillAlpha)
        assertEquals(0.7f, path.strokeAlpha)
        assertEquals(0.2f, path.trimPathStart)
        assertEquals(0.9f, path.trimPathEnd)
        assertEquals(0.1f, path.trimPathOffset)
        assertEquals(2f, path.strokeLineWidth)
    }

    @Test
    fun rejectsInvalidWeights() {
        for (weight in listOf(0f, -1f, Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY)) {
            assertFailsWith<IllegalArgumentException> { Iconoir.Regular.Bell.withStrokeWeight(weight) }
        }
        assertFailsWith<IllegalArgumentException> {
            Iconoir.Regular.GasTank.withStrokeWeight(Float.MAX_VALUE)
        }
        assertTrue(Iconoir.Regular.Bell.withStrokeWeight(0.5f).root.size > 0)
    }
}
