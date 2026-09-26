// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/airplay.svg. Do not edit.
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

public val Iconoir.Solid.Airplay: ImageVector
    get() = airplayVector.value

private object airplayVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/airplay", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(6f, 17f),
                PathNode.LineTo(3f, 17f),
                PathNode.LineTo(3f, 4f),
                PathNode.LineTo(21f, 4f),
                PathNode.LineTo(21f, 17f),
                PathNode.LineTo(18f, 17f),
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
                PathNode.MoveTo(8.62188f, 19.0672f),
                PathNode.LineTo(11.5008f, 14.7488f),
                PathNode.CurveTo(11.7383f, 14.3926f, 12.2617f, 14.3926f, 12.4992f, 14.7488f),
                PathNode.LineTo(15.3781f, 19.0672f),
                PathNode.CurveTo(15.6439f, 19.4659f, 15.3581f, 20f, 14.8789f, 20f),
                PathNode.HorizontalTo(9.12111f),
                PathNode.CurveTo(8.64189f, 20f, 8.35606f, 19.4659f, 8.62188f, 19.0672f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
