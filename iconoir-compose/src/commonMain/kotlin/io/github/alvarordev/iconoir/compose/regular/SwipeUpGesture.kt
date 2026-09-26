// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/swipe-up-gesture.svg. Do not edit.
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

public val Iconoir.Regular.SwipeUpGesture: ImageVector
    get() = swipeupgestureVector.value

private object swipeupgestureVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/swipe-up-gesture", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 10f),
                PathNode.CurveTo(8.68629f, 10f, 6f, 12.6863f, 6f, 16f),
                PathNode.CurveTo(6f, 19.3137f, 8.68629f, 22f, 12f, 22f),
                PathNode.CurveTo(15.3137f, 22f, 18f, 19.3137f, 18f, 16f),
                PathNode.CurveTo(18f, 12.6863f, 15.3137f, 10f, 12f, 10f),
                PathNode.Close,
                PathNode.MoveTo(12f, 10f),
                PathNode.VerticalTo(2f),
                PathNode.MoveTo(12f, 2f),
                PathNode.LineTo(15f, 5f),
                PathNode.MoveTo(12f, 2f),
                PathNode.LineTo(9f, 5f),
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
