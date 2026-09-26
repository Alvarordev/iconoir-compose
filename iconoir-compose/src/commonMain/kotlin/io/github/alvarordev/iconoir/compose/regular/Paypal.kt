// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/paypal.svg. Do not edit.
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

public val Iconoir.Regular.Paypal: ImageVector
    get() = paypalVector.value

private object paypalVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/paypal", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 17.5f),
                PathNode.LineTo(6f, 3f),
                PathNode.LineTo(13f, 3f),
                PathNode.CurveTo(19f, 3f, 19f, 12f, 13f, 12f),
                PathNode.HorizontalTo(8.7f),
                PathNode.LineTo(7.5f, 17.5f),
                PathNode.HorizontalTo(3f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(6.80005f, 21f),
                PathNode.LineTo(9.80005f, 6.5f),
                PathNode.LineTo(16.8f, 6.5f),
                PathNode.CurveTo(22.8f, 6.5f, 22.8f, 15.5f, 16.8f, 15.5f),
                PathNode.HorizontalTo(12.5f),
                PathNode.LineTo(11.3f, 21f),
                PathNode.HorizontalTo(6.80005f),
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
