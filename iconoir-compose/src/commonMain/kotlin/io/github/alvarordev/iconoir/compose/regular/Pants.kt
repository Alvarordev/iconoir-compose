// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/pants.svg. Do not edit.
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

public val Iconoir.Regular.Pants: ImageVector
    get() = pantsVector.value

private object pantsVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/pants", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 19f),
                PathNode.HorizontalTo(16.4363f),
                PathNode.CurveTo(16.7532f, 19f, 17.0154f, 18.7536f, 17.0352f, 18.4374f),
                PathNode.LineTo(17.9602f, 3.63743f),
                PathNode.CurveTo(17.9817f, 3.29201f, 17.7074f, 3f, 17.3613f, 3f),
                PathNode.HorizontalTo(6.63426f),
                PathNode.CurveTo(6.28981f, 3f, 6.01608f, 3.28936f, 6.03518f, 3.63328f),
                PathNode.LineTo(6.96852f, 20.4333f),
                PathNode.CurveTo(6.98618f, 20.7512f, 7.24915f, 21f, 7.56759f, 21f),
                PathNode.HorizontalTo(11.4f),
                PathNode.CurveTo(11.7314f, 21f, 12f, 20.7314f, 12f, 20.4f),
                PathNode.VerticalTo(8f),
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
