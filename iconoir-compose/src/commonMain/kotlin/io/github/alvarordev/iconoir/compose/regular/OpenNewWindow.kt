// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/open-new-window.svg. Do not edit.
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

public val Iconoir.Regular.OpenNewWindow: ImageVector
    get() = opennewwindowVector.value

private object opennewwindowVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/open-new-window", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(21f, 3f),
                PathNode.LineTo(15f, 3f),
                PathNode.MoveTo(21f, 3f),
                PathNode.LineTo(12f, 12f),
                PathNode.MoveTo(21f, 3f),
                PathNode.VerticalTo(9f),
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
                PathNode.MoveTo(21f, 13f),
                PathNode.VerticalTo(19f),
                PathNode.CurveTo(21f, 20.1046f, 20.1046f, 21f, 19f, 21f),
                PathNode.HorizontalTo(5f),
                PathNode.CurveTo(3.89543f, 21f, 3f, 20.1046f, 3f, 19f),
                PathNode.VerticalTo(5f),
                PathNode.CurveTo(3f, 3.89543f, 3.89543f, 3f, 5f, 3f),
                PathNode.HorizontalTo(11f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
