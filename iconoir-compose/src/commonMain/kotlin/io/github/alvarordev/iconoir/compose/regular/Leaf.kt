// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/leaf.svg. Do not edit.
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

public val Iconoir.Regular.Leaf: ImageVector
    get() = leafVector.value

private object leafVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/leaf", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7f, 21f),
                PathNode.CurveTo(7f, 21f, 7.5f, 16.5f, 11f, 12.5f),
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
                PathNode.MoveTo(19.1297f, 4.24224f),
                PathNode.LineTo(19.7243f, 10.4167f),
                PathNode.CurveTo(20.0984f, 14.3026f, 17.1849f, 17.7626f, 13.2989f, 18.1367f),
                PathNode.CurveTo(9.486f, 18.5039f, 6.03191f, 15.7168f, 5.66477f, 11.9039f),
                PathNode.CurveTo(5.29763f, 8.09099f, 8.09098f, 4.70237f, 11.9039f, 4.33523f),
                PathNode.LineTo(18.475f, 3.70251f),
                PathNode.CurveTo(18.8048f, 3.67074f, 19.098f, 3.91239f, 19.1297f, 4.24224f),
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
