// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/switch-on.svg. Do not edit.
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

public val Iconoir.Regular.SwitchOn: ImageVector
    get() = switchonVector.value

private object switchonVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/switch-on", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(17f, 13f),
                PathNode.CurveTo(17.5523f, 13f, 18f, 12.5523f, 18f, 12f),
                PathNode.CurveTo(18f, 11.4477f, 17.5523f, 11f, 17f, 11f),
                PathNode.CurveTo(16.4477f, 11f, 16f, 11.4477f, 16f, 12f),
                PathNode.CurveTo(16f, 12.5523f, 16.4477f, 13f, 17f, 13f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(17f, 17f),
                PathNode.HorizontalTo(7f),
                PathNode.CurveTo(4.23858f, 17f, 2f, 14.7614f, 2f, 12f),
                PathNode.CurveTo(2f, 9.23858f, 4.23858f, 7f, 7f, 7f),
                PathNode.HorizontalTo(17f),
                PathNode.CurveTo(19.7614f, 7f, 22f, 9.23858f, 22f, 12f),
                PathNode.CurveTo(22f, 14.7614f, 19.7614f, 17f, 17f, 17f),
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
