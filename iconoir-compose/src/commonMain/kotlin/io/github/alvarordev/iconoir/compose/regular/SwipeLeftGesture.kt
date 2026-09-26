// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/swipe-left-gesture.svg. Do not edit.
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

public val Iconoir.Regular.SwipeLeftGesture: ImageVector
    get() = swipeleftgestureVector.value

private object swipeleftgestureVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/swipe-left-gesture", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(10f, 12f),
                PathNode.CurveTo(10f, 15.3137f, 12.6863f, 18f, 16f, 18f),
                PathNode.CurveTo(19.3137f, 18f, 22f, 15.3137f, 22f, 12f),
                PathNode.CurveTo(22f, 8.68629f, 19.3137f, 6f, 16f, 6f),
                PathNode.CurveTo(12.6863f, 6f, 10f, 8.68629f, 10f, 12f),
                PathNode.Close,
                PathNode.MoveTo(10f, 12f),
                PathNode.HorizontalTo(2f),
                PathNode.MoveTo(2f, 12f),
                PathNode.LineTo(5f, 9f),
                PathNode.MoveTo(2f, 12f),
                PathNode.LineTo(5f, 15f),
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
