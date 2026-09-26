// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/message.svg. Do not edit.
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

public val Iconoir.Regular.Message: ImageVector
    get() = messageVector.value

private object messageVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/message", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 20.2895f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(3f, 3.89543f, 3.89543f, 3f, 5f, 3f),
                PathNode.HorizontalTo(19f),
                PathNode.CurveTo(20.1046f, 3f, 21f, 3.89543f, 21f, 5f),
                PathNode.VerticalTo(15f),
                PathNode.CurveTo(21f, 16.1046f, 20.1046f, 17f, 19f, 17f),
                PathNode.HorizontalTo(7.96125f),
                PathNode.CurveTo(7.35368f, 17f, 6.77906f, 17.2762f, 6.39951f, 17.7506f),
                PathNode.LineTo(4.06852f, 20.6643f),
                PathNode.CurveTo(3.71421f, 21.1072f, 3f, 20.8567f, 3f, 20.2895f),
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
