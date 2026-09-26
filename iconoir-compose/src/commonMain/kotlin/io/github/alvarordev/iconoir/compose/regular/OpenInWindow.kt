// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/open-in-window.svg. Do not edit.
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

public val Iconoir.Regular.OpenInWindow: ImageVector
    get() = openinwindowVector.value

private object openinwindowVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/open-in-window", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 21f),
                PathNode.HorizontalTo(20.4f),
                PathNode.CurveTo(20.7314f, 21f, 21f, 20.7314f, 21f, 20.4f),
                PathNode.VerticalTo(3.6f),
                PathNode.CurveTo(21f, 3.26863f, 20.7314f, 3f, 20.4f, 3f),
                PathNode.HorizontalTo(3.6f),
                PathNode.CurveTo(3.26863f, 3f, 3f, 3.26863f, 3f, 3.6f),
                PathNode.VerticalTo(16f),
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
                PathNode.MoveTo(3.5f, 20.5f),
                PathNode.LineTo(12f, 12f),
                PathNode.MoveTo(12f, 12f),
                PathNode.VerticalTo(16f),
                PathNode.MoveTo(12f, 12f),
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
