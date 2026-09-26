// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/modern-tv.svg. Do not edit.
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

public val Iconoir.Regular.ModernTv: ImageVector
    get() = moderntvVector.value

private object moderntvVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/modern-tv", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7f, 21f),
                PathNode.LineTo(17f, 21f),
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
                PathNode.MoveTo(2f, 16.4f),
                PathNode.VerticalTo(3.6f),
                PathNode.CurveTo(2f, 3.26863f, 2.26863f, 3f, 2.6f, 3f),
                PathNode.HorizontalTo(21.4f),
                PathNode.CurveTo(21.7314f, 3f, 22f, 3.26863f, 22f, 3.6f),
                PathNode.VerticalTo(16.4f),
                PathNode.CurveTo(22f, 16.7314f, 21.7314f, 17f, 21.4f, 17f),
                PathNode.HorizontalTo(2.6f),
                PathNode.CurveTo(2.26863f, 17f, 2f, 16.7314f, 2f, 16.4f),
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
