// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/user.svg. Do not edit.
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

public val Iconoir.Regular.User: ImageVector
    get() = userVector.value

private object userVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/user", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5f, 20f),
                PathNode.VerticalTo(19f),
                PathNode.CurveTo(5f, 15.134f, 8.13401f, 12f, 12f, 12f),
                PathNode.VerticalTo(12f),
                PathNode.CurveTo(15.866f, 12f, 19f, 15.134f, 19f, 19f),
                PathNode.VerticalTo(20f),
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
                PathNode.MoveTo(12f, 12f),
                PathNode.CurveTo(14.2091f, 12f, 16f, 10.2091f, 16f, 8f),
                PathNode.CurveTo(16f, 5.79086f, 14.2091f, 4f, 12f, 4f),
                PathNode.CurveTo(9.79086f, 4f, 8f, 5.79086f, 8f, 8f),
                PathNode.CurveTo(8f, 10.2091f, 9.79086f, 12f, 12f, 12f),
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
