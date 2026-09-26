// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/iconoir.svg. Do not edit.
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

public val Iconoir.Regular.Iconoir: ImageVector
    get() = iconoirVector.value

private object iconoirVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/iconoir", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 16f),
                PathNode.CurveTo(14.2091f, 16f, 16f, 14.2091f, 16f, 12f),
                PathNode.CurveTo(16f, 9.79086f, 14.2091f, 8f, 12f, 8f),
                PathNode.CurveTo(9.79086f, 8f, 8f, 9.79086f, 8f, 12f),
                PathNode.CurveTo(8f, 14.2091f, 9.79086f, 16f, 12f, 16f),
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
                PathNode.MoveTo(19f, 3f),
                PathNode.LineTo(5f, 3f),
                PathNode.CurveTo(3.89543f, 3f, 3f, 3.89543f, 3f, 5f),
                PathNode.LineTo(3f, 19f),
                PathNode.CurveTo(3f, 20.1046f, 3.89543f, 21f, 5f, 21f),
                PathNode.HorizontalTo(19f),
                PathNode.CurveTo(20.1046f, 21f, 21f, 20.1046f, 21f, 19f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(21f, 3.89543f, 20.1046f, 3f, 19f, 3f),
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
