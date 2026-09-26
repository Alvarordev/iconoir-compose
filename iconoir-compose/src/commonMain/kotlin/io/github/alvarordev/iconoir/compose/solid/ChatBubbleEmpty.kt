// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/chat-bubble-empty.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Solid.ChatBubbleEmpty: ImageVector
    get() = chatbubbleemptyVector.value

private object chatbubbleemptyVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/chat-bubble-empty", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(1.25f, 12f),
                PathNode.CurveTo(1.25f, 6.06294f, 6.06294f, 1.25f, 12f, 1.25f),
                PathNode.CurveTo(17.937f, 1.25f, 22.75f, 6.06293f, 22.75f, 12f),
                PathNode.CurveTo(22.75f, 17.937f, 17.937f, 22.75f, 12f, 22.75f),
                PathNode.CurveTo(10.1437f, 22.75f, 8.39536f, 22.2788f, 6.87016f, 21.4493f),
                PathNode.LineTo(2.63727f, 22.2373f),
                PathNode.CurveTo(2.39422f, 22.2826f, 2.14448f, 22.2051f, 1.96967f, 22.0303f),
                PathNode.CurveTo(1.79485f, 21.8555f, 1.71742f, 21.6058f, 1.76267f, 21.3627f),
                PathNode.LineTo(2.55076f, 17.1298f),
                PathNode.CurveTo(1.72113f, 15.6046f, 1.25f, 13.8563f, 1.25f, 12f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
