// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/parking.svg. Do not edit.
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

public val Iconoir.Regular.Parking: ImageVector
    get() = parkingVector.value

private object parkingVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/parking", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(10f, 15.5f),
                PathNode.VerticalTo(12.7f),
                PathNode.MoveTo(10f, 12.7f),
                PathNode.CurveTo(10.4762f, 12.7f, 11.7143f, 12.7f, 12.8571f, 12.7f),
                PathNode.CurveTo(13.5714f, 12.7f, 15f, 12.7f, 15f, 10.6f),
                PathNode.CurveTo(15f, 8.5f, 13.5714f, 8.5f, 12.8571f, 8.5f),
                PathNode.LineTo(10f, 8.5f),
                PathNode.VerticalTo(12.7f),
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
                PathNode.MoveTo(22f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 2f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 22f, 12f),
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
        }.build()
    }
}
