// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/nav-arrow-right.svg. Do not edit.
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

public val Iconoir.Solid.NavArrowRight: ImageVector
    get() = navarrowrightVector.value

private object navarrowrightVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/nav-arrow-right", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8.71299f, 18.6929f),
                PathNode.CurveTo(8.43273f, 18.5768f, 8.25f, 18.3033f, 8.25f, 18f),
                PathNode.VerticalTo(5.99998f),
                PathNode.CurveTo(8.25f, 5.69663f, 8.43273f, 5.42315f, 8.71299f, 5.30707f),
                PathNode.CurveTo(8.99324f, 5.19098f, 9.31583f, 5.25515f, 9.53033f, 5.46965f),
                PathNode.LineTo(15.5303f, 11.4696f),
                PathNode.CurveTo(15.8232f, 11.7625f, 15.8232f, 12.2374f, 15.5303f, 12.5303f),
                PathNode.LineTo(9.53033f, 18.5303f),
                PathNode.CurveTo(9.31583f, 18.7448f, 8.99324f, 18.809f, 8.71299f, 18.6929f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
