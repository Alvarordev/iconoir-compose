// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/frame-tool.svg. Do not edit.
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

public val Iconoir.Solid.FrameTool: ImageVector
    get() = frametoolVector.value

private object frametoolVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/frame-tool", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(2f, 7f),
                PathNode.HorizontalTo(3f),
                PathNode.MoveTo(2f, 17f),
                PathNode.HorizontalTo(3f),
                PathNode.MoveTo(21f, 7f),
                PathNode.HorizontalTo(22f),
                PathNode.MoveTo(21f, 17f),
                PathNode.HorizontalTo(22f),
                PathNode.MoveTo(17f, 3f),
                PathNode.VerticalTo(2f),
                PathNode.MoveTo(7f, 3f),
                PathNode.VerticalTo(2f),
                PathNode.MoveTo(17f, 22f),
                PathNode.VerticalTo(21f),
                PathNode.MoveTo(7f, 22f),
                PathNode.VerticalTo(21f),
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
                PathNode.MoveTo(6f, 17.4f),
                PathNode.VerticalTo(6.6f),
                PathNode.CurveTo(6f, 6.26863f, 6.26863f, 6f, 6.6f, 6f),
                PathNode.HorizontalTo(17.4f),
                PathNode.CurveTo(17.7314f, 6f, 18f, 6.26863f, 18f, 6.6f),
                PathNode.VerticalTo(17.4f),
                PathNode.CurveTo(18f, 17.7314f, 17.7314f, 18f, 17.4f, 18f),
                PathNode.HorizontalTo(6.6f),
                PathNode.CurveTo(6.26863f, 18f, 6f, 17.7314f, 6f, 17.4f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
