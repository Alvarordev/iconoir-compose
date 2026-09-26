// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/bell.svg. Do not edit.
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

public val Iconoir.Regular.Bell: ImageVector
    get() = bellVector.value

private object bellVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/bell", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(18f, 8.4f),
                PathNode.CurveTo(18f, 6.70261f, 17.3679f, 5.07475f, 16.2426f, 3.87452f),
                PathNode.CurveTo(15.1174f, 2.67428f, 13.5913f, 2f, 12f, 2f),
                PathNode.CurveTo(10.4087f, 2f, 8.88258f, 2.67428f, 7.75736f, 3.87452f),
                PathNode.CurveTo(6.63214f, 5.07475f, 6f, 6.70261f, 6f, 8.4f),
                PathNode.CurveTo(6f, 15.8667f, 3f, 18f, 3f, 18f),
                PathNode.HorizontalTo(21f),
                PathNode.CurveTo(21f, 18f, 18f, 15.8667f, 18f, 8.4f),
                PathNode.Close,
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
                PathNode.MoveTo(13.73f, 21f),
                PathNode.CurveTo(13.5542f, 21.3031f, 13.3019f, 21.5547f, 12.9982f, 21.7295f),
                PathNode.CurveTo(12.6946f, 21.9044f, 12.3504f, 21.9965f, 12f, 21.9965f),
                PathNode.CurveTo(11.6496f, 21.9965f, 11.3054f, 21.9044f, 11.0018f, 21.7295f),
                PathNode.CurveTo(10.6982f, 21.5547f, 10.4458f, 21.3031f, 10.27f, 21f),
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
