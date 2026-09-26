// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/spades.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Regular.Spades: ImageVector
    get() = spadesVector.value

private object spadesVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/spades", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 14.5f),
                PathNode.CurveTo(15f, 19f, 21f, 18.9706f, 21f, 14f),
                PathNode.CurveTo(21f, 10f, 17f, 7f, 12f, 2f),
                PathNode.CurveTo(7f, 7f, 3f, 10f, 3f, 14f),
                PathNode.CurveTo(3f, 18.9706f, 9f, 19f, 12f, 14.5f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.4706f, 15.4926f),
                PathNode.LineTo(8.47059f, 21.1176f),
                PathNode.CurveTo(8.25743f, 21.5173f, 8.54705f, 22f, 9f, 22f),
                PathNode.HorizontalTo(15f),
                PathNode.CurveTo(15.453f, 22f, 15.7426f, 21.5173f, 15.5294f, 21.1176f),
                PathNode.LineTo(12.5294f, 15.4926f),
                PathNode.CurveTo(12.3035f, 15.0691f, 11.6965f, 15.0691f, 11.4706f, 15.4926f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
