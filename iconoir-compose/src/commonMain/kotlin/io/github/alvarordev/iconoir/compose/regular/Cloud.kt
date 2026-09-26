// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/cloud.svg. Do not edit.
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

public val Iconoir.Regular.Cloud: ImageVector
    get() = cloudVector.value

private object cloudVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/cloud", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 4f),
                PathNode.CurveTo(6f, 4f, 6f, 8f, 6f, 10f),
                PathNode.CurveTo(4.33333f, 10f, 1f, 11f, 1f, 15f),
                PathNode.CurveTo(1f, 19f, 4.33333f, 20f, 6f, 20f),
                PathNode.HorizontalTo(18f),
                PathNode.CurveTo(19.6667f, 20f, 23f, 19f, 23f, 15f),
                PathNode.CurveTo(23f, 11f, 19.6667f, 10f, 18f, 10f),
                PathNode.CurveTo(18f, 8f, 18f, 4f, 12f, 4f),
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
