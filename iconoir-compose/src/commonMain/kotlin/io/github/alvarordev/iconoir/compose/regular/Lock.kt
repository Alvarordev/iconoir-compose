// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/lock.svg. Do not edit.
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

public val Iconoir.Regular.Lock: ImageVector
    get() = lockVector.value

private object lockVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/lock", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 12f),
                PathNode.HorizontalTo(17.4f),
                PathNode.CurveTo(17.7314f, 12f, 18f, 12.2686f, 18f, 12.6f),
                PathNode.VerticalTo(19.4f),
                PathNode.CurveTo(18f, 19.7314f, 17.7314f, 20f, 17.4f, 20f),
                PathNode.HorizontalTo(6.6f),
                PathNode.CurveTo(6.26863f, 20f, 6f, 19.7314f, 6f, 19.4f),
                PathNode.VerticalTo(12.6f),
                PathNode.CurveTo(6f, 12.2686f, 6.26863f, 12f, 6.6f, 12f),
                PathNode.HorizontalTo(8f),
                PathNode.MoveTo(16f, 12f),
                PathNode.VerticalTo(8f),
                PathNode.CurveTo(16f, 6.66667f, 15.2f, 4f, 12f, 4f),
                PathNode.CurveTo(8.8f, 4f, 8f, 6.66667f, 8f, 8f),
                PathNode.VerticalTo(12f),
                PathNode.MoveTo(16f, 12f),
                PathNode.HorizontalTo(8f),
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
