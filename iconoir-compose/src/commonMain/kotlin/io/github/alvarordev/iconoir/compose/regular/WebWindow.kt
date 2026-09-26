// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/web-window.svg. Do not edit.
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

public val Iconoir.Regular.WebWindow: ImageVector
    get() = webwindowVector.value

private object webwindowVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/web-window", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5f, 7f),
                PathNode.HorizontalTo(6f),
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
                PathNode.MoveTo(2f, 17.7143f),
                PathNode.VerticalTo(6.28571f),
                PathNode.CurveTo(2f, 5.02335f, 2.99492f, 4f, 4.22222f, 4f),
                PathNode.HorizontalTo(19.7778f),
                PathNode.CurveTo(21.0051f, 4f, 22f, 5.02335f, 22f, 6.28571f),
                PathNode.VerticalTo(17.7143f),
                PathNode.CurveTo(22f, 18.9767f, 21.0051f, 20f, 19.7778f, 20f),
                PathNode.HorizontalTo(4.22222f),
                PathNode.CurveTo(2.99492f, 20f, 2f, 18.9767f, 2f, 17.7143f),
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
