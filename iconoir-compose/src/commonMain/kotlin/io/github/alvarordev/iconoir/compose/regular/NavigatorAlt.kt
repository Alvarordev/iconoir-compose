// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/navigator-alt.svg. Do not edit.
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

public val Iconoir.Regular.NavigatorAlt: ImageVector
    get() = navigatoraltVector.value

private object navigatoraltVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/navigator-alt", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(22f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 2f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 22f, 12f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(13.9304f, 17.869f),
                PathNode.CurveTo(13.6084f, 18.7988f, 12.2931f, 18.798f, 11.9721f, 17.8678f),
                PathNode.LineTo(10.3524f, 13.1739f),
                PathNode.LineTo(5.78287f, 11.2307f),
                PathNode.CurveTo(4.87733f, 10.8456f, 4.96832f, 9.53344f, 5.91837f, 9.27705f),
                PathNode.LineTo(16.1497f, 6.51591f),
                PathNode.CurveTo(16.9526f, 6.29922f, 17.6707f, 7.0693f, 17.3986f, 7.85518f),
                PathNode.LineTo(13.9304f, 17.869f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
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
