// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/map-pin-minus.svg. Do not edit.
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

public val Iconoir.Regular.MapPinMinus: ImageVector
    get() = mappinminusVector.value

private object mappinminusVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/map-pin-minus", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 9.2f),
                PathNode.CurveTo(16f, 13.1765f, 9f, 20f, 9f, 20f),
                PathNode.CurveTo(9f, 20f, 2f, 13.1765f, 2f, 9.2f),
                PathNode.CurveTo(2f, 5.22355f, 5.13401f, 2f, 9f, 2f),
                PathNode.CurveTo(12.866f, 2f, 16f, 5.22355f, 16f, 9.2f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 19f),
                PathNode.LineTo(22f, 19f),
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
                PathNode.MoveTo(9f, 10f),
                PathNode.CurveTo(9.55228f, 10f, 10f, 9.55228f, 10f, 9f),
                PathNode.CurveTo(10f, 8.44772f, 9.55228f, 8f, 9f, 8f),
                PathNode.CurveTo(8.44772f, 8f, 8f, 8.44772f, 8f, 9f),
                PathNode.CurveTo(8f, 9.55228f, 8.44772f, 10f, 9f, 10f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
