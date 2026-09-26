// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/comp-align-left.svg. Do not edit.
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

public val Iconoir.Solid.CompAlignLeft: ImageVector
    get() = compalignleftVector.value

private object compalignleftVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/comp-align-left", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 22f),
                PathNode.LineTo(3f, 2f),
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
                PathNode.MoveTo(19f, 16f),
                PathNode.HorizontalTo(9f),
                PathNode.CurveTo(7.89543f, 16f, 7f, 15.1046f, 7f, 14f),
                PathNode.VerticalTo(10f),
                PathNode.CurveTo(7f, 8.89543f, 7.89543f, 8f, 9f, 8f),
                PathNode.HorizontalTo(19f),
                PathNode.CurveTo(20.1046f, 8f, 21f, 8.89543f, 21f, 10f),
                PathNode.VerticalTo(14f),
                PathNode.CurveTo(21f, 15.1046f, 20.1046f, 16f, 19f, 16f),
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
