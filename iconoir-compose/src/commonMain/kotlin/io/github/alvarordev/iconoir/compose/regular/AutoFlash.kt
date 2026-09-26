// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/auto-flash.svg. Do not edit.
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

public val Iconoir.Regular.AutoFlash: ImageVector
    get() = autoflashVector.value

private object autoflashVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/auto-flash", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 9.5f),
                PathNode.LineTo(16.6923f, 8f),
                PathNode.MoveTo(22f, 9.5f),
                PathNode.LineTo(21.3077f, 8f),
                PathNode.MoveTo(21.3077f, 8f),
                PathNode.LineTo(19f, 3f),
                PathNode.LineTo(16.6923f, 8f),
                PathNode.MoveTo(21.3077f, 8f),
                PathNode.HorizontalTo(16.6923f),
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
                PathNode.MoveTo(13f, 10f),
                PathNode.HorizontalTo(10f),
                PathNode.VerticalTo(3f),
                PathNode.LineTo(2f, 14f),
                PathNode.HorizontalTo(8f),
                PathNode.VerticalTo(21f),
                PathNode.LineTo(14f, 12.75f),
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
