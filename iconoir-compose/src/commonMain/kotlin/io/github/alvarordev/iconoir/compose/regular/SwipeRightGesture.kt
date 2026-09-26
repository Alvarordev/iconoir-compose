// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/swipe-right-gesture.svg. Do not edit.
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

public val Iconoir.Regular.SwipeRightGesture: ImageVector
    get() = swiperightgestureVector.value

private object swiperightgestureVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/swipe-right-gesture", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(14f, 12f),
                PathNode.CurveTo(14f, 15.3137f, 11.3137f, 18f, 8f, 18f),
                PathNode.CurveTo(4.68629f, 18f, 2f, 15.3137f, 2f, 12f),
                PathNode.CurveTo(2f, 8.68629f, 4.68629f, 6f, 8f, 6f),
                PathNode.CurveTo(11.3137f, 6f, 14f, 8.68629f, 14f, 12f),
                PathNode.Close,
                PathNode.MoveTo(14f, 12f),
                PathNode.HorizontalTo(22f),
                PathNode.MoveTo(22f, 12f),
                PathNode.LineTo(19f, 9f),
                PathNode.MoveTo(22f, 12f),
                PathNode.LineTo(19f, 15f),
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
