// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/map-pin.svg. Do not edit.
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

public val Iconoir.Regular.MapPin: ImageVector
    get() = mappinVector.value

private object mappinVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/map-pin", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20f, 10f),
                PathNode.CurveTo(20f, 14.4183f, 12f, 22f, 12f, 22f),
                PathNode.CurveTo(12f, 22f, 4f, 14.4183f, 4f, 10f),
                PathNode.CurveTo(4f, 5.58172f, 7.58172f, 2f, 12f, 2f),
                PathNode.CurveTo(16.4183f, 2f, 20f, 5.58172f, 20f, 10f),
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
                PathNode.MoveTo(12f, 11f),
                PathNode.CurveTo(12.5523f, 11f, 13f, 10.5523f, 13f, 10f),
                PathNode.CurveTo(13f, 9.44772f, 12.5523f, 9f, 12f, 9f),
                PathNode.CurveTo(11.4477f, 9f, 11f, 9.44772f, 11f, 10f),
                PathNode.CurveTo(11f, 10.5523f, 11.4477f, 11f, 12f, 11f),
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
