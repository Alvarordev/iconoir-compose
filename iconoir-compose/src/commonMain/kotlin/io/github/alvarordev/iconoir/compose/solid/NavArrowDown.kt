// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/nav-arrow-down.svg. Do not edit.
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

public val Iconoir.Solid.NavArrowDown: ImageVector
    get() = navarrowdownVector.value

private object navarrowdownVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/nav-arrow-down", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5.30711f, 8.71299f),
                PathNode.CurveTo(5.4232f, 8.43273f, 5.69668f, 8.25f, 6.00002f, 8.25f),
                PathNode.HorizontalTo(18f),
                PathNode.CurveTo(18.3034f, 8.25f, 18.5768f, 8.43273f, 18.6929f, 8.71299f),
                PathNode.CurveTo(18.809f, 8.99324f, 18.7449f, 9.31583f, 18.5304f, 9.53033f),
                PathNode.LineTo(12.5304f, 15.5303f),
                PathNode.CurveTo(12.2375f, 15.8232f, 11.7626f, 15.8232f, 11.4697f, 15.5303f),
                PathNode.LineTo(5.46969f, 9.53033f),
                PathNode.CurveTo(5.25519f, 9.31583f, 5.19103f, 8.99324f, 5.30711f, 8.71299f),
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
