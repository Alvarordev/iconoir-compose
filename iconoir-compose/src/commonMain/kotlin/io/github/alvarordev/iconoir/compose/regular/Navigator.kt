// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/navigator.svg. Do not edit.
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

public val Iconoir.Regular.Navigator: ImageVector
    get() = navigatorVector.value

private object navigatorVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/navigator", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
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
                PathNode.MoveTo(17.8733f, 15.4753f),
                PathNode.CurveTo(18.3338f, 16.345f, 17.4362f, 17.3064f, 16.537f, 16.9067f),
                PathNode.LineTo(11.9994f, 14.89f),
                PathNode.LineTo(7.46178f, 16.9067f),
                PathNode.CurveTo(6.56256f, 17.3064f, 5.66499f, 16.345f, 6.12541f, 15.4753f),
                PathNode.LineTo(11.0838f, 6.1095f),
                PathNode.CurveTo(11.4729f, 5.37447f, 12.5259f, 5.37448f, 12.915f, 6.1095f),
                PathNode.LineTo(17.8733f, 15.4753f),
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
