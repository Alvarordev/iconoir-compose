// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/google.svg. Do not edit.
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

public val Iconoir.Regular.Google: ImageVector
    get() = googleVector.value

private object googleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/google", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(15.5475f, 8.30327f),
                PathNode.CurveTo(14.6407f, 7.49361f, 13.4329f, 7f, 12.1089f, 7f),
                PathNode.CurveTo(9.28696f, 7f, 7f, 9.23899f, 7f, 12f),
                PathNode.CurveTo(7f, 14.761f, 9.28696f, 17f, 12.1089f, 17f),
                PathNode.CurveTo(15.5781f, 17f, 16.86f, 14.4296f, 17f, 12.4167f),
                PathNode.HorizontalTo(12.841f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(21f, 8f),
                PathNode.VerticalTo(16f),
                PathNode.CurveTo(21f, 18.7614f, 18.7614f, 21f, 16f, 21f),
                PathNode.HorizontalTo(8f),
                PathNode.CurveTo(5.23858f, 21f, 3f, 18.7614f, 3f, 16f),
                PathNode.VerticalTo(8f),
                PathNode.CurveTo(3f, 5.23858f, 5.23858f, 3f, 8f, 3f),
                PathNode.HorizontalTo(16f),
                PathNode.CurveTo(18.7614f, 3f, 21f, 5.23858f, 21f, 8f),
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
        }.build()
    }
}
