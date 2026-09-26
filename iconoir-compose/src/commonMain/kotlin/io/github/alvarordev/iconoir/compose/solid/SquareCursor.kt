// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/square-cursor.svg. Do not edit.
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

public val Iconoir.Solid.SquareCursor: ImageVector
    get() = squarecursorVector.value

private object squarecursorVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/square-cursor", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
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
                PathNode.MoveTo(20.879f, 16.9176f),
                PathNode.CurveTo(21.373f, 17.2216f, 21.342f, 17.9606f, 20.834f, 18.0186f),
                PathNode.LineTo(18.267f, 18.3096f),
                PathNode.LineTo(17.116f, 20.6216f),
                PathNode.CurveTo(16.888f, 21.0806f, 16.183f, 20.8556f, 16.066f, 20.2876f),
                PathNode.LineTo(14.811f, 14.1716f),
                PathNode.CurveTo(14.712f, 13.6916f, 15.144f, 13.3896f, 15.561f, 13.6466f),
                PathNode.LineTo(20.879f, 16.9176f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
