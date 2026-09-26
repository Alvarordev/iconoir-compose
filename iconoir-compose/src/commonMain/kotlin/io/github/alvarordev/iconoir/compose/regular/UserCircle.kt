// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/user-circle.svg. Do not edit.
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

public val Iconoir.Regular.UserCircle: ImageVector
    get() = usercircleVector.value

private object usercircleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/user-circle", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7f, 18f),
                PathNode.VerticalTo(17f),
                PathNode.CurveTo(7f, 14.2386f, 9.23858f, 12f, 12f, 12f),
                PathNode.VerticalTo(12f),
                PathNode.CurveTo(14.7614f, 12f, 17f, 14.2386f, 17f, 17f),
                PathNode.VerticalTo(18f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 12f),
                PathNode.CurveTo(13.6569f, 12f, 15f, 10.6569f, 15f, 9f),
                PathNode.CurveTo(15f, 7.34315f, 13.6569f, 6f, 12f, 6f),
                PathNode.CurveTo(10.3431f, 6f, 9f, 7.34315f, 9f, 9f),
                PathNode.CurveTo(9f, 10.6569f, 10.3431f, 12f, 12f, 12f),
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
                PathNode.MoveTo(22f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 2f, 12f),
                PathNode.ArcTo(10f, 10f, 0f, true, false, 22f, 12f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
