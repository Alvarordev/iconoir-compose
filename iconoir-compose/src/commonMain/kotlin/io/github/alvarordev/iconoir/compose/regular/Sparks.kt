// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/sparks.svg. Do not edit.
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

public val Iconoir.Regular.Sparks: ImageVector
    get() = sparksVector.value

private object sparksVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/sparks", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 15f),
                PathNode.CurveTo(12.8747f, 15f, 15f, 12.949f, 15f, 8f),
                PathNode.CurveTo(15f, 12.949f, 17.1104f, 15f, 22f, 15f),
                PathNode.CurveTo(17.1104f, 15f, 15f, 17.1104f, 15f, 22f),
                PathNode.CurveTo(15f, 17.1104f, 12.8747f, 15f, 8f, 15f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(2f, 6.5f),
                PathNode.CurveTo(5.13376f, 6.5f, 6.5f, 5.18153f, 6.5f, 2f),
                PathNode.CurveTo(6.5f, 5.18153f, 7.85669f, 6.5f, 11f, 6.5f),
                PathNode.CurveTo(7.85669f, 6.5f, 6.5f, 7.85669f, 6.5f, 11f),
                PathNode.CurveTo(6.5f, 7.85669f, 5.13376f, 6.5f, 2f, 6.5f),
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
