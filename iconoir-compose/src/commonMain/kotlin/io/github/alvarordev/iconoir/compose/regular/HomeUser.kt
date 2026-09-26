// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/home-user.svg. Do not edit.
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

public val Iconoir.Regular.HomeUser: ImageVector
    get() = homeuserVector.value

private object homeuserVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/home-user", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(2.5f, 9.5f),
                PathNode.LineTo(12f, 4f),
                PathNode.LineTo(21.5f, 9.5f),
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
                PathNode.MoveTo(7f, 21f),
                PathNode.VerticalTo(20f),
                PathNode.CurveTo(7f, 17.2386f, 9.23858f, 15f, 12f, 15f),
                PathNode.VerticalTo(15f),
                PathNode.CurveTo(14.7614f, 15f, 17f, 17.2386f, 17f, 20f),
                PathNode.VerticalTo(21f),
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
                PathNode.MoveTo(12f, 15f),
                PathNode.CurveTo(13.6569f, 15f, 15f, 13.6569f, 15f, 12f),
                PathNode.CurveTo(15f, 10.3431f, 13.6569f, 9f, 12f, 9f),
                PathNode.CurveTo(10.3431f, 9f, 9f, 10.3431f, 9f, 12f),
                PathNode.CurveTo(9f, 13.6569f, 10.3431f, 15f, 12f, 15f),
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
