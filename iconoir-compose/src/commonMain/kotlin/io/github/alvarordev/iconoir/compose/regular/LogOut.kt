// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/log-out.svg. Do not edit.
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

public val Iconoir.Regular.LogOut: ImageVector
    get() = logoutVector.value

private object logoutVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/log-out", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 12f),
                PathNode.HorizontalTo(19f),
                PathNode.MoveTo(19f, 12f),
                PathNode.LineTo(16f, 15f),
                PathNode.MoveTo(19f, 12f),
                PathNode.LineTo(16f, 9f),
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
                PathNode.MoveTo(19f, 6f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(19f, 3.89543f, 18.1046f, 3f, 17f, 3f),
                PathNode.HorizontalTo(7f),
                PathNode.CurveTo(5.89543f, 3f, 5f, 3.89543f, 5f, 5f),
                PathNode.VerticalTo(19f),
                PathNode.CurveTo(5f, 20.1046f, 5.89543f, 21f, 7f, 21f),
                PathNode.HorizontalTo(17f),
                PathNode.CurveTo(18.1046f, 21f, 19f, 20.1046f, 19f, 19f),
                PathNode.VerticalTo(18f),
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
