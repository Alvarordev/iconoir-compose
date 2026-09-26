// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/clock.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Solid.Clock: ImageVector
    get() = clockVector.value

private object clockVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/clock", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 1.25f),
                PathNode.CurveTo(6.06294f, 1.25f, 1.25f, 6.06294f, 1.25f, 12f),
                PathNode.CurveTo(1.25f, 17.9371f, 6.06294f, 22.75f, 12f, 22.75f),
                PathNode.CurveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12f),
                PathNode.CurveTo(22.75f, 6.06294f, 17.9371f, 1.25f, 12f, 1.25f),
                PathNode.Close,
                PathNode.MoveTo(12.75f, 6f),
                PathNode.CurveTo(12.75f, 5.58579f, 12.4142f, 5.25f, 12f, 5.25f),
                PathNode.CurveTo(11.5858f, 5.25f, 11.25f, 5.58579f, 11.25f, 6f),
                PathNode.LineTo(11.25f, 12f),
                PathNode.CurveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12f, 12.75f),
                PathNode.HorizontalTo(18f),
                PathNode.CurveTo(18.4142f, 12.75f, 18.75f, 12.4142f, 18.75f, 12f),
                PathNode.CurveTo(18.75f, 11.5858f, 18.4142f, 11.25f, 18f, 11.25f),
                PathNode.HorizontalTo(12.75f),
                PathNode.LineTo(12.75f, 6f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
