// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/fire-flame.svg. Do not edit.
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

public val Iconoir.Regular.FireFlame: ImageVector
    get() = fireflameVector.value

private object fireflameVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/fire-flame", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 18f),
                PathNode.CurveTo(8f, 20.4148f, 9.79086f, 21f, 12f, 21f),
                PathNode.CurveTo(15.7587f, 21f, 17f, 18.5f, 14.5f, 13.5f),
                PathNode.CurveTo(11f, 18f, 10.5f, 11f, 11f, 9f),
                PathNode.CurveTo(9.5f, 12f, 8f, 14.8177f, 8f, 18f),
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
                PathNode.MoveTo(12f, 21f),
                PathNode.CurveTo(17.0495f, 21f, 20f, 18.0956f, 20f, 13.125f),
                PathNode.CurveTo(20f, 8.15444f, 12f, 3f, 12f, 3f),
                PathNode.CurveTo(12f, 3f, 4f, 8.15444f, 4f, 13.125f),
                PathNode.CurveTo(4f, 18.0956f, 6.95054f, 21f, 12f, 21f),
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
