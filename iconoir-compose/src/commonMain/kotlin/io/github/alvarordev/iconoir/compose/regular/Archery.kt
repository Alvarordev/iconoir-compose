// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/archery.svg. Do not edit.
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

public val Iconoir.Regular.Archery: ImageVector
    get() = archeryVector.value

private object archeryVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/archery", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 12f),
                PathNode.HorizontalTo(17f),
                PathNode.MoveTo(8f, 12f),
                PathNode.LineTo(6f, 10f),
                PathNode.HorizontalTo(2f),
                PathNode.LineTo(4f, 12f),
                PathNode.LineTo(2f, 14f),
                PathNode.HorizontalTo(6f),
                PathNode.LineTo(8f, 12f),
                PathNode.Close,
                PathNode.MoveTo(17f, 12f),
                PathNode.LineTo(15f, 10f),
                PathNode.MoveTo(17f, 12f),
                PathNode.LineTo(15f, 14f),
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
                PathNode.MoveTo(16f, 22.5f),
                PathNode.CurveTo(18.7614f, 22.5f, 21f, 17.799f, 21f, 12f),
                PathNode.CurveTo(21f, 6.20101f, 18.7614f, 1.5f, 16f, 1.5f),
                PathNode.CurveTo(13.2386f, 1.5f, 11f, 6.20101f, 11f, 12f),
                PathNode.CurveTo(11f, 17.799f, 13.2386f, 22.5f, 16f, 22.5f),
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
