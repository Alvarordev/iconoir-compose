// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/dollar.svg. Do not edit.
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

public val Iconoir.Regular.Dollar: ImageVector
    get() = dollarVector.value

private object dollarVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/dollar", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16.1538f, 7.15382f),
                PathNode.CurveTo(15.2054f, 6.20538f, 13.5351f, 5.54568f, 12f, 5.50437f),
                PathNode.MoveTo(7.84619f, 16.1538f),
                PathNode.CurveTo(8.73855f, 17.3436f, 10.3977f, 18.0222f, 12f, 18.0798f),
                PathNode.MoveTo(12f, 5.50437f),
                PathNode.CurveTo(10.1735f, 5.45522f, 8.5385f, 6.2815f, 8.5385f, 8.53845f),
                PathNode.CurveTo(8.5385f, 12.6923f, 16.1538f, 10.6154f, 16.1538f, 14.7692f),
                PathNode.CurveTo(16.1538f, 17.1383f, 14.127f, 18.1562f, 12f, 18.0798f),
                PathNode.MoveTo(12f, 5.50437f),
                PathNode.VerticalTo(3f),
                PathNode.MoveTo(12f, 18.0798f),
                PathNode.VerticalTo(20.9999f),
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
