// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/rhombus.svg. Do not edit.
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

public val Iconoir.Regular.Rhombus: ImageVector
    get() = rhombusVector.value

private object rhombusVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/rhombus", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.5757f, 1.42426f),
                PathNode.CurveTo(11.81f, 1.18995f, 12.1899f, 1.18995f, 12.4243f, 1.42426f),
                PathNode.LineTo(22.5757f, 11.5757f),
                PathNode.CurveTo(22.81f, 11.81f, 22.8101f, 12.1899f, 22.5757f, 12.4243f),
                PathNode.LineTo(12.4243f, 22.5757f),
                PathNode.CurveTo(12.19f, 22.81f, 11.8101f, 22.8101f, 11.5757f, 22.5757f),
                PathNode.LineTo(1.42426f, 12.4243f),
                PathNode.CurveTo(1.18995f, 12.19f, 1.18995f, 11.8101f, 1.42426f, 11.5757f),
                PathNode.LineTo(11.5757f, 1.42426f),
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
