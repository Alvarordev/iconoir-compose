// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/mouse-button-left.svg. Do not edit.
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

public val Iconoir.Regular.MouseButtonLeft: ImageVector
    get() = mousebuttonleftVector.value

private object mousebuttonleftVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/mouse-button-left", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20f, 10f),
                PathNode.VerticalTo(14f),
                PathNode.CurveTo(20f, 18.4183f, 16.4183f, 22f, 12f, 22f),
                PathNode.CurveTo(7.58172f, 22f, 4f, 18.4183f, 4f, 14f),
                PathNode.VerticalTo(9f),
                PathNode.CurveTo(4f, 5.13401f, 7.13401f, 2f, 11f, 2f),
                PathNode.HorizontalTo(12f),
                PathNode.CurveTo(16.4183f, 2f, 20f, 5.58172f, 20f, 10f),
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
                PathNode.CurveTo(12f, 8.73137f, 11.7314f, 9f, 11.4f, 9f),
                PathNode.HorizontalTo(4f),
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
