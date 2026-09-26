// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/label.svg. Do not edit.
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

public val Iconoir.Regular.Label: ImageVector
    get() = labelVector.value

private object labelVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/label", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 17.4f),
                PathNode.VerticalTo(6.6f),
                PathNode.CurveTo(3f, 6.26863f, 3.26863f, 6f, 3.6f, 6f),
                PathNode.HorizontalTo(16.6789f),
                PathNode.CurveTo(16.8795f, 6f, 17.0668f, 6.10026f, 17.1781f, 6.26718f),
                PathNode.LineTo(20.7781f, 11.6672f),
                PathNode.CurveTo(20.9125f, 11.8687f, 20.9125f, 12.1313f, 20.7781f, 12.3328f),
                PathNode.LineTo(17.1781f, 17.7328f),
                PathNode.CurveTo(17.0668f, 17.8997f, 16.8795f, 18f, 16.6789f, 18f),
                PathNode.HorizontalTo(3.6f),
                PathNode.CurveTo(3.26863f, 18f, 3f, 17.7314f, 3f, 17.4f),
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
