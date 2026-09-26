// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/control-slider.svg. Do not edit.
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

public val Iconoir.Regular.ControlSlider: ImageVector
    get() = controlsliderVector.value

private object controlsliderVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/control-slider", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(6.75469f, 17.2828f),
                PathNode.LineTo(5.32612f, 7.28284f),
                PathNode.CurveTo(5.154f, 6.07798f, 6.08892f, 5f, 7.30602f, 5f),
                PathNode.HorizontalTo(10.694f),
                PathNode.CurveTo(11.9111f, 5f, 12.846f, 6.07797f, 12.6739f, 7.28284f),
                PathNode.LineTo(11.2453f, 17.2828f),
                PathNode.CurveTo(11.1046f, 18.2681f, 10.2607f, 19f, 9.26541f, 19f),
                PathNode.HorizontalTo(8.73459f),
                PathNode.CurveTo(7.73929f, 19f, 6.89545f, 18.2681f, 6.75469f, 17.2828f),
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
                PathNode.MoveTo(2f, 12f),
                PathNode.LineTo(6f, 12f),
                PathNode.MoveTo(22f, 12f),
                PathNode.LineTo(12f, 12f),
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
