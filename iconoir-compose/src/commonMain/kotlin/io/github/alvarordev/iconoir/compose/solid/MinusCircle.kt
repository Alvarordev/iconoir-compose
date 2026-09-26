// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/minus-circle.svg. Do not edit.
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

public val Iconoir.Solid.MinusCircle: ImageVector
    get() = minuscircleVector.value

private object minuscircleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/minus-circle", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 1.25f),
                PathNode.CurveTo(6.06294f, 1.25f, 1.25f, 6.06294f, 1.25f, 12f),
                PathNode.CurveTo(1.25f, 17.9371f, 6.06294f, 22.75f, 12f, 22.75f),
                PathNode.CurveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12f),
                PathNode.CurveTo(22.75f, 6.06294f, 17.9371f, 1.25f, 12f, 1.25f),
                PathNode.Close,
                PathNode.MoveTo(8f, 11.25f),
                PathNode.CurveTo(7.58579f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f),
                PathNode.CurveTo(7.25f, 12.4142f, 7.58579f, 12.75f, 8f, 12.75f),
                PathNode.HorizontalTo(16f),
                PathNode.CurveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f),
                PathNode.CurveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f),
                PathNode.HorizontalTo(8f),
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
