// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/heart.svg. Do not edit.
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

public val Iconoir.Regular.Heart: ImageVector
    get() = heartVector.value

private object heartVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/heart", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(22f, 8.86222f),
                PathNode.CurveTo(22f, 10.4087f, 21.4062f, 11.8941f, 20.3458f, 12.9929f),
                PathNode.CurveTo(17.9049f, 15.523f, 15.5374f, 18.1613f, 13.0053f, 20.5997f),
                PathNode.CurveTo(12.4249f, 21.1505f, 11.5042f, 21.1304f, 10.9488f, 20.5547f),
                PathNode.LineTo(3.65376f, 12.9929f),
                PathNode.CurveTo(1.44875f, 10.7072f, 1.44875f, 7.01723f, 3.65376f, 4.73157f),
                PathNode.CurveTo(5.88044f, 2.42345f, 9.50794f, 2.42345f, 11.7346f, 4.73157f),
                PathNode.LineTo(11.9998f, 5.00642f),
                PathNode.LineTo(12.2648f, 4.73173f),
                PathNode.CurveTo(13.3324f, 3.6245f, 14.7864f, 3f, 16.3053f, 3f),
                PathNode.CurveTo(17.8242f, 3f, 19.2781f, 3.62444f, 20.3458f, 4.73157f),
                PathNode.CurveTo(21.4063f, 5.83045f, 22f, 7.31577f, 22f, 8.86222f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
