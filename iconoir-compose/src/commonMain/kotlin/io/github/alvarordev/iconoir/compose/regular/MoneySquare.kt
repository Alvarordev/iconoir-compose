// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/money-square.svg. Do not edit.
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

public val Iconoir.Regular.MoneySquare: ImageVector
    get() = moneysquareVector.value

private object moneysquareVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/money-square", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 20.4f),
                PathNode.VerticalTo(3.6f),
                PathNode.CurveTo(3f, 3.26863f, 3.26863f, 3f, 3.6f, 3f),
                PathNode.HorizontalTo(20.4f),
                PathNode.CurveTo(20.7314f, 3f, 21f, 3.26863f, 21f, 3.6f),
                PathNode.VerticalTo(20.4f),
                PathNode.CurveTo(21f, 20.7314f, 20.7314f, 21f, 20.4f, 21f),
                PathNode.HorizontalTo(3.6f),
                PathNode.CurveTo(3.26863f, 21f, 3f, 20.7314f, 3f, 20.4f),
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
                PathNode.MoveTo(15f, 8.5f),
                PathNode.CurveTo(14.315f, 7.81501f, 13.1087f, 7.33855f, 12f, 7.30872f),
                PathNode.MoveTo(9f, 15f),
                PathNode.CurveTo(9.64448f, 15.8593f, 10.8428f, 16.3494f, 12f, 16.391f),
                PathNode.MoveTo(12f, 7.30872f),
                PathNode.CurveTo(10.6809f, 7.27322f, 9.5f, 7.86998f, 9.5f, 9.50001f),
                PathNode.CurveTo(9.5f, 12.5f, 15f, 11f, 15f, 14f),
                PathNode.CurveTo(15f, 15.711f, 13.5362f, 16.4462f, 12f, 16.391f),
                PathNode.MoveTo(12f, 7.30872f),
                PathNode.VerticalTo(5.5f),
                PathNode.MoveTo(12f, 16.391f),
                PathNode.VerticalTo(18.5f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
