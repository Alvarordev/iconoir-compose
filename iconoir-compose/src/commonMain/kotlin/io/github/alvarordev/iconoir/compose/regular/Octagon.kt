// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/octagon.svg. Do not edit.
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

public val Iconoir.Regular.Octagon: ImageVector
    get() = octagonVector.value

private object octagonVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/octagon", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.7704f, 1.09511f),
                PathNode.CurveTo(11.9174f, 1.03421f, 12.0826f, 1.03421f, 12.2296f, 1.09511f),
                PathNode.LineTo(19.5486f, 4.12672f),
                PathNode.CurveTo(19.6956f, 4.18761f, 19.8124f, 4.30442f, 19.8733f, 4.45144f),
                PathNode.LineTo(22.9049f, 11.7704f),
                PathNode.CurveTo(22.9658f, 11.9174f, 22.9658f, 12.0826f, 22.9049f, 12.2296f),
                PathNode.LineTo(19.8733f, 19.5486f),
                PathNode.CurveTo(19.8124f, 19.6956f, 19.6956f, 19.8124f, 19.5486f, 19.8733f),
                PathNode.LineTo(12.2296f, 22.9049f),
                PathNode.CurveTo(12.0826f, 22.9658f, 11.9174f, 22.9658f, 11.7704f, 22.9049f),
                PathNode.LineTo(4.45144f, 19.8733f),
                PathNode.CurveTo(4.30442f, 19.8124f, 4.18761f, 19.6956f, 4.12672f, 19.5486f),
                PathNode.LineTo(1.09511f, 12.2296f),
                PathNode.CurveTo(1.03421f, 12.0826f, 1.03421f, 11.9174f, 1.09511f, 11.7704f),
                PathNode.LineTo(4.12672f, 4.45144f),
                PathNode.CurveTo(4.18761f, 4.30442f, 4.30442f, 4.18761f, 4.45144f, 4.12672f),
                PathNode.LineTo(11.7704f, 1.09511f),
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
