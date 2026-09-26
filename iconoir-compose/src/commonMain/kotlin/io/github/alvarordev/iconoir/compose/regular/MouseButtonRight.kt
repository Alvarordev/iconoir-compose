// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/mouse-button-right.svg. Do not edit.
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

public val Iconoir.Regular.MouseButtonRight: ImageVector
    get() = mousebuttonrightVector.value

private object mousebuttonrightVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/mouse-button-right", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4f, 10f),
                PathNode.VerticalTo(14f),
                PathNode.CurveTo(4f, 18.4183f, 7.58172f, 22f, 12f, 22f),
                PathNode.CurveTo(16.4183f, 22f, 20f, 18.4183f, 20f, 14f),
                PathNode.VerticalTo(9f),
                PathNode.CurveTo(20f, 5.13401f, 16.866f, 2f, 13f, 2f),
                PathNode.HorizontalTo(12f),
                PathNode.CurveTo(7.58172f, 2f, 4f, 5.58172f, 4f, 10f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 2f),
                PathNode.VerticalTo(8.4f),
                PathNode.CurveTo(12f, 8.73137f, 12.2686f, 9f, 12.6f, 9f),
                PathNode.HorizontalTo(20f),
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
