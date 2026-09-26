// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/pin.svg. Do not edit.
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

public val Iconoir.Solid.Pin: ImageVector
    get() = pinVector.value

private object pinVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/pin", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(9.5f, 14.5f),
                PathNode.LineTo(3f, 21f),
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
                PathNode.MoveTo(5.00007f, 9.48528f),
                PathNode.LineTo(14.1925f, 18.6777f),
                PathNode.LineTo(15.8895f, 16.9806f),
                PathNode.LineTo(15.4974f, 13.1944f),
                PathNode.LineTo(21.0065f, 8.5211f),
                PathNode.LineTo(15.1568f, 2.67141f),
                PathNode.LineTo(10.4834f, 8.18034f),
                PathNode.LineTo(6.69713f, 7.78823f),
                PathNode.LineTo(5.00007f, 9.48528f),
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
