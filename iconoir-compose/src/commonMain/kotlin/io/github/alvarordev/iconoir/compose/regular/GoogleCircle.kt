// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/google-circle.svg. Do not edit.
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

public val Iconoir.Regular.GoogleCircle: ImageVector
    get() = googlecircleVector.value

private object googlecircleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/google-circle", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
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
                PathNode.MoveTo(12f, 22f),
                PathNode.CurveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f),
                PathNode.CurveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f),
                PathNode.CurveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f),
                PathNode.CurveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f),
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
