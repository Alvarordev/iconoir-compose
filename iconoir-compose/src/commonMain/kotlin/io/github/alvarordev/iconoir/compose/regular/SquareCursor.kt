// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/square-cursor.svg. Do not edit.
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

public val Iconoir.Regular.SquareCursor: ImageVector
    get() = squarecursorVector.value

private object squarecursorVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/square-cursor", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(21f, 12f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(21f, 3.89543f, 20.1046f, 3f, 19f, 3f),
                PathNode.HorizontalTo(5f),
                PathNode.CurveTo(3.89543f, 3f, 3f, 3.89543f, 3f, 5f),
                PathNode.VerticalTo(19f),
                PathNode.CurveTo(3f, 20.1046f, 3.89543f, 21f, 5f, 21f),
                PathNode.HorizontalTo(12f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20.879f, 16.9171f),
                PathNode.CurveTo(21.373f, 17.2211f, 21.342f, 17.9601f, 20.834f, 18.0181f),
                PathNode.LineTo(18.267f, 18.3091f),
                PathNode.LineTo(17.116f, 20.6211f),
                PathNode.CurveTo(16.888f, 21.0801f, 16.183f, 20.8551f, 16.066f, 20.2871f),
                PathNode.LineTo(14.811f, 14.1711f),
                PathNode.CurveTo(14.712f, 13.6911f, 15.144f, 13.3891f, 15.561f, 13.6461f),
                PathNode.LineTo(20.879f, 16.9171f),
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
